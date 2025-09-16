package org.example.demo_data_binding_and_form.exercise_2.controller;

import org.example.demo_data_binding_and_form.exercise_2.model.Song;
import org.example.demo_data_binding_and_form.exercise_2.model.SongForm;
import org.example.demo_data_binding_and_form.exercise_2.service.ISongService;
import org.example.demo_data_binding_and_form.exercise_2.service.SongService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/exercise_2/song")
public class SongController {
    @Value("${file-upload}")
    private String fileUpload;

    private final ISongService songService = new SongService();

    @GetMapping()
    public String index(Model model) {
        List<Song> songs = songService.findAll();
        model.addAttribute("songs", songs);
        return "/exercise_2/index";
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/exercise_2/create");
        modelAndView.addObject("songForm", new SongForm());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView saveSong(@ModelAttribute SongForm songForm) {
        MultipartFile multipartFile = songForm.getFile();
        String fileName = multipartFile.getOriginalFilename();

        if (fileName != null && !(fileName.endsWith(".mp3") || fileName.endsWith(".wav")
                || fileName.endsWith(".ogg") || fileName.endsWith(".m4p"))) {
            ModelAndView mv = new ModelAndView("/exercise_2/create");
            mv.addObject("message", "Chỉ chấp nhận file nhạc (.mp3, .wav, .ogg, .m4p)");
            return mv;
        }

        try {
            FileCopyUtils.copy(songForm.getFile().getBytes(), new File(fileUpload + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Song song = new Song(songForm.getId(), songForm.getTitle(),
                songForm.getArtist(), songForm.getGenre(), fileName);
        songService.save(song);

        ModelAndView modelAndView = new ModelAndView("/exercise_2/create");
        modelAndView.addObject("songForm", songForm);
        modelAndView.addObject("message", "Upload bài hát thành công!");
        return modelAndView;
    }
}

package org.example.demo_data_binding_and_form.exercise_1.controller;

import org.example.demo_data_binding_and_form.exercise_1.DAO.SettingsRepository;
import org.example.demo_data_binding_and_form.exercise_1.model.Settings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping("/exercise_1/settings")
public class SettingsController {
    private SettingsRepository repository = new SettingsRepository();

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("settingsList", repository.findAll());
        return "exercise_1/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("emailSettings", new Settings());
        model.addAttribute("languages", Arrays.asList("English", "Vietnamese", "Japanese", "Chinese"));
        model.addAttribute("pageSizes", Arrays.asList(5, 10, 15, 25, 50, 100));
        return "exercise_1/settings";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("emailSettings") Settings settings) {
        repository.save(settings);
        return "redirect:/exercise_1/settings/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        Settings s = repository.findById(id);
        model.addAttribute("emailSettings", s);
        model.addAttribute("languages", Arrays.asList("English", "Vietnamese", "Japanese", "Chinese"));
        model.addAttribute("pageSizes", Arrays.asList(5, 10, 15, 25, 50, 100));
        return "exercise_1/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("emailSettings") Settings settings) {
        repository.update(settings);
        return "redirect:/exercise_1/settings/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        repository.delete(id);
        return "redirect:/exercise_1/settings/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") int id, Model model) {
        model.addAttribute("settings", repository.findById(id));
        return "exercise_1/result";
    }
}
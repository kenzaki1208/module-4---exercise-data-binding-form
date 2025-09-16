package org.example.demo_data_binding_and_form.exercise_3.controller;

import org.example.demo_data_binding_and_form.exercise_3.model.HealthDeclaration;
import org.example.demo_data_binding_and_form.exercise_3.service.HealthDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exercise_3")
public class HealthFormController {
    private final HealthDeclarationService healthDeclarationService;

    @Autowired
    public HealthFormController(HealthDeclarationService healthDeclarationService) {
        this.healthDeclarationService = healthDeclarationService;
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("declarations", healthDeclarationService.findAll());
        return "exercise_3/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("declaration", new HealthDeclaration());
        return "exercise_3/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("declaration") HealthDeclaration declaration) {
        healthDeclarationService.save(declaration);
        return "redirect:/exercise_3/list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("declaration", healthDeclarationService.findById(id));
        return "exercise_3/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("declaration") HealthDeclaration declaration) {
        healthDeclarationService.update(declaration);
        return "redirect:/exercise_3/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        healthDeclarationService.delete(id);
        return "redirect:/exercise_3/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        HealthDeclaration declaration = healthDeclarationService.findById(id);
        model.addAttribute("declaration", declaration);
        return "exercise_3/view";
    }
}
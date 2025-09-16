package org.example.demo_data_binding_and_form.exercise_3.service;

import org.example.demo_data_binding_and_form.exercise_3.model.HealthDeclaration;

import java.util.List;

public interface HealthDeclarationService {
    void save(HealthDeclaration declaration);
    List<HealthDeclaration> findAll();
    HealthDeclaration findById(Long id);
    void update(HealthDeclaration declaration);
    void delete(Long id);
}

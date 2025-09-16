package org.example.demo_data_binding_and_form.exercise_3.service;

import org.example.demo_data_binding_and_form.exercise_3.DAO.HealthDeclarationDAO;
import org.example.demo_data_binding_and_form.exercise_3.model.HealthDeclaration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthDeclarationServiceImpl implements HealthDeclarationService {

    private final HealthDeclarationDAO healthDeclarationDAO;

    @Autowired
    public HealthDeclarationServiceImpl(HealthDeclarationDAO healthDeclarationDAO) {
        this.healthDeclarationDAO = healthDeclarationDAO;
    }

    @Override
    public void save(HealthDeclaration declaration) {
        healthDeclarationDAO.save(declaration);
    }

    @Override
    public List<HealthDeclaration> findAll() {
        return healthDeclarationDAO.findAll();
    }

    @Override
    public HealthDeclaration findById(Long id) {
        return healthDeclarationDAO.findById(id);
    }

    @Override
    public void update(HealthDeclaration declaration) {
        healthDeclarationDAO.update(declaration);
    }

    @Override
    public void delete(Long id) {
        healthDeclarationDAO.delete(id);
    }
}

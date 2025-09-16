package org.example.demo_data_binding_and_form.exercise_3.DAO;

import org.example.demo_data_binding_and_form.exercise_3.model.HealthDeclaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HealthDeclarationDAO {
    private static final List<HealthDeclaration> declarations = new ArrayList<>();
    private static long idCounter = 1;

    static {
        HealthDeclaration sample = new HealthDeclaration();
        sample.setId((int) idCounter++);
        sample.setFullName("Nguyễn Văn A");
        sample.setBirthYear(1995);
        sample.setGender("Nam");
        sample.setNationality("Việt Nam");
        sample.setIdentityNumber("123456789");
        declarations.add(sample);
    }


    public List<HealthDeclaration> findAll() {
        return declarations;
    }

    public HealthDeclaration findById(Long id) {
        return declarations.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void save(HealthDeclaration declaration) {
        declaration.setId((int) idCounter++);
        declarations.add(declaration);
    }

    public void update(HealthDeclaration declaration) {
        HealthDeclaration old = findById((long) declaration.getId());
        if (old != null) {
            declarations.remove(old);
            declarations.add(declaration);
        }
    }

    public void delete(Long id) {
        HealthDeclaration declaration = findById(id);
        if (declaration != null) {
            declarations.remove(declaration);
        }
    }
}

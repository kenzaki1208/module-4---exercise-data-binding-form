package org.example.demo_data_binding_and_form.exercise_1.DAO;

import org.example.demo_data_binding_and_form.exercise_1.model.Settings;
import java.util.ArrayList;
import java.util.List;

public class SettingsRepository {
    private static List<Settings> settingsList = new ArrayList<>();
    private static int currentId = 1;

    static {
        // dữ liệu mẫu ban đầu
        settingsList.add(new Settings(currentId++, "English", 25, false, "Thor\nKing, Asgard"));
        settingsList.add(new Settings(currentId++, "Vietnamese", 10, true, "Xin chào\nNguyễn Văn A"));
    }

    public List<Settings> findAll() {
        return settingsList;
    }

    public Settings findById(int id) {
        return settingsList.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public void save(Settings settings) {
        settings.setId(currentId++);
        settingsList.add(settings);
    }

    public void update(Settings updated) {
        Settings existing = findById(updated.getId());
        if (existing != null) {
            existing.setLanguage(updated.getLanguage());
            existing.setPageSize(updated.getPageSize());
            existing.setSpamsFilter(updated.isSpamsFilter());
            existing.setSignature(updated.getSignature());
        }
    }

    public void delete(int id) {
        settingsList.removeIf(s -> s.getId() == id);
    }
}

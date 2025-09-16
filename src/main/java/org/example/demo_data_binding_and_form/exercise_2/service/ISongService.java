package org.example.demo_data_binding_and_form.exercise_2.service;

import org.example.demo_data_binding_and_form.exercise_2.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    void save(Song song);
    Song findById(int id);
    void update(int id, Song song);
    void remove(int id);
}

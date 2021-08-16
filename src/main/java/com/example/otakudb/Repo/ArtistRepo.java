package com.example.otakudb.Repo;

import com.example.otakudb.Entity.artiste;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArtistRepo extends CrudRepository<artiste, Integer> {

    @Override
    List<artiste> findAll();
}

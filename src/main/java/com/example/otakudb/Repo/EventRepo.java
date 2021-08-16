package com.example.otakudb.Repo;

import com.example.otakudb.Entity.evenements;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepo extends JpaRepository<evenements, Integer> {

    @Override
    List<evenements> findAll();
}

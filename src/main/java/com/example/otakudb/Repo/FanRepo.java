package com.example.otakudb.Repo;
import com.example.otakudb.Entity.fan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FanRepo extends JpaRepository<fan,Integer> {
    @Override
    List<fan> findAll();
}

package com.example.otakudb.Service;


import com.example.otakudb.Entity.artiste;
import com.example.otakudb.Entity.evenements;
import com.example.otakudb.Repo.EventRepo;
import com.example.otakudb.Repo.FanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepo erepo;

    public List<evenements> getEventList(){
        return (List<evenements>) erepo.findAll();
    }
}

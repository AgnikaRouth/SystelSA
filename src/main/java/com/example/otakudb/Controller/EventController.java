package com.example.otakudb.Controller;


import com.example.otakudb.Entity.evenements;
import com.example.otakudb.Entity.fan;
import com.example.otakudb.Repo.EventRepo;
import com.example.otakudb.Repo.FanRepo;
import com.example.otakudb.Service.EventService;
import com.example.otakudb.Service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3306"})
@RestController
@RequestMapping("/")
public class EventController {

    @Autowired
    private EventService eserv;

    @Autowired
    private EventRepo erepo;

    // display all event list
    @GetMapping("/getEventList")
    public List<evenements> getEventList() {

        //logic to fetch list from database
        List<evenements> events =eserv.getEventList();
        return events;
    }

    // create event rest api
    @PostMapping("/addEvent")
    public evenements createEvent(@RequestBody evenements events) {
        return erepo.save(events);
    }






}

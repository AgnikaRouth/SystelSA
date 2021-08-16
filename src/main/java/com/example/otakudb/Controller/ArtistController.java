package com.example.otakudb.Controller;

import com.example.otakudb.Entity.artiste;
import com.example.otakudb.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3306"})
@RestController
@RequestMapping("/")
public class ArtistController {

    @Autowired
    private ArtistService aserv;


    @GetMapping("/getArtistList")
    @CrossOrigin(origins = "http://localhost:3306")
    public List<artiste> getArtistList() {

        //logic to fetch list from database
        List<artiste> artistes =aserv.getArtistList();


        return artistes;


    }
}

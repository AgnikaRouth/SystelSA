package com.example.otakudb.Service;

import com.example.otakudb.Entity.artiste;
import com.example.otakudb.Entity.fan;
import com.example.otakudb.Repo.ArtistRepo;
import com.example.otakudb.Repo.FanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArtistService {

    @Autowired
    private ArtistRepo arepo;

    public List<artiste> getArtistList(){
        return (List<artiste>) arepo.findAll();
    }
}

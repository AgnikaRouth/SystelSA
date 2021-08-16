package com.example.otakudb.Service;

import com.example.otakudb.Entity.artiste;
import com.example.otakudb.Entity.fan;
import com.example.otakudb.Repo.ArtistRepo;
import com.example.otakudb.Repo.FanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FanService {



    @Autowired
    private FanRepo frepo;
    @Autowired
    private ArtistRepo artistRepo;



    public List<fan> getFanList() {

        return (List<fan>) frepo.findAll();
    }




    //add fan
    public fan saveFanToDB(fan fan)
    {
        return frepo.save(fan); //returns the entity that will be saved
    }

    //display artists
    public List<artiste> getArtistList(){
        return (List<artiste>) artistRepo.findAll();
    }

}

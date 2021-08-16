package com.example.otakudb.Controller;


import com.example.otakudb.Entity.fan;
import com.example.otakudb.Exception.ResourceNotFoundException;
import com.example.otakudb.Repo.FanRepo;
import com.example.otakudb.Service.ArtistService;
import com.example.otakudb.Service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3306"})
@RestController
@RequestMapping("/")
public class FanController {

    @Autowired
    private FanService fanserv;

    @Autowired
    private ArtistService aserv;

    @Autowired
    private FanRepo frepo;

    // display all fan list
    @GetMapping("/getFanList")
    public List<fan> getFanList() {

        //logic to fetch list from database
        List<fan> fans =fanserv.getFanList();
        return fans;
    }


    // create fan rest api
    @PostMapping("/addFan")
    public fan createFan(@RequestBody fan fan) {
        return frepo.save(fan);
    }

    // get fan by id rest api
    @GetMapping("/getFanList/{id}")
    public ResponseEntity<fan> getFanById(@PathVariable Integer id) {
        fan fans = frepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
        return ResponseEntity.ok(fans);
    }

    // update fan rest api

    @PutMapping("/updateFan/{id}")
    public ResponseEntity<fan> updateEmployee(@PathVariable Integer id, @RequestBody fan fanDetails){
        fan fans = frepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        fans.setPrenom(fanDetails.getPrenom());
        fans.setNom(fanDetails.getNom());
        fans.setVille(fanDetails.getVille());
        fans.setPays(fanDetails.getPays());


        fan updatedFan = frepo.save(fans);
        return ResponseEntity.ok(updatedFan);
    }

    // delete fan rest api
    @DeleteMapping("/deleteFan/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer id){
        fan fans = frepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        frepo.delete(fans);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}


package com.dio.backend.controller;

import com.dio.backend.model.Server;
import com.dio.backend.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenax/server")
public class ServerController {

    @Autowired
    ServerService serverService;

    @PostMapping
    public Server createAccessLevel(@RequestBody Server accessLevel){
        return serverService.save(accessLevel);
    }

    @GetMapping
    public List<Server> getAccessLevelList(){
        return serverService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Server>  getAccessLevelById(@PathVariable("id") Long id ) throws Exception {
        return ResponseEntity.ok(serverService.findById(id).orElseThrow(()->new Exception("AccessLevel not found")));
    }

    @PutMapping
    public Server updateAccessLevel(@RequestBody Server accessLevel){
        return serverService.update(accessLevel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Server> deleteDateType(@PathVariable("id") Long id) {
        serverService.deleteAccessLevel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

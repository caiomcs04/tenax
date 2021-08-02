package com.tenax.server.controller;

import com.tenax.server.exception.ResourceNotFoundException;
import com.tenax.server.model.Server;
import com.tenax.server.repository.ServerRepository;

import com.tenax.server.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import  javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    @Autowired
    private ServerService serverService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public List<Server> getAllServers(){
        return serverRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity <Server> getServerById(@PathVariable(value = "id") Long serverId)
            throws ResourceNotFoundException {
        Server server = serverRepository.findById(serverId)
                .orElseThrow(() -> new ResourceNotFoundException("Server not found: " + serverId));
        return ResponseEntity.ok().body(server);
    }

    @CrossOrigin(origins = "*")
    @PostMapping()
    public ResponseEntity<Server> createServer(@Valid @RequestBody Server server){
        return ResponseEntity.ok(serverService.createServer(server));
    }

    @CrossOrigin(origins = "*")
    @PutMapping()
    public ResponseEntity<Server> update(@Valid @RequestBody Server server){
        return ResponseEntity.ok(serverService.update(server));
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public Map < String, Boolean > deleteServer(@PathVariable(value = "id") Long serverId)
            throws ResourceNotFoundException {
        Server server = serverRepository.findById(serverId)
                .orElseThrow(() -> new ResourceNotFoundException("Server not found for this id: " + serverId));

        serverRepository.delete(server);
        Map< String, Boolean > response = new HashMap< >();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}

package com.tenax.server.controller;

import com.tenax.server.exception.ResourceNotFoundException;
import com.tenax.server.model.Server;
import com.tenax.server.repository.ServerRepository;

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
    public Server createServer(@Valid @RequestBody Server server){
        return serverRepository.save(server);
    }

    @PutMapping("/{id}")
    public ResponseEntity <Server> updateServer(@PathVariable(value = "id") Long serverId,
                                              @Valid @RequestBody Server serverDetails) throws ResourceNotFoundException {
        Server server = serverRepository.findById(serverId)
                .orElseThrow(() -> new ResourceNotFoundException("Server not found for this id: " + serverId));

        server.setName(server.getName());
        server.setDescription(server.getDescription());
        final Server updateServer = serverRepository.save(server);
        return ResponseEntity.ok(updateServer);
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

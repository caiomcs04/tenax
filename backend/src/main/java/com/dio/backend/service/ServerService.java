package com.dio.backend.service;

import com.dio.backend.model.Server;
import com.dio.backend.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServerService {

    ServerRepository serverRepository;

    @Autowired
    public ServerService(ServerRepository serverRepository){
        this.serverRepository = serverRepository;
    }

    public Server save(Server accessLevel){
        return serverRepository.save(accessLevel);
    }

    public List<Server> findAll() {
        return serverRepository.findAll();
    }

    public Optional<Server> findById(Long id) {
        return serverRepository.findById(id);
    }

    public Server update(Server accessLevel){
        return serverRepository.save(accessLevel);
    }

    public void deleteAccessLevel(Long id) {
        serverRepository.deleteById(id);
    }

}

package com.tenax.server.service;

import com.tenax.server.exception.BusinessException;
import com.tenax.server.model.Server;
import com.tenax.server.repository.ServerRepository;
import com.tenax.server.util.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ServerService {

    @Autowired
    private ServerRepository repository;

    public Server createServer(Server server) {
        Optional<Server> optionalStock = repository.findByName(server.getName());
        if (optionalStock.isPresent()) {
            throw new BusinessException(MessageUtils.STOCK_ALREADY_EXISTS);
        }

        repository.save(server);
        return server;
    }
}
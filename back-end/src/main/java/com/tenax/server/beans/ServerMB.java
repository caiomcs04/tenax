package com.tenax.server.beans;
import com.tenax.server.model.Server;
import com.tenax.server.repository.ServerRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "serverMB")
@ViewScoped
public class ServerMB {

    @Getter
    @Setter
    private List<Server> servers = new ArrayList<>();

    @Getter
    @Setter
    private Server server;

    @Autowired
    private ServerRepository serverRepository;

    @PostConstruct
    public List<Server> listAll() {
        servers = serverRepository.findAll();
        return servers;
    }

    public Integer getListSize() {
        return servers.size();
    }

    public void setListSize(Integer size) {
        // Método criado para ser utilizado pelo primefaces
    }
}
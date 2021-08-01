package com.tenax.server.repository;

import com.tenax.server.model.Server;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface ServerRepository extends JpaRepository<Server, Long>{
    Optional<Server> findByName(String name);
}

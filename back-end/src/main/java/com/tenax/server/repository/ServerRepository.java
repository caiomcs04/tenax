package com.tenax.server.repository;

import com.tenax.server.model.Server;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ServerRepository extends JpaRepository<Server, Long>{
}

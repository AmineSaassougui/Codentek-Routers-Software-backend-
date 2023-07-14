package com.example.routers.Repositories;

import com.example.routers.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository  extends JpaRepository<Client, Long> {
}

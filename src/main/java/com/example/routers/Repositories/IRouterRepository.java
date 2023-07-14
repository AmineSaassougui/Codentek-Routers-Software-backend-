package com.example.routers.Repositories;

import com.example.routers.Entities.Router;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRouterRepository extends JpaRepository<Router, Long> {
}

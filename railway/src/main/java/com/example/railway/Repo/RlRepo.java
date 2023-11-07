package com.example.railway.Repo;

import com.example.railway.Models.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RlRepo extends JpaRepository<Model, Integer> {
    void deleteByName(String name);

    Model findByName(String name);
}

package com.todocodeacademy.InyeccionDeDependenciasAutowired.controller;

import com.todocodeacademy.InyeccionDeDependenciasAutowired.model.Post;
import com.todocodeacademy.InyeccionDeDependenciasAutowired.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    IPostRepository repo;
    @GetMapping("/posts")
    public List<Post> getAll(){
        return repo.getAll();
    }
}

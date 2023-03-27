package com.todocodeacademy.InyeccionDeDependenciasAutowired.repository;

import com.todocodeacademy.InyeccionDeDependenciasAutowired.model.Post;

import java.util.List;

public interface IPostRepository {

    public List<Post> getAll();
}

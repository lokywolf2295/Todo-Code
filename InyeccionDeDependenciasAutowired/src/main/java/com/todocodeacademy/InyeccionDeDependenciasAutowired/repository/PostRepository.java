package com.todocodeacademy.InyeccionDeDependenciasAutowired.repository;

import com.todocodeacademy.InyeccionDeDependenciasAutowired.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository implements IPostRepository{

    @Override
    public List<Post> getAll() {
        List<Post> listPost = new ArrayList<Post>();
        listPost.add(new Post(1L, "¿Cómo formatear la PC?", "Luisina De Paula"));
        listPost.add(new Post(2L, "¿Cómo mantener la seguridad?", "Matias Loky"));

        return listPost;
    }
}

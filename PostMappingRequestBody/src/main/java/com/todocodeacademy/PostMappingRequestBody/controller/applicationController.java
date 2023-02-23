package com.todocodeacademy.PostMappingRequestBody.controller;

import com.todocodeacademy.PostMappingRequestBody.Client;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class applicationController {

    @PostMapping("/client")
    public void newClient(@RequestBody Client client){
        System.out.println("Client Created Successfully");
        System.out.println("Name: " + client.getName());
        System.out.println("Last Name: " + client.getLastName());
    }
}

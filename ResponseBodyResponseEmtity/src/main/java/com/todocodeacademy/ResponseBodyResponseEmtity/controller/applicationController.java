package com.todocodeacademy.ResponseBodyResponseEmtity.controller;


import com.todocodeacademy.ResponseBodyResponseEmtity.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class applicationController {

    @GetMapping("/client/bring")
    @ResponseBody
    public List<Client> bringClients(){

        List<Client> listClients = new ArrayList<Client>();
        listClients.add(new Client(1L,"Lionel","Messi"));
        listClients.add(new Client(2L,"Cristiano","Ronaldo"));
        listClients.add(new Client(3L,"Julian","Alvarez"));

        return listClients;
    }
}

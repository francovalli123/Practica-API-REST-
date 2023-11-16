package com.example.personaservice.controller;


import com.example.personaservice.model.Client;
import com.example.personaservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api/v1/client") //expone la URI de client
@RestController //expone una API REST
public class ClientController {

    @Autowired
    private ClientService clientService;

    //create, findAll(read), update, delete

    @PostMapping("/") //http://localhost:3306/api/v1/client/
    public ResponseEntity<Client> create(@RequestBody Client client){
        return new ResponseEntity<>(this.clientService.create(client), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Client>> findAll(){
        return new ResponseEntity<>(this.clientService.findAll(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@RequestBody Client clientUpdate,@PathVariable Long id){
        return new ResponseEntity<>(this.clientService.update(clientUpdate, id), HttpStatus.CREATED);
    }

}

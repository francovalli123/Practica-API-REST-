package com.example.personaservice.service;

import com.example.personaservice.model.Client;
import com.example.personaservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.ref.Cleaner;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    //CRUD, en este caso es create, findAll, update, delete
    public Client create(Client newClient){
        return this.clientRepository.save(newClient);
    }

    public List<Client> findAll(){
        return this.clientRepository.findAll();
    }

    public Client update(Client client, Long id){
        Optional<Client> clienteDB = this.clientRepository.findById(id);
        Client c;
        if(clienteDB.isPresent()){
            c = clienteDB.get();
            c.setName(client.getName());
            c.setLastName(client.getLastName());
            c.setDocNumber(client.getDocNumber());
            return this.clientRepository.save(c);
        }else{
            return null;
        }
    }

    public void delete(Long id){
        this.clientRepository.deleteById(id);
    }

}

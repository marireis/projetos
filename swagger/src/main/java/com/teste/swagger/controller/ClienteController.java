package com.teste.swagger.controller;

import com.teste.swagger.entity.Cliente;
import com.teste.swagger.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ClienteController {
    private ClienteRepository clienteRepository;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente cliente){//requestbody é o que vai receber, vem na requisição

        return clienteRepository.save(cliente);
    }

}

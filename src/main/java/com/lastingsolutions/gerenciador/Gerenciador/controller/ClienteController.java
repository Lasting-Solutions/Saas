package com.lastingsolutions.gerenciador.Gerenciador.controller;

import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.Cliente;
import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.ClienteRequestDTO;
import com.lastingsolutions.gerenciador.Gerenciador.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody ClienteRequestDTO body){
        Cliente newCliente = this.clienteService.createCliente(body);
        return ResponseEntity.ok(newCliente);
    }
}

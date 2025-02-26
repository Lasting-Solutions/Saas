package com.lastingsolutions.gerenciador.Gerenciador.controller;

import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.Cliente;
import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.ClienteRequestDTO;
import com.lastingsolutions.gerenciador.Gerenciador.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody ClienteRequestDTO body) {
        Cliente newCliente = clienteService.createCliente(body);
        return ResponseEntity.ok(newCliente);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes() {
        List<Cliente> clientes = clienteService.getAllClientes();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable UUID id) {
        Optional<Cliente> cliente = clienteService.getClienteById(id);
        return cliente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable UUID id, @RequestBody ClienteRequestDTO body) {
        Cliente updatedCliente = clienteService.updateCliente(id, body);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable UUID id) {
        clienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }
}

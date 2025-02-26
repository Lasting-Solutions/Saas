package com.lastingsolutions.gerenciador.Gerenciador.controller;

import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.Fornecedor;
import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.FornecedorRequestDTO;
import com.lastingsolutions.gerenciador.Gerenciador.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<Fornecedor> create(@RequestBody FornecedorRequestDTO body) {
        Fornecedor newFornecedor = fornecedorService.createFornecedor(body);
        return ResponseEntity.ok(newFornecedor);
    }

    @GetMapping
    public ResponseEntity<List<Fornecedor>> getAllFornecedores() {
        List<Fornecedor> fornecedores = fornecedorService.getAllFornecedores();
        return ResponseEntity.ok(fornecedores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> getFornecedorById(@PathVariable UUID id) {
        Optional<Fornecedor> fornecedor = fornecedorService.getFornecedorById(id);
        return fornecedor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fornecedor> updateFornecedor(@PathVariable UUID id, @RequestBody FornecedorRequestDTO body) {
        Fornecedor updatedFornecedor = fornecedorService.updateFornecedor(id, body);
        return ResponseEntity.ok(updatedFornecedor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFornecedor(@PathVariable UUID id) {
        fornecedorService.deleteFornecedor(id);
        return ResponseEntity.noContent().build();
    }
}

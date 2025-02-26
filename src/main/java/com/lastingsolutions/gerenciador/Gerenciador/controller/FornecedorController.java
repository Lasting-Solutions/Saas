package com.lastingsolutions.gerenciador.Gerenciador.controller;

import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.Fornecedor;
import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.FornecedorRequestDTO;
import com.lastingsolutions.gerenciador.Gerenciador.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}

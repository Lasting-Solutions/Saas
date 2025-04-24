package com.lastingsolutions.gerenciador.Gerenciador.service;


import com.lastingsolutions.gerenciador.Gerenciador.domain.produto.Produto;
import com.lastingsolutions.gerenciador.Gerenciador.domain.produto.ProdutoDTO;
import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.Fornecedor;
import com.lastingsolutions.gerenciador.Gerenciador.repositories.ProdutoRepository;
import com.lastingsolutions.gerenciador.Gerenciador.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Produto createProduto(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setNomeProduto(dto.nomeProduto());
        produto.setDescricaoProduto(dto.descricaoProduto());
        produto.setQuantidadeProduto(dto.quantidadeProduto());
        produto.setValorProduto(dto.valorProduto());
        Fornecedor fornecedor = fornecedorRepository.findById(dto.idFornecedorProduto()).orElseThrow();
        produto.setFornecedorProduto(fornecedor);
        return repository.save(produto);
    }

    public List<Produto> getAllProdutos() {
        return repository.findAll();
    }

    public Optional<Produto> getProdutoById(UUID id) {
        return repository.findById(id);
    }

    public Produto updateProduto(UUID id, ProdutoDTO dto) {
        return repository.findById(id).map(produto -> {
            produto.setNomeProduto(dto.nomeProduto());
            produto.setDescricaoProduto(dto.descricaoProduto());
            produto.setQuantidadeProduto(dto.quantidadeProduto());
            produto.setValorProduto(dto.valorProduto());
            Fornecedor fornecedor = fornecedorRepository.findById(dto.idFornecedorProduto()).orElseThrow();
            produto.setFornecedorProduto(fornecedor);
            return repository.save(produto);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado."));
    }

    public void deleteProduto(UUID id) {
        repository.deleteById(id);
    }
}
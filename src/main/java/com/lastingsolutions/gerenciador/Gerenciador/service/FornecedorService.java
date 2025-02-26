package com.lastingsolutions.gerenciador.Gerenciador.service;

import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.Fornecedor;
import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.FornecedorRequestDTO;
import com.lastingsolutions.gerenciador.Gerenciador.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository repository;

    public Fornecedor createFornecedor(FornecedorRequestDTO fornecedorRequestDTO) {
        Fornecedor newFornecedor = new Fornecedor();
        newFornecedor.setRazaoSocialFornecedor(fornecedorRequestDTO.razaoSocialFornecedor());
        newFornecedor.setCnpjFornecedor(fornecedorRequestDTO.cnpjFornecedor());
        newFornecedor.setEmailFornecedor(fornecedorRequestDTO.emailFornecedor());
        newFornecedor.setEnderecoFornecedor(fornecedorRequestDTO.enderecoFornecedor());
        newFornecedor.setSiteFornecedor(fornecedorRequestDTO.siteFornecedor());
        newFornecedor.setTelefoneFornecedor(fornecedorRequestDTO.telefoneFornecedor());
        newFornecedor.setStatusFornecedor(fornecedorRequestDTO.statusFornecedor());
        newFornecedor.setDataCadastroFornecedor(new Date(fornecedorRequestDTO.dataCadastroFornecedor()));

        repository.save(newFornecedor);
        return newFornecedor;
    }
}

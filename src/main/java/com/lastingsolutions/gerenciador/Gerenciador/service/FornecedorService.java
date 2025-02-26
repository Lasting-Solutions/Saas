package com.lastingsolutions.gerenciador.Gerenciador.service;

import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.Fornecedor;
import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.FornecedorRequestDTO;
import com.lastingsolutions.gerenciador.Gerenciador.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

        return repository.save(newFornecedor);
    }

    public List<Fornecedor> getAllFornecedores() {
        return repository.findAll();
    }

    public Optional<Fornecedor> getFornecedorById(UUID id) {
        return repository.findById(id);
    }

    public Fornecedor updateFornecedor(UUID id, FornecedorRequestDTO fornecedorRequestDTO) {
        Optional<Fornecedor> fornecedorOptional = repository.findById(id);

        if (fornecedorOptional.isPresent()) {
            Fornecedor fornecedor = fornecedorOptional.get();
            fornecedor.setRazaoSocialFornecedor(fornecedorRequestDTO.razaoSocialFornecedor());
            fornecedor.setCnpjFornecedor(fornecedorRequestDTO.cnpjFornecedor());
            fornecedor.setEmailFornecedor(fornecedorRequestDTO.emailFornecedor());
            fornecedor.setEnderecoFornecedor(fornecedorRequestDTO.enderecoFornecedor());
            fornecedor.setSiteFornecedor(fornecedorRequestDTO.siteFornecedor());
            fornecedor.setTelefoneFornecedor(fornecedorRequestDTO.telefoneFornecedor());
            fornecedor.setStatusFornecedor(fornecedorRequestDTO.statusFornecedor());
            fornecedor.setDataCadastroFornecedor(new Date(fornecedorRequestDTO.dataCadastroFornecedor()));

            return repository.save(fornecedor);
        } else {
            throw new RuntimeException("Fornecedor não encontrado!");
        }
    }

    public void deleteFornecedor(UUID id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Fornecedor não encontrado!");
        }
    }
}

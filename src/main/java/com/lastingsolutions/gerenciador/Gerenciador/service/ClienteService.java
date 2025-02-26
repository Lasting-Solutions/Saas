package com.lastingsolutions.gerenciador.Gerenciador.service;

import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.Cliente;
import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.ClienteRequestDTO;
import com.lastingsolutions.gerenciador.Gerenciador.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente createCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente newCliente = new Cliente();
        newCliente.setNmCliente(clienteRequestDTO.nmCliente());
        newCliente.setCpfCliente(clienteRequestDTO.cpfCliente());
        newCliente.setEmailCliente(clienteRequestDTO.emailCliente());
        newCliente.setEnderecoCliente(clienteRequestDTO.enderecoCliente());
        newCliente.setTelefoneCliente(clienteRequestDTO.telefoneCliente());
        newCliente.setStatusCliente(true);
        newCliente.setDataCadastroCliente(new Date(clienteRequestDTO.dataCadastroCliente()));
        return repository.save(newCliente);
    }

    public List<Cliente> getAllClientes() {
        return repository.findAll();
    }

    public Optional<Cliente> getClienteById(UUID id) {
        return repository.findById(id);
    }

    public Cliente updateCliente(UUID id, ClienteRequestDTO clienteRequestDTO) {
        Optional<Cliente> optionalCliente = repository.findById(id);
        if (optionalCliente.isPresent()) {
            Cliente existingCliente = optionalCliente.get();
            existingCliente.setNmCliente(clienteRequestDTO.nmCliente());
            existingCliente.setCpfCliente(clienteRequestDTO.cpfCliente());
            existingCliente.setEmailCliente(clienteRequestDTO.emailCliente());
            existingCliente.setEnderecoCliente(clienteRequestDTO.enderecoCliente());
            existingCliente.setTelefoneCliente(clienteRequestDTO.telefoneCliente());
            existingCliente.setStatusCliente(true);
            existingCliente.setDataCadastroCliente(new Date(clienteRequestDTO.dataCadastroCliente()));
            return repository.save(existingCliente);
        }
        throw new RuntimeException("Cliente não encontrado!");
    }

    public void deleteCliente(UUID id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Cliente não encontrado!");
        }
    }
}

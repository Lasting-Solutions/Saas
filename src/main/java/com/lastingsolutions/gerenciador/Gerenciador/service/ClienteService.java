package com.lastingsolutions.gerenciador.Gerenciador.service;

import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.Cliente;
import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.ClienteRequestDTO;
import com.lastingsolutions.gerenciador.Gerenciador.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
        newCliente.setStatusCliente(clienteRequestDTO.statusCliente());
        newCliente.setDataCadastroCliente(new Date(clienteRequestDTO.dataCadastroCliente()));
        repository.save(newCliente);
        return newCliente;
    }
}

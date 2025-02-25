package com.lastingsolutions.gerenciador.Gerenciador.domain.cliente;

public record ClienteRequestDTO(String nmCliente, String cpfCliente, String emailCliente, String enderecoCliente, Long telefoneCliente, Long dataCadastroCliente) {
}

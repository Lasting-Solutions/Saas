package com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor;

public record FornecedorRequestDTO(String razaoSocialFornecedor, String cnpjFornecedor, String emailFornecedor, String enderecoFornecedor, String siteFornecedor, Long telefoneFornecedor,Boolean statusFornecedor, Long dataCadastroFornecedor) {
}

package com.lastingsolutions.gerenciador.Gerenciador.domain.produto;

import java.util.UUID;

public record ProdutoDTO(
        String nomeProduto,
        String descricaoProduto,
        Integer quantidadeProduto,
        Double valorProduto,
        UUID idFornecedorProduto
) {
}
package com.lastingsolutions.gerenciador.Gerenciador.domain.produto;

import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.Fornecedor;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "produto")
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private UUID idProduto;

    private String nomeProduto;

    private String descricaoProduto;

    private Integer quantidadeProduto;

    private Double valorProduto;

    @ManyToOne
    @JoinColumn(name = "idFornecedorProduto")
    private Fornecedor fornecedorProduto;
}

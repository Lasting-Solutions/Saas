package com.lastingsolutions.gerenciador.Gerenciador.domain.itemServico;

import com.lastingsolutions.gerenciador.Gerenciador.domain.produto.Produto;
import com.lastingsolutions.gerenciador.Gerenciador.domain.servico.Servico;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "itemServico")
@Entity
public class ItemServico {
    @Id
    @GeneratedValue
    private UUID idItemServico;

    private Integer quantidadeItemServico;

    private Double valorUnitarioItemServico;

    private Double valorTotalItemServico;

    @ManyToOne
    @JoinColumn(name = "idServico")
    private Servico servico;

    @OneToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;
}

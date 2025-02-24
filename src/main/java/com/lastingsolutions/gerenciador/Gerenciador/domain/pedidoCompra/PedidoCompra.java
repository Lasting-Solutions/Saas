package com.lastingsolutions.gerenciador.Gerenciador.domain.pedidoCompra;

import com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor.Fornecedor;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Table(name = "pedidoCompra")
@Entity
public class PedidoCompra {
    @Id
    @GeneratedValue
    private UUID idPedidoCompra;

    private Date dataPedidoCompra;

    private Integer totalPedidoCompra;

    private Boolean statusPedidoCompra;

    @ManyToOne
    @JoinColumn(name = "idFornecedorPedidoCompra")
    private Fornecedor fornecedorPedido;
}

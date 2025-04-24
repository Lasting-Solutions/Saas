package com.lastingsolutions.gerenciador.Gerenciador.domain.itemPedidoCompra;

import com.lastingsolutions.gerenciador.Gerenciador.domain.pedidoCompra.PedidoCompra;
import com.lastingsolutions.gerenciador.Gerenciador.domain.produto.Produto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "item_pedido_compra")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedidoCompra {
    @Id
    @GeneratedValue
    private UUID idItemPedidoCompra;

    private Integer quantidadeItemPedidoCompra;

    private Double precoUnitarioItemPedidoCompra;

    private Double valorItemPedidoCompra;

    @ManyToOne
    @JoinColumn(name = "idPedidoCompra")
    private PedidoCompra pedidoCompra;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;
}

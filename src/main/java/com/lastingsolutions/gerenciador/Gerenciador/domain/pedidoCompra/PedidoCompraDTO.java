package com.lastingsolutions.gerenciador.Gerenciador.domain.pedidoCompra;
import java.util.Date;
import java.util.UUID;

public record PedidoCompraDTO(UUID idPedidoCompra, Date dataPedidoCompra, Integer totalPedidoCompra, Boolean statusPedidoCompra, UUID idFornecedor) {
}
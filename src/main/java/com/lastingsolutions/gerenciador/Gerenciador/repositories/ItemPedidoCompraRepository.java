package com.lastingsolutions.gerenciador.Gerenciador.repositories;

import com.lastingsolutions.gerenciador.Gerenciador.domain.itemPedidoCompra.ItemPedidoCompra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemPedidoCompraRepository extends JpaRepository<ItemPedidoCompra, UUID> {
}

package com.lastingsolutions.gerenciador.Gerenciador.repositories;

import com.lastingsolutions.gerenciador.Gerenciador.domain.pedidoCompra.PedidoCompra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoCompraRepository extends JpaRepository<PedidoCompra, UUID> {
}

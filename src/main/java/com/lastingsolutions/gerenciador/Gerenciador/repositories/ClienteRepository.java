package com.lastingsolutions.gerenciador.Gerenciador.repositories;

import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}

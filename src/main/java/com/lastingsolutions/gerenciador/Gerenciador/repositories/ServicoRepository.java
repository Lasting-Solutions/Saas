package com.lastingsolutions.gerenciador.Gerenciador.repositories;

import com.lastingsolutions.gerenciador.Gerenciador.domain.servico.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServicoRepository extends JpaRepository<Servico, UUID> {
}

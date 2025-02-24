package com.lastingsolutions.gerenciador.Gerenciador.repositories;

import com.lastingsolutions.gerenciador.Gerenciador.domain.itemServico.ItemServico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemServicoRepository extends JpaRepository<ItemServico, UUID> {
}

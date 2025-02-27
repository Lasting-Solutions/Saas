package com.lastingsolutions.gerenciador.Gerenciador.repositories;

import com.lastingsolutions.gerenciador.Gerenciador.domain.usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

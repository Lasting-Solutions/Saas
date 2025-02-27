package com.lastingsolutions.gerenciador.Gerenciador.domain.usuarios;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private UUID idUsuario;

    private String nmUsuario;

    private String emailUsuario;

    private Long telefoneUsuario;

    private Boolean statusUsuario;

    private Date dataCadastroUsuario;
}

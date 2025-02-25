package com.lastingsolutions.gerenciador.Gerenciador.domain.cliente;

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

@Table(name = "cliente")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue
    private UUID idCliente;

    private String nmCliente;

    private String cpfCliente;

    private String emailCliente;

    private String enderecoCliente;

    private Long telefoneCliente;

    private Boolean statusCliente;

    private Date dataCadastroCliente;

}

package com.lastingsolutions.gerenciador.Gerenciador.domain.servico;

import com.lastingsolutions.gerenciador.Gerenciador.domain.cliente.Cliente;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Table(name = "servico")
@Entity
public class Servico {
    @Id
    @GeneratedValue
    private UUID idServico;

    private String descricaoServico;

    private Double valorServico;

    private Boolean statusServico;

    private Date dataServico;

    @ManyToOne
    @JoinColumn(name = "idClienteServico")
    private Cliente cliente;
}

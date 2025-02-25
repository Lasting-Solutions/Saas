package com.lastingsolutions.gerenciador.Gerenciador.domain.fornecedor;

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

@Table(name = "fornecedor")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor {

    @Id
    @GeneratedValue
    private UUID idFornecedor;

    private String razaoSocialFornecedor;

    private String cnpjFornecedor;

    private String emailFornecedor;

    private String enderecoFornecedor;

    private String siteFornecedor;

    private Long telefoneFornecedor;

    private Boolean statusFornecedor;

    private Date dataCadastroFornecedor;
}

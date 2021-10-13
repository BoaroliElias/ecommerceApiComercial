package br.senac.ecommerceApiComercial.cliente;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "CLIENTE")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O campo nome deve deve ser preenchido")
    @Column(name = "NOME_COMPLETO")
    @Size(max = 150, min = 1, message = "O nome deve conter entre 1 e 150 caracteres")
    private String NomeCompleto;

    @NotNull(message = "o ")
    private String Usuario;

    private String password;

    private LocalDate dataNascimento;

//    private Contato contato;

    public enum Status{
        ATIVO,
        INATIVO
    }

}

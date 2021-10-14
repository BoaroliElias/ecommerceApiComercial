package br.senac.ecommerceApiComercial.cliente;


import br.senac.ecommerceApiComercial.Contato.Contatos;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
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

    @NotNull(message = "O usuário deve ser preenchido ")
    @Column(name = "USUARIO")
    @Size(min = 1, max = 50, message = "O usuário deve conter entre 1 e 50 caracteres")
    private String Usuario;

    @NotNull(message = "A senha deve ser preenchida")
    @Column(name = "SENHA")
    @Size(min = 1, max = 8, message = "A senha deve conter entre 1 e 8 caracteres")
    private String senha;

    @NotNull
    @NotEmpty
    @Column(name = "DT_NASCIMENTO")
    private LocalDate dataNascimento;

//    // verifiacar anotações de ralcionamento
//    @JoinColumn
//    @ManyToOne
//    private Contatos contato;

    public enum Status{
        ATIVO,
        INATIVO
    }

}

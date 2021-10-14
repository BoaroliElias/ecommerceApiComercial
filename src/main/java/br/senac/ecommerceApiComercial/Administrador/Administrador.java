package br.senac.ecommerceApiComercial.Administrador;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "CATEGORIA")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 100, message = "O usuário deve conter entre 1 e 100 caracteres")
    @Column(name = "USUARIO")
    private String usuario;

    //verificar criptografia
    @NotNull
    @Size(min = 1, max = 8, message = "A mensagem deve conter entre 1 e 8 caracteres")
    @Column(name = "SENHA")
    private String senha;

    // verificar oq é permissão
    @NotNull
    private String permissão;

    @NotNull
    @Size(min = 1, max = 50, message = "O email deve conter entre 1 e 50 caracteres")
    @Column(name = "EMAIL")
    private String email;
}

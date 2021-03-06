package br.senac.ecommerceApiComercial.Contato;

import br.senac.ecommerceApiComercial.cliente.Clientes;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity(name = "CONTATO")
public class Contatos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //verificar relacionamento
    @NotNull
    @OneToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;

    @NotNull(message = "O email deve ser preenchido")
    @Size(min = 1, max = 50, message = "o emial deve conter entre 1 e 50 caracteres")
    @Column(name = "EMAIL")
    private String email;

    @NotNull(message = "O telefone deve ser preenchido")
    @Size(min = 1, max = 15)
    @Column(name = "TELEFONE")
    private Integer telefone;

    @Size(min = 1, max = 250, message = "A observação deve conter entre 1 e 250 caracteres")
    @Column(name = "OBS")
    private String obs;

    // verificar o atributo recovery
    public enum Recuperacao{
        Email,
        Telefone
    }

    public enum Tipo{

    }

}

package br.senac.ecommerceApiComercial.Endereco;

import br.senac.ecommerceApiComercial.cliente.Clientes;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity(name = "ENDERECO")
public class Enderecos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // verificar relacionamento
    @NotNull
    @OneToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Clientes cliente;

    @NotNull(message = "A cidade deve ser preenchida")
    @Size(min = 1, max = 30, message = "A cidade deve conter entre 1 e 30 caracteres")
    @Column(name = "CIDADE")
    private String Cidade;

    @NotNull(message = "O CEP deve ser preenchido")
    @Size(min = 1, max = 8, message = "O CEP deve conter entre 1 e 8 caracteres")
    @Column(name = "CEP")
    private Integer CEP;

    @NotNull(message = "O logradouro deve ser preenchido")
    @Size(min = 1, max = 50)
    @Column(name = "LOGRADOURO")
    private String Logradouro;

    @Size(min = 1, max = 10, message = "O numero da residência deve conter entre 1 e 10 caracteres" )
    @Column(name = "NUMERO_CASA")
    private Integer numeroCasa;

    @Size(min = 1, max = 50, message = "O complemento deve conter entre 1 e 50 caracteres")
    @Column(name = "COMPLEMENTO")
    private String complemento;

    public enum Tipo{
        Entrega,
        Cobranca
    }

    public enum Estado{
        AC,
        AL,
        AP,
        AM,
        BA,
        CE,
        DF,
        ES,
        GO,
        MA,
        MT,
        MS,
        MG,
        PA,
        PB,
        PR,
        PE,
        PI,
        RJ,
        RN,
        RS,
        RO,
        RR,
        SC,
        SP,
        SE,
        TO
    }


}

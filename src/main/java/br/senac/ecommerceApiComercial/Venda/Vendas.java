package br.senac.ecommerceApiComercial.Venda;

import br.senac.ecommerceApiComercial.Endereco.Enderecos;
import br.senac.ecommerceApiComercial.cliente.Clientes;
import lombok.*;
import org.codehaus.plexus.classworlds.strategy.Strategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity(name = "VENDA")
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @Column(name = "CLIENTE")
    private Clientes cliente;

    @NotNull
    @OneToOne
    @Column(name = "ENDERECO")
    private Enderecos endereco;

    @NotNull
    @Column(name = "DATA_EMISSAO")
    private LocalDate dataEmissao;

    @NotNull
    @Size(min = 1, max = 250, message = "A observação deve conter entre 1 e 250 caracteres")
    @Column(name = "OBS")
    private String obs;

}

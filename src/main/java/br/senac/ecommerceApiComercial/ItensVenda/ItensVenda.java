package br.senac.ecommerceApiComercial.ItensVenda;

import br.senac.ecommerceApiComercial.Venda.Vendas;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "ITENS_VENDA")
public class ItensVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // veifficar relacionamento
//    @JoinColumn
//    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Vendas.class)
//    @Column(name = "ID_VENDA")
//    private Vendas venda;

    //  como trazer o idProduto do outro microserviço

    @NotNull
    @Column(name = "VLR_VENDA")
    @Size(min = 1, max = 16, message = " O valor deve conter entre 1 e 16 caracteres")
    private Double vlrVenda;

    @NotNull
    @Column(name = "QTD_VENDA")
    @Size(min = 1, max = 16, message = "A quantidade deve conter entre 1 e 16 caracteres")
    private Double qtdVenda;

    @Size(min = 1, max =250)
    @Column(name = "OBS")
    private String obs;

}

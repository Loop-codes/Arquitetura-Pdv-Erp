package backend.src.main.java.pdv.domain;

import backend.src.main.java.pdv.domain.NotaEntrada;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_item_entrada")
public class ItemEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nota_entrada_id", nullable = false)
    private NotaEntrada notaEntrada;

    @Column(name = "produto_id", nullable = false)
    private Long produtoId;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorUnitario;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotalItem;
}
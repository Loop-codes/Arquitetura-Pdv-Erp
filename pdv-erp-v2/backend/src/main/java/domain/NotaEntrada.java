package com.loopcodes.pdv.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_nota_entrada")
public class NotaEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String numeroNota;

    @Column(nullable = false)
    private LocalDateTime dataEmissao;

    @Column(nullable = false)
    private LocalDateTime dataEntrada = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "fornecedor_id", nullable = false)
    private Fornecedor fornecedor;

    @OneToMany(mappedBy = "notaEntrada", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemEntrada> itens = new ArrayList<>();

    private BigDecimal valorTotalDaNota;
}
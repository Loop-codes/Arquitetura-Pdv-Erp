package backend.src.main.java.pdv.domain;

import backend.src.main.java.pdv.domain.NotaEntrada;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 18)
    private String cnpj;

    @Column(nullable = false, length = 100)
    private String razaoSocial;

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    @OneToMany(mappedBy = "fornecedor")
    private List<NotaEntrada> notas = new ArrayList<>();
}
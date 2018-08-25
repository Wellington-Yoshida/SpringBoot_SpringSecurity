package br.com.sistemaAtividade.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Atividade> listaAtividade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atividade> getListaAtividade() {
        return listaAtividade;
    }

    public void setListaAtividade(List<Atividade> listaAtividade) {
        this.listaAtividade = listaAtividade;
    }
}

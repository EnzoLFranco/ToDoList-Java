package com.enzolfcode.todolist.model;

import jakarta.persistence.*;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Date;

@Entity
@Table (name = "tasks")
@ToString
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Date prazoFinal;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false, updatable = false)
    private Date dataCriacao;

    @UpdateTimestamp
    @Column(name = "data_atualizacao")
    private Date data_atualizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getPrazoFinal() {
        return prazoFinal;
    }

    public void setPrazoFinal(Date prazoFinal) {
        this.prazoFinal = prazoFinal;
    }

}

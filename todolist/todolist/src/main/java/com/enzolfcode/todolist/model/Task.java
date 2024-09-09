package com.enzolfcode.todolist.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table (name = "tasks")
@Getter
@Setter
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

}

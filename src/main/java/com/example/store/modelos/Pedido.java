package com.example.store.modelos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer Id;
    private LocalDateTime fechayhoraPedido;

    public Pedido() {
    }

    public Pedido(Integer id, LocalDateTime fechayhoraPedido) {
        Id = id;
        this.fechayhoraPedido = fechayhoraPedido;
    }
}

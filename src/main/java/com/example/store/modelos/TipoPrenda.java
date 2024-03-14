package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table (name="TipoPrenda")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer Id;
    private String  Nombre;

    public TipoPrenda() {
    }

    public TipoPrenda(Integer id, String nombre) {
        Id = id;
        Nombre = nombre;
    }
}

package com.example.store.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name="marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String Nombre;
    private String Nit;
    private LocalDate AnoCreacion;

    private String SedePrincipal;


    public Marca() {
    }

    public Marca(Integer id, String nombre, String nit, LocalDate anoCreacion, String sedePrincipal) {
        this.id = id;
        Nombre = nombre;
        Nit = nit;
        AnoCreacion = anoCreacion;
        SedePrincipal = sedePrincipal;
    }
}

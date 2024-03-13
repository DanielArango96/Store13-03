package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer Id;
    private String Nombre;
    private String Referencia;
    private Integer CantidadBodega;
    private Double PrecioUnitario;
    private String Descripcion;
    private String Talla;
    private String Fotografia;
}

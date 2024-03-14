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


    public Producto() {
    }

    public Producto(Integer id, String nombre, String referencia, Integer cantidadBodega, Double precioUnitario, String descripcion, String talla, String fotografia) {
        Id = id;
        Nombre = nombre;
        Referencia = referencia;
        CantidadBodega = cantidadBodega;
        PrecioUnitario = precioUnitario;
        Descripcion = descripcion;
        Talla = talla;
        Fotografia = fotografia;
    }
}

package com.example.store.modelos;


import jakarta.persistence.*;

@Entity
@Table(name="DetalleFactura")
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer Id;
    private Double CostoTotal;
    private Integer CantidadProductos;

    public DetalleFactura() {
    }

    public DetalleFactura(Integer id, Double costoTotal, Integer cantidadProductos) {
        Id = id;
        CostoTotal = costoTotal;
        CantidadProductos = cantidadProductos;
    }
}

package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String Nombres;
    private String Apellido;
    private String Cedula;
    private String Correo;
    private String Telefono;
    private String Direccion;
    private String Genero;
    private String MedioPago;
    private String Pais;
    private String Departamento;
    private String Municipio;
    private String CodigoPostal;
}

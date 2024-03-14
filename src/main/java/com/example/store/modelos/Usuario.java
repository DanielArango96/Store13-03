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


    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String apellido, String cedula, String correo, String telefono, String direccion, String genero, String medioPago, String pais, String departamento, String municipio, String codigoPostal) {
        this.id = id;
        Nombres = nombres;
        Apellido = apellido;
        Cedula = cedula;
        Correo = correo;
        Telefono = telefono;
        Direccion = direccion;
        Genero = genero;
        MedioPago = medioPago;
        Pais = pais;
        Departamento = departamento;
        Municipio = municipio;
        CodigoPostal = codigoPostal;
    }
}

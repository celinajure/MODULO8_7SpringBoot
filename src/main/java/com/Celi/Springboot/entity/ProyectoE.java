
package com.Celi.Springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ProyectoE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private String nombre;
    private String telefono;
    private String email;
    private String domicilio;
   @Column(length=2000)
    private String descripcion;
    //@Temporal(TemporalType.DATE)
    private String inicioFecha;
     //@Temporal(TemporalType.DATE)
    private String finFecha;
    private String tipo;
    private Boolean estaHoy;
    private String imagen1;
    private String imagen2;
    private String imagen3;
    private String imagen4;
    private String imagen5;

    public ProyectoE() {
    }

    public ProyectoE(String numero, String nombre, String telefono, String email, String domicilio, String descripcion, String inicioFecha, String finFecha, String tipo, Boolean estaHoy, String imagen1, String imagen2, String imagen3, String imagen4, String imagen5) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.domicilio = domicilio;
        this.descripcion = descripcion;
        this.inicioFecha = inicioFecha;
        this.finFecha = finFecha;
        this.tipo = tipo;
        this.estaHoy = estaHoy;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.imagen4 = imagen4;
        this.imagen5 = imagen5;
    } 
    
}



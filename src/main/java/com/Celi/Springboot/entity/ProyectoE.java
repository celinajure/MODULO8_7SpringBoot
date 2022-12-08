
package com.Celi.Springboot.entity;

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
    private String inicioFecha;
    private String finFecha;
    private String tipo;
    private String estaHoy;
    private String imagenes;

    public ProyectoE() {
    }

    public ProyectoE(Long id, String numero, String nombre, String telefono, String email, String domicilio, String inicioFecha, String finFecha, String tipo, String estaHoy, String imagenes) {
        this.id = id;
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.domicilio = domicilio;
        this.inicioFecha = inicioFecha;
        this.finFecha = finFecha;
        this.tipo = tipo;
        this.estaHoy = estaHoy;
        this.imagenes = imagenes;
    }
    
    
}




package com.Celi.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EducacionE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    private String nombre;
    private String lugar;
    private String telefono;
    private String email;
    private String domicilio;
    //@Temporal(TemporalType.DATE)
    private String inicioFecha;
   // @Temporal(TemporalType.DATE)
    private String finFecha;
    private String tipo;
    private Boolean estaHoy;

    public EducacionE() {
    }

    public EducacionE(String nombre, String lugar, String telefono, String email, String domicilio, String inicioFecha, String finFecha, String tipo, Boolean estaHoy) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.telefono = telefono;
        this.email = email;
        this.domicilio = domicilio;
        this.inicioFecha = inicioFecha;
        this.finFecha = finFecha;
        this.tipo = tipo;
        this.estaHoy = estaHoy;
    }
    
    
}

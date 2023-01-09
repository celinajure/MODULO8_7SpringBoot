
package com.Celi.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ExperienciaE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String nombre;
    private String telefono;
    private String email;
    private String url;
    //@Temporal(TemporalType.DATE)
    private String inicioFecha;
    //@Temporal(TemporalType.DATE)
    private String  finFecha;
    private String tipo;
    private Boolean estaHoy;

    public ExperienciaE() {
    }

    public ExperienciaE(String nombre, String telefono, String email, String url, String inicioFecha, String finFecha, String tipo, Boolean estaHoy) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.url = url;
        this.inicioFecha = inicioFecha;
        this.finFecha = finFecha;
        this.tipo = tipo;
        this.estaHoy = estaHoy;
    }
    
    
}

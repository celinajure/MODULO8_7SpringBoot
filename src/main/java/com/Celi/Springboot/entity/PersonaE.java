
package com.Celi.Springboot.entity;

import jakarta.persistence.Column;
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
public class PersonaE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imagen1;
    private String imagen2;
    private String imagen3;
    private String imagen4;
    private String nombre;
    private String apellido;
    //@Lob
    //@Size(max=1000)
    @Column(length=1000)
    private String descripcion;
    private String titulo;
    @Temporal(TemporalType.DATE)
    private Date anio;
    private String email;
    private String clave;

    public PersonaE() {
    }

    public PersonaE(String imagen1, String imagen2, String imagen3, String imagen4, String nombre, String apellido, String descripcion, String titulo, Date anio, String email, String clave) {
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.imagen4 = imagen4;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.anio = anio;
        this.email = email;
        this.clave = clave;
    }

    

    
}

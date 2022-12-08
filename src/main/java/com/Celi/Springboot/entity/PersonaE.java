
package com.Celi.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class PersonaE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imagenes;
    private String nombre;
    private String apellido;
    private String descripcion;
    private String titulo;
    private String anio;

    public PersonaE() {
    }

    public PersonaE(Long id, String imagenes, String nombre, String apellido, String descripcion, String titulo, String anio) {
        this.id = id;
        this.imagenes = imagenes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.anio = anio;
    }

    
}

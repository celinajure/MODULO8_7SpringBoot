
package com.Celi.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class HabilidadE {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String habilidad;
    private String porcentaje;

    public HabilidadE(Long id, String habilidad, String porcentaje) {
        this.id = id;
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }

    public HabilidadE() {
    }

    
}

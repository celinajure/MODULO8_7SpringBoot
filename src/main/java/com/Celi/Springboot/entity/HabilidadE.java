
package com.Celi.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class HabilidadE {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    @Size(min=1, max=100)
     //@Min(0)
    //@Max(100)
    private Integer porcentaje;

    public HabilidadE() {
    }

    public HabilidadE(String nombre, Integer porcentaje) {
     
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    

}  

    
    

    


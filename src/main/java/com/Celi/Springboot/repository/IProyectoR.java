
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.ProyectoE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoR  extends JpaRepository<ProyectoE, Long>{
    
}

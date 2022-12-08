
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.HabilidadE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadR extends JpaRepository<HabilidadE, Long>{
    
}

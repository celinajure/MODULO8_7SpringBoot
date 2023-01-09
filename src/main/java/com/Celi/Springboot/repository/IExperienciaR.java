
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.ExperienciaE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaR extends JpaRepository<ExperienciaE, Long>{
   
}

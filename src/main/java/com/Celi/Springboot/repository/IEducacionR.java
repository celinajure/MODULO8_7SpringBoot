
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.EducacionE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionR extends JpaRepository<EducacionE, Long>{

    
   
}

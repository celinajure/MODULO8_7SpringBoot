
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.PersonaE;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaR  extends JpaRepository<PersonaE, Long>{

   public List <PersonaE> findByEmailAndClave(String email, String clave);

   
    
}

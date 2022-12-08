
package com.Celi.Springboot.service;

import com.Celi.Springboot.entity.PersonaE;
import com.Celi.Springboot.repository.IPersonaR;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaS {
    
    @Autowired
   
      IPersonaR ipersonaR;

    
    public List<PersonaE> getPersona() {
        List<PersonaE>  listaPersonas = ipersonaR.findAll();
        return listaPersonas;
    }

   
    public void savePersona(PersonaE per) {
        ipersonaR.save(per);
   }

    
    public void deletePersona(Long id) {
        ipersonaR.deleteById(id);
  }

  
    public PersonaE findPersona(Long id) {
          PersonaE  perso = ipersonaR.findById(id).orElse(null);
          return perso;
   }
    
    /*public void editPersona(PersonaE per) {
        ipersonaR.edit(per);
   }*/
    
}

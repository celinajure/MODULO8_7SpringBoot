
package com.Celi.Springboot.service;

import com.Celi.Springboot.entity.EducacionE;
import com.Celi.Springboot.repository.IEducacionR;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionS {
    @Autowired
   
      IEducacionR ieducacionR;

    
    public List<EducacionE> geteducacion() {
        List<EducacionE>  listaEducaciones = ieducacionR.findAll();
        return listaEducaciones;
    }

   
    public void saveEducacion(EducacionE edu) {
        ieducacionR.save(edu);
   }

    
    public void deleteEducacion(Long id) {
        ieducacionR.deleteById(id);
  }

  
    public EducacionE findPersona(Long id) {
          EducacionE  edu= ieducacionR.findById(id).orElse(null);
          return edu;
   }

    public List<EducacionE> getEducacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

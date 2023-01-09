
package com.Celi.Springboot.service;

import com.Celi.Springboot.entity.ProyectoE;
import com.Celi.Springboot.repository.IProyectoR;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoS {
    
    @Autowired
   
      IProyectoR iproyectoR;

    
    public List<ProyectoE> getProyectos() {
        List<ProyectoE>  listaProyectos = iproyectoR.findAll();
        return listaProyectos;
    }

   
    public void saveProyecto(ProyectoE proye) {
        iproyectoR.save(proye);
   }

    
    public void deleteProyecto(Long id) {
        iproyectoR.deleteById(id);
  }

  
    public ProyectoE findProyecto(Long id) {
          ProyectoE  proye = iproyectoR.findById(id).orElse(null);
          return proye;
   }
    
     public void editProyecto(ProyectoE proye) {
        iproyectoR.save(proye);
   }
}

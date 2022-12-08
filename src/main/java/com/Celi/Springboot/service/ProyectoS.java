
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

    
    public List<ProyectoE> getProyecto() {
        List<ProyectoE>  listaProyectos = iproyectoR.findAll();
        return listaProyectos;
    }

   
    public void saveProyecto(ProyectoE proy) {
        iproyectoR.save(proy);
   }

    
    public void deleteProyecto(Long id) {
        iproyectoR.deleteById(id);
  }

  
    public ProyectoE findProyecto(Long id) {
          ProyectoE  proy = iproyectoR.findById(id).orElse(null);
          return proy;
   }
}

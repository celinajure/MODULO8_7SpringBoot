
package com.Celi.Springboot.service;

import com.Celi.Springboot.entity.RedesE;
import com.Celi.Springboot.repository.IRedesR;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RedesS {
      @Autowired
      IRedesR iredesR;
      
       public List<RedesE> getRedes() {
        List<RedesE>  listaRedes = iredesR.findAll();
        return listaRedes;
    }

   
    public void saveRed(RedesE red) {
        iredesR.save(red);
   }

    
    public void deleteRed(Long id) {
        iredesR.deleteById(id);
  }

  
    public RedesE findRed(Long id) {
          RedesE  red = iredesR.findById(id).orElse(null);
          return red;
   }
    
    public void editRed(RedesE red) {
        iredesR.save(red);
   }
    
}


package com.Celi.Springboot.service;

import com.Celi.Springboot.entity.RedE;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Celi.Springboot.repository.IRedR;

@Service
@Transactional
public class RedS {
      @Autowired
      IRedR iredR;
      
       public List<RedE> getRedes() {
        List<RedE>  listaRedes = iredR.findAll();
        return listaRedes;
    }

   
    public void saveRed(RedE re) {
        iredR.save(re);
   }

    
    public void deleteRed(Long id) {
        iredR.deleteById(id);
  }

  
    public RedE findRed(Long id) {
          RedE  re = iredR.findById(id).orElse(null);
          return re;
   }
    
    public void editRed(RedE re) {
        iredR.save(re);
   }
    
}

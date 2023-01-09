
package com.Celi.Springboot.controller;

import com.Celi.Springboot.entity.RedE;
import com.Celi.Springboot.service.RedS;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("red")//localhost:8080/red/
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RedC {
    
    @Autowired
    RedS redS;

    @GetMapping("/ver")
      @ResponseBody
    public List<RedE> verRedes() {
        return redS.getRedes();
    }
    
    @GetMapping("/ver/{id}")
      @ResponseBody
    public RedE verRed(@PathVariable Long id) {
        return redS.findRed(id);
    }
    
    @PostMapping("/new")
      @ResponseBody
    public ResponseEntity agregarRed(@RequestBody RedE red) {
        redS.saveRed(red);
        return ResponseEntity.ok().body(red);
    }  
    
    @DeleteMapping("/delete/{id}")
      //@ResponseBody
    public ResponseEntity eliminarRed(@PathVariable Long id) {
        redS.deleteRed(id);
          return new ResponseEntity(HttpStatus.OK);
    }
    
    //esta es una prueba de editar
    @PutMapping("/editar/{id}")
      //@ResponseBody
    public ResponseEntity editarRed(@RequestBody RedE red){
        redS.saveRed(red);
         return  new ResponseEntity(HttpStatus.OK);
    }
}


package com.Celi.Springboot.controller;

import com.Celi.Springboot.entity.HabilidadE;
import com.Celi.Springboot.service.HabilidadS;
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

@RequestMapping("habilidad")//localhost:8080/habilidad/
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HabilidadC {   
    @Autowired
    HabilidadS habilidadS;
    
    @GetMapping("/ver")
      @ResponseBody
    public List<HabilidadE> verHabilidades() {
        return habilidadS.getHabilidades();
    } 
    @GetMapping("/ver/{id}")
      @ResponseBody
    public HabilidadE verHabilidad(@PathVariable Long id) {
        return habilidadS.findHabilidad( id);
    }
    @PostMapping("/new")
      @ResponseBody
   public ResponseEntity  agregarHabilidad(@RequestBody HabilidadE habi) {
       habilidadS.saveHabilidad(habi);
         return ResponseEntity.ok().body(habi);
    } 
    @DeleteMapping("/delete/{id}")
      //@ResponseBody
     public ResponseEntity eliminarHabilidad(@PathVariable Long id) {
        habilidadS.deleteHabilidad(id);
       return new ResponseEntity(HttpStatus.OK);
    } 
   //esta es una prueba de editar 
    @PutMapping("/editar/{id}")
      //@ResponseBody
    public ResponseEntity editarHabilidad(@RequestBody HabilidadE habi){
        habilidadS.editHabilidad(habi);
         return  new ResponseEntity(HttpStatus.OK);
    } 
}

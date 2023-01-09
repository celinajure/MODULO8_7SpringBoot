
package com.Celi.Springboot.controller;

import com.Celi.Springboot.entity.EducacionE;
import com.Celi.Springboot.entity.ExperienciaE;
import com.Celi.Springboot.service.ExperienciaS;
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

@RequestMapping("experiencia")//localhost:8080/experiencia/
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ExperienciaC {
    @Autowired
    ExperienciaS experienciaS;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<ExperienciaE> verExperiencias() {
        return experienciaS.getExperiencias();
    }
    @GetMapping("/ver/{id}")
    @ResponseBody
    public ExperienciaE verExperiencia(@PathVariable Long id) {
        return experienciaS.findExperiencia( id);
    }
    @PostMapping("/new")
    @ResponseBody   
     public ResponseEntity agregarExperiencia(@RequestBody ExperienciaE expe) {
        experienciaS.saveExperiencia(expe);
        return ResponseEntity.ok().body(expe);
    }    
        
     
    @DeleteMapping("/delete/{id}")
     // @ResponseBody
     public ResponseEntity eliminarExperiencia(@PathVariable Long id) {
        experienciaS.deleteExperiencia(id);
        return new ResponseEntity(HttpStatus.OK);
    } 
   //esta es una prueba de editar
    @PutMapping("/editar/{id}")
      //@ResponseBody
    public ResponseEntity editarExperiencia(@RequestBody ExperienciaE expe){
        experienciaS.saveExperiencia(expe);
         return  new ResponseEntity(HttpStatus.OK);
    }
    
}

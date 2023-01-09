
package com.Celi.Springboot.controller;

import com.Celi.Springboot.entity.ProyectoE;
import com.Celi.Springboot.service.ProyectoS;
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


@RequestMapping("proyecto")//localhost:8080/proyecto/
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ProyectoC { 
    
    @Autowired
    ProyectoS proyectoS;
    
    @ResponseBody
    @GetMapping("/ver")
    public List<ProyectoE> verProyectos() {
        return proyectoS.getProyectos();
    }  
    
    @GetMapping("/ver/{id}")
      @ResponseBody
    public ProyectoE verProyecto(@PathVariable Long id) {
        return proyectoS.findProyecto( id);
    }
    
    @PostMapping("/new")
      @ResponseBody
    public ResponseEntity agregarProyecto(@RequestBody ProyectoE proye) {
       proyectoS.saveProyecto(proye);
        return ResponseEntity.ok().body(proye);
    } 
    
    @DeleteMapping("/delete/{id}")
      //@ResponseBody
    public ResponseEntity eliminarProyecto(@PathVariable Long id) {
        proyectoS.deleteProyecto(id);
         return new ResponseEntity(HttpStatus.OK);
    } 
    
   //esta es una prueba de editar, por segunda vez
    @PutMapping("/editar/{id}")
      //@ResponseBody
    public ResponseEntity editarProyecto(@RequestBody ProyectoE proye){
        proyectoS.saveProyecto(proye);
         return new ResponseEntity(HttpStatus.OK);
    }   
}

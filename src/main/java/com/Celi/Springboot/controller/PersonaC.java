
package com.Celi.Springboot.controller;

import com.Celi.Springboot.entity.PersonaE;
import com.Celi.Springboot.service.PersonaS;
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

@RequestMapping("persona")//localhost:8080/persona/
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PersonaC {   
    @Autowired
    PersonaS persoS;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<PersonaE> verPersonas() {
        return persoS.getPersonas();
    }
    @GetMapping("/ver/{id}")
    @ResponseBody
    public PersonaE verPersona(@PathVariable Long id) {
        return persoS.findPersona(id);
    }
    
    @PostMapping("/new")
    @ResponseBody
    public ResponseEntity agregarPersona(@RequestBody PersonaE per) {
        persoS.savePersona(per);
       return ResponseEntity.ok().body(per);
    }
    @DeleteMapping("/delete/{id}")
      //@ResponseBody
    public ResponseEntity eliminarPersona(@PathVariable Long id) {
        persoS.deletePersona(id);
         return new ResponseEntity(HttpStatus.OK);
    }
    //esta es una prueba de editar
    @PutMapping("/editar/{id}")
     // @ResponseBody
    public ResponseEntity editarPersona(@RequestBody PersonaE per){
        persoS.editPersona(per);
          return  new ResponseEntity(HttpStatus.OK);
    }    
    
    @PostMapping("/autenticacion/login")
    //@ResponseBody
    public PersonaE loginPersona (@RequestBody PersonaE per){
        return persoS.loginPersona( per.getEmail(), per.getClave());
    }
    
    
}

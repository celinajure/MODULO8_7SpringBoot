
package com.Celi.Springboot.controller;

import com.Celi.Springboot.entity.EducacionE;
import com.Celi.Springboot.entity.ExperienciaE;
import com.Celi.Springboot.entity.HabilidadE;
import com.Celi.Springboot.entity.PersonaE;
import com.Celi.Springboot.entity.ProyectoE;
import com.Celi.Springboot.service.EducacionS;
import com.Celi.Springboot.service.ExperienciaS;
import com.Celi.Springboot.service.HabilidadS;
import com.Celi.Springboot.service.PersonaS;
import com.Celi.Springboot.service.ProyectoS;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
// controller de Persona
    @Autowired
    PersonaS persoS;

    @GetMapping("/ver/persos")
    @ResponseBody
    public List<PersonaE> verPersonas() {
        return persoS.getPersona();
    }

    @PostMapping("/new/perso")
    public String agregarPersona(@RequestBody PersonaE pers) {
        persoS.savePersona(pers);
        return "La PERSONA fue agregada correctamente";
    }

    @DeleteMapping("/delete/perso/{id}")
    public String eliminarPersona(@PathVariable Long id) {
        persoS.deletePersona(id);
        return "La persona fue borrada correctamente";
    }
    //esta es una prueba de editar
    @PutMapping("/editar/perso")
    public void updatePersona(@RequestBody PersonaE per){
        persoS.savePersona(per);
    }
      

    
      //controller de Educacion
    @Autowired
    EducacionS educacionS;

    @GetMapping("/ver/educaciones")
     @ResponseBody
    public List<EducacionE> verEducaciones() {
        return educacionS.getEducacion();
    }
    
    @PostMapping("/new/educacion")
    public String agregarEducacion(@RequestBody EducacionE edu) {
       educacionS.saveEducacion(edu);
        return "La educación ingresada fue agregada correctamente";
    }
   
    @DeleteMapping("delete//edu/{id}")
    public String eliminarEducacion(@PathVariable Long id) {
        educacionS.deleteEducacion(id);
        return "La educación mencionada fue borrada correctamente";
    } 
   //esta es una prueba de editar
    @PutMapping("/editar/edu")
    public void updateEducacion(@RequestBody EducacionE edu){
        educacionS.saveEducacion(edu);
    }

    
    //controller de Experiencia
    @Autowired
    ExperienciaS experienciaS;

    @GetMapping("/ver/experiencias")
     @ResponseBody
    public List<ExperienciaE> verExperiencias() {
        return experienciaS.getExperiencia();
    }
    
    @PostMapping("/new/expe")
    public String agregarExperiencia(@RequestBody ExperienciaE expe) {
       experienciaS.saveExperiencia(expe);
        return "La experiencia ingresada fue agregada correctamente";
    }
   
    @DeleteMapping("/delete/expe/{id}")
    public String eliminarExperiencia(@PathVariable Long id) {
        experienciaS.deleteExperiencia(id);
        return "La experiencia mencionada fue borrada correctamente";
    } 
   //esta es una prueba de editar
    @PutMapping("/editar/expe")
    public void updateExperiencia(@RequestBody ExperienciaE expe){
        experienciaS.saveExperiencia(expe);
    }

   //controller de Habilidad
    @Autowired
    HabilidadS habilidadS;

    @GetMapping("/ver/habis")
     @ResponseBody
    public List<HabilidadE> verHabilidades() {
        return habilidadS.getHabilidad();
    }
    
    @PostMapping("/new/habi")
    public String agregarHabilidad(@RequestBody HabilidadE habi) {
       habilidadS.saveHabilidad(habi);
        return "La habilidad ingresada fue agregada correctamente";
    }
   
    @DeleteMapping("/delete/habi/{id}")
    public String eliminarHabilidad(@PathVariable Long id) {
        habilidadS.deleteHabilidad(id);
        return "La habilidad mencionada fue borrada correctamente";
    } 
   //esta es una prueba de editar
    @PutMapping("/editar/habi")
    public void updateHabilidad(@RequestBody HabilidadE habi){
        habilidadS.saveHabilidad(habi);
    } 
    
     //controller de Proyecto
    @Autowired
    ProyectoS proyectoS;

    @GetMapping("/ver/proyectos")
     @ResponseBody
    public List<ProyectoE> verProyectos() {
        return proyectoS.getProyecto();
    }
    
    @PostMapping("/new/proyecto")
    public String agregarProyecto(@RequestBody ProyectoE proye) {
       proyectoS.saveProyecto(proye);
        return "La proyecto ingresada fue agregada correctamente";
    }
   
    @DeleteMapping("/delete/proyecto/{id}")
    public String eliminarProyecto(@PathVariable Long id) {
        proyectoS.deleteProyecto(id);
        return "La proyecto mencionada fue borrada correctamente";
    } 
   //esta es una prueba de editar, por segunda vez
    @PutMapping("/editar/proyecto")
    public void updateProyecto(@RequestBody ProyectoE proye){
        proyectoS.saveProyecto(proye);
    }

}

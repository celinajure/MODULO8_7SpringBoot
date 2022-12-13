package com.Celi.Springboot.controller;

import com.Celi.Springboot.entity.EducacionE;
import com.Celi.Springboot.entity.ExperienciaE;
import com.Celi.Springboot.entity.HabilidadE;
import com.Celi.Springboot.entity.PersonaE;
import com.Celi.Springboot.entity.ProyectoE;
import com.Celi.Springboot.entity.RedesE;
import com.Celi.Springboot.service.EducacionS;
import com.Celi.Springboot.service.ExperienciaS;
import com.Celi.Springboot.service.HabilidadS;
import com.Celi.Springboot.service.PersonaS;
import com.Celi.Springboot.service.ProyectoS;
import com.Celi.Springboot.service.RedesS;
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
    //RequestMapping("persona")
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
        return "La PERSONA fue borrada correctamente";
    }
    //esta es una prueba de editar
    @PutMapping("/editar/perso/{id}")
    public String updatePersona(@RequestBody PersonaE per){
        persoS.savePersona(per);
          return "Los CAMBIOS de la PERSONA han sido realizados correctamente";
    }
      

    
      //controller de Educacion
    //@RequestMapping("educacion")
    @Autowired
    EducacionS educacionS;

    @GetMapping("/ver/educaciones")
     @ResponseBody
    public List<EducacionE> verEducaciones() {
        return educacionS.getEducaciones();
    }
    
    @PostMapping("/new/educacion")
    public String agregarEducacion(@RequestBody EducacionE edu) {
       educacionS.saveEducacion(edu);
        return "La educación ingresada fue agregada correctamente";
    }
   
    @DeleteMapping("delete/edu/{id}")
    public String eliminarEducacion(@PathVariable Long id) {
        educacionS.deleteEducacion(id);
        return "La educación mencionada fue borrada correctamente";
    } 
   //esta es una prueba de editar
    @PutMapping("/editar/edu/{id}")
    public String updateEducacion(@RequestBody EducacionE edu){
        educacionS.saveEducacion(edu);
        return  "La EDUCACIÓN ha sido modificada correctamente";
    }

    
    //controller de Experiencia
    //@RequestMapping("experiencia")
    @Autowired
    ExperienciaS experienciaS;

    @GetMapping("/ver/experiencias")
     @ResponseBody
    public List<ExperienciaE> verExperiencias() {
        return experienciaS.getExperiencias();
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
    //@RequestMapping("habilidad")
    @Autowired
    HabilidadS habilidadS;

    @GetMapping("/ver/habis")
     @ResponseBody
    public List<HabilidadE> verHabilidades() {
        return habilidadS.getHabilidades();
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
    @PutMapping("/editar/habi/{id}")
    public String updateHabilidad(@RequestBody HabilidadE habi){
        habilidadS.saveHabilidad(habi);
         return "La HABILIDAD editada fue modificada correctamente";
    } 
    
     //controller de Proyecto
    //@RequestMapping("proyecto")
    @Autowired
    ProyectoS proyectoS;

    @GetMapping("/ver/proyectos")
     @ResponseBody
    public List<ProyectoE> verProyectos() {
        return proyectoS.getProyectos();
    }
    
    @PostMapping("/new/proyecto")
    public String agregarProyecto(@RequestBody ProyectoE proye) {
       proyectoS.saveProyecto(proye);
        return "El proyecto ingresado fue agregado correctamente";
    }
   
    @DeleteMapping("/delete/proyecto/{id}")
    public String eliminarProyecto(@PathVariable Long id) {
        proyectoS.deleteProyecto(id);
        return "El proyecto mencionado fue borrado correctamente";
    } 
   //esta es una prueba de editar, por segunda vez
    @PutMapping("/editar/proyecto")
    public void updateProyecto(@RequestBody ProyectoE proye){
        proyectoS.saveProyecto(proye);
    }
// controller de Redes
    //RequestMapping("redes")
    @Autowired
    RedesS redesS;

    @GetMapping("/ver/redes")
    @ResponseBody
    public List<RedesE> verRedes() {
        return redesS.getRedes();
    }

    @PostMapping("/new/red")
    public String agregarRed(@RequestBody RedesE red) {
        redesS.saveRed(red);
        return "La RED fue agregada correctamente";
    }

    @DeleteMapping("/delete/red/{id}")
    public String eliminarRedes(@PathVariable Long id) {
        redesS.deleteRed(id);
        return "La RED fue borrada correctamente";
    }
    //esta es una prueba de editar
    @PutMapping("/editar/red/{id}")
    public String updateRedes(@RequestBody RedesE red){
        redesS.saveRed(red);
          return "Los CAMBIOS en la RED han sido realizados correctamente";
    }
}
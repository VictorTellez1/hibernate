package com.hibernate.hibernate.controller;


import com.hibernate.hibernate.model.Persona;
import com.hibernate.hibernate.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona persona){
        personaService.savePersona(persona);
        return "Persona salvada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
        return "Persona eliminada correctamente";
    }

    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam(required = false,name = "id") Long nuevaId,
                               @RequestParam(required = false,name = "nombre") String nuevoNombre,
                               @RequestParam(required = false,name = "apellido") String nuevoApellido,
                               @RequestParam(required = false,name = "edad") int nuevaEdad
                               ){
        personaService.editarPersona(id,nuevaId,nuevoNombre,nuevoApellido,nuevaEdad);
        return personaService.findPersona(nuevaId);
    }

    @PutMapping("/personas/editar")
    public Persona editPersona(@RequestBody Persona persona){
        personaService.editPersona(persona);
        return personaService.findPersona(persona.getId());
    }
}

package com.hibernate.hibernate.service;

import com.hibernate.hibernate.model.Persona;
import com.hibernate.hibernate.repository.IPersonaRepository;
import com.hibernate.hibernate.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository personaRepository;


    @Override
    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void editarPersona(Long id, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        Persona persona = this.findPersona(id);
        persona.setId(idNueva);
        persona.setEdad(nuevaEdad);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        this.savePersona(persona);
    }

    @Override
    public void editPersona(Persona persona) {
        this.savePersona(persona); //Tambien puede modificar el save
    }
}

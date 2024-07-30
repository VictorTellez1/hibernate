package com.hibernate.hibernate.service;

import com.hibernate.hibernate.model.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas();
    public void savePersona(Persona persona);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
    public void editarPersona(Long id,Long idNueva,String nuevoNombre,String nuevoApellido,int nuevaEdad);
    public void editPersona(Persona persona);
}

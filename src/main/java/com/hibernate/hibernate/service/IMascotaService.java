package com.hibernate.hibernate.service;


import com.hibernate.hibernate.model.Mascota;


import java.util.List;

public interface IMascotaService {
    public List<Mascota> getMascota();
    public void saveMascota(Mascota mascota);
    public void deleteMascota(Long id);
    public Mascota findMascota(Long id);
    //public void editarPersona(Long id,Long idNueva,String nuevoNombre,String nuevoApellido,int nuevaEdad);

}

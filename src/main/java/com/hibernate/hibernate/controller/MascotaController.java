package com.hibernate.hibernate.controller;

import com.hibernate.hibernate.model.Mascota;
import com.hibernate.hibernate.service.IMascotaService;
import com.hibernate.hibernate.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {


    @Autowired
    private IMascotaService mascotaService;

    @PostMapping("/mascota/crear")
    public String crearMascota(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);
        return "Guardado correctamente";
    }
}

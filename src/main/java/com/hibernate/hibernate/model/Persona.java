package com.hibernate.hibernate.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_seq")
    @SequenceGenerator(name = "persona_seq", sequenceName = "persona_seq", allocationSize = 1)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    @OneToOne
    @JoinColumn(name = "mascota_id_mascota", referencedColumnName = "id_mascota")
    private Mascota mascota;

    public Persona(){

    }

    public Persona(Long id, String nombre, String apellido, int edad, Mascota mascota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascota = mascota;
    }
}

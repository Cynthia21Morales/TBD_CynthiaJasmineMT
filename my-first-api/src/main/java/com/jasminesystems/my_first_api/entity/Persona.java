package com.jasminesystems.my_first_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "personas")
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private String telefono;
    private String email;

}

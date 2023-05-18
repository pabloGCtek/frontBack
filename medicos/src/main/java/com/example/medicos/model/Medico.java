package com.example.medicos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Medico {
    public int id;
    public String dni;
    public String nombre;
    public int edad;


}

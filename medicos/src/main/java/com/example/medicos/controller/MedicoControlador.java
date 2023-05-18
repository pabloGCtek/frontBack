package com.example.medicos.controller;

import com.example.medicos.service.IMedicoServicio;
import com.example.medicos.model.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/medicos")
@RestController
public class MedicoControlador {
    @Autowired
    private IMedicoServicio servicio;

    @GetMapping
    public List<Medico> listar() throws Exception{
        return servicio.listar();
    }
/*
    @GetMapping
    public Medico listarPorId(@PathVariable("id") Integer id) throws Exception{
        return servicio.listarPorId(id);
    }*/
    @PostMapping
    public Medico registrar(@RequestBody Medico m)throws Exception{
        return servicio.registrar(m);
    }
    @PutMapping
    public Medico modificar(@RequestBody Medico m)throws Exception{
        return servicio.modificar(m);
    }

    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id) throws Exception{
        servicio.eliminar(id);
    }
}

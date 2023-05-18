package com.example.medicos.service;

import com.example.medicos.model.Medico;

import java.util.List;

public interface IMedicoServicio {

     List<Medico> listar();
     Medico listarPorId(int id);
     Medico registrar(Medico m);
     Medico modificar(Medico m);
     void eliminar(int id);

}

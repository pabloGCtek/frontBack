package com.example.medicos.service;

import com.example.medicos.model.Medico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicio implements IMedicoServicio{
    @Override
    public List<Medico> listar() {
        return null;
    }

    @Override
    public Medico listarPorId(int id) {
        return null;
    }

    @Override
    public Medico registrar(Medico m) {
        return null;
    }

    @Override
    public Medico modificar(Medico m) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }
}

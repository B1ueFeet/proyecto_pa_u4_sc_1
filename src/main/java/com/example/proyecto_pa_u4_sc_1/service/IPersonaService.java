package com.example.proyecto_pa_u4_sc_1.service;

import java.util.List;

import com.example.proyecto_pa_u4_sc_1.modelo.Persona;

public interface IPersonaService {

	public List<Persona> buscarTodos();

	public Persona buscarPorId(Integer id);

	public void actualizar(Persona persona);

	public void eliminar(Integer id);

	public void guardar(Persona persona);

}

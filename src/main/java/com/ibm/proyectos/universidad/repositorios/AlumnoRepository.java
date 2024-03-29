package com.ibm.proyectos.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.proyectos.universidad.modelo.entidades.Persona;

@Repository("repositorioAlumno")
public interface AlumnoRepository extends PersonaRepository 
{
	
	@Query("select a from Alumno a join fetch a.carrera c  where c.nombre = ?1")
	public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombreCarrera);
}
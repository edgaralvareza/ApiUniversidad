package com.ibm.proyectos.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.proyectos.universidad.enumeradores.TipoEmpleado;
import com.ibm.proyectos.universidad.modelo.entidades.Persona;

@Repository("repositorioEmpleado")
public interface EmpleadoRepository extends PersonaRepository
{
	@Query("select e from Empleado e where e.tipoEmpleado = ?1")
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
}

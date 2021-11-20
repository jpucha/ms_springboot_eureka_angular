/**
 * 
 */
package net.openwebinars.mspersonajesow.service;

import java.util.List;

import net.openwebinars.mscommonsentity.entity.Personaje;

/**
 * @author OpenWebinars
 * @version 1.0 05/03/2021
 */
public interface PersonajeService {
	/**
	 * Metodo que permite consultar personajes.
	 * @return {@link List} lista de personajes.
	 */
	List<Personaje> consultarPersonajes();
	
	/**
	 * Metodo que permite guardar personajes.
	 * @param personaje {@link Personaje} personaje a guardar.
	 * @return {@link Personaje} personaje guardado.
	 */
	Personaje guardarPersonaje(Personaje personaje);
	
	/**
	 * Metodo que permite actualizar personajes.
	 * @param personaje {@link Personaje} personaje a actualizar.
	 * @return {@link Personaje} personaje actualizado.
	 */
	Personaje actualizarPersonaje(Personaje personaje);
	
	/**
	 * Metodo que permite eliminar un personaje por su identificador.
	 * @param id {@link Long} identificador del personaje.
	 */
	void eliminarPersonaje(Long id);
}

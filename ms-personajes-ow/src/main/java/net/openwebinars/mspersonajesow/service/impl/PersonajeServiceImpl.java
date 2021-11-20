/**
 * 
 */
package net.openwebinars.mspersonajesow.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.openwebinars.mscommonsentity.entity.Personaje;
import net.openwebinars.mspersonajesow.repository.PersonajeRepository;
import net.openwebinars.mspersonajesow.service.PersonajeService;

/**
 * @author OpenWebinars
 * @version 1.0 05/03/2021
 */
@Service
public class PersonajeServiceImpl implements PersonajeService {
	/**
	 * Repositorio de personajes.
	 */
	@Autowired
	private PersonajeRepository personajeRepository;
	
	@Override
	public List<Personaje> consultarPersonajes() {
		List<Personaje> personajesConsultados = StreamSupport.stream(
				this.personajeRepository.findAll().spliterator(), false).collect(Collectors.toList());
		
		return personajesConsultados;
	}

	@Override
	public Personaje guardarPersonaje(Personaje personaje) {
		personaje.setFechaCreacion(LocalDateTime.now());
		return this.personajeRepository.save(personaje);
	}

	@Override
	public Personaje actualizarPersonaje(Personaje personaje) {
		return this.personajeRepository.save(personaje);
	}

	@Override
	public void eliminarPersonaje(Long id) {
		this.personajeRepository.deleteById(id);
	}

}

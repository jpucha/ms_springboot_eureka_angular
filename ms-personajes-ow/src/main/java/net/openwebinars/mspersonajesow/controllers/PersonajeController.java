/**
 * 
 */
package net.openwebinars.mspersonajesow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.openwebinars.mscommonsentity.entity.Personaje;
import net.openwebinars.mspersonajesow.service.PersonajeService;

/**
 * @author OpenWebinars
 * @version 1.0 05/03/2021
 */
@RestController("personajes")
public class PersonajeController {

	/**
	 * Objeto que contiene los servicios de logica de negocio para personajes.
	 */
	@Autowired
	private PersonajeService personajeService;
	
	/**
	 * API que permite obtener la lista de personajes.
	 * @return {@link ResponseEntity} respuesta del microservicio.
	 */
	@GetMapping(value = "/consultarPersonajes")
	public ResponseEntity<?> consultarPersonajes() {
		List<Personaje> personajesConsultados = this.personajeService.consultarPersonajes();
		
		if (personajesConsultados.size() > 0) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(personajesConsultados);
	}

	/**
	 * API que permite guardar un personaje.
	 * @param personaje {@link Personaje} personaje a guardar.
	 * @return {@link ResponseEntity} respuesta del microservicio.
	 */
	@PostMapping(value = "/guardarPersonaje")
	public ResponseEntity<?> guardarPersonaje(@RequestBody Personaje personaje) {
		
		Personaje personajeGuardado = this.personajeService.guardarPersonaje(personaje);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);
	}
	
	/**
	 * API que permite actualizar un personaje.
	 * @param personaje {@link Personaje} personaje a actualizar.
	 * @return {@link ResponseEntity} respuesta del microservicio.
	 */
	@PutMapping(value = "/actualizarPersonaje")
	public ResponseEntity<?> actualizarPersonaje(@RequestBody Personaje personaje) {
		
		Personaje personajeActualizado = this.personajeService.actualizarPersonaje(personaje);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(personajeActualizado);
	}
	
	/**
	 * API que permite eliminar un personaje.
	 * @param personaje {@link Personaje} personaje a guardar.
	 * @return {@link ResponseEntity} respuesta del microservicio.
	 */
	@DeleteMapping(value = "/eliminarPersonaje/{id}")
	public ResponseEntity<?> eliminarPersonaje(@PathVariable Long id) {
		
		this.personajeService.eliminarPersonaje(id);
		
		return ResponseEntity.ok().build();
	}
}

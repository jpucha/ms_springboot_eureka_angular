/**
 * 
 */
package net.openwebinars.msanimesow.controllers;

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
import net.openwebinars.msanimesow.services.AnimeService;
import net.openwebinars.mscommonsentity.entity.Anime;

/**
 * @author OpenWebinars
 * @version 1.0 04/03/2021
 */
@RestController("animes")
public class AnimeController {
	/**
	 * Objeto con los servicios de la logica de negocio de animes.
	 */
	@Autowired
	private AnimeService animeService;
	
	/**
	 * API que permite consultar todos los registros de animes.
	 * @return {@link ResponseEntity} respuesta del microservicio.
	 */
	@GetMapping("/consultarAnimes")
	public ResponseEntity<?> consultarAnimes() {
		List<Anime> animesConsultados = this.animeService.consultarAnimes();
		
		if (animesConsultados.size() == 0) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(animesConsultados);
	}
	
	/**
	 * API que permite guardar un registro de anime.
	 * @param anime {@link Anime} objeto que viene en el request a guardar.
	 * @return {@link ResponseEntity} respuesta del microservicio.
	 */
	@PostMapping("/guardarAnime")
	public ResponseEntity<?> guardarAnime(@RequestBody Anime anime) {
		
		Anime animeGuardado = this.animeService.guardarAnime(anime);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(animeGuardado);
	}
	
	/**
	 * API que permite actualizar un registro de anime.
	 * @param anime {@link Anime} objeto que viene en el request a actualizar.
	 * @return {@link ResponseEntity} respuesta del microservicio.
	 */
	@PutMapping("/actualizarAnime")
	public ResponseEntity<?> actualizarAnime(@RequestBody Anime anime) {
		
		Anime animeActualizado = this.animeService.actualizarAnime(anime);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(animeActualizado);
	}
	
	/**
	 * API que permite eliminar un registro de anime por su identificador.
	 * @param id {@link Long} identificador del anime.
	 * @return {@link ResponseEntity} respuesta del microservicio.
	 */
	@DeleteMapping("/eliminarAnime/{id}")
	public ResponseEntity<?> eliminarAnime(@PathVariable Long id) {
		
		this.animeService.eliminarAnime(id);
		
		return ResponseEntity.ok().build();
	}
}

/**
 * 
 */
package net.openwebinars.msanimesow.services.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.openwebinars.msanimesow.repository.AnimeRepository;
import net.openwebinars.msanimesow.services.AnimeService;
import net.openwebinars.mscommonsentity.entity.Anime;

/**
 * @author OpenWebinars
 * @version 1.0 04/03/2021
 * 
 * Clase que implementa la logica de negocio para los animes.
 */
@Service
public class AnimeServiceImpl implements AnimeService {

	/**
	 * Objeto inyectado con Spring para ejecutar las transacciones del CRUD.
	 */
	@Autowired
	private AnimeRepository animeRepository;
	
	@Override
	public List<Anime> consultarAnimes() {
		List<Anime> animesConsultados = StreamSupport.stream(
				this.animeRepository.findAll().spliterator(), false).collect(Collectors.toList());
		
		return animesConsultados;
	}

	@Override
	public Anime guardarAnime(Anime anime) {
		anime.setFechaCreacion(LocalDateTime.now());
		return this.animeRepository.save(anime);
	}

	@Override
	public Anime actualizarAnime(Anime anime) {
		return this.animeRepository.save(anime);
	}

	@Override
	public void eliminarAnime(Long id) {
		this.animeRepository.deleteById(id);
	}

}

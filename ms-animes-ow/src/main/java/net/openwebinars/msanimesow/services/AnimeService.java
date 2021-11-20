/**
 * 
 */
package net.openwebinars.msanimesow.services;

import java.util.List;

import net.openwebinars.mscommonsentity.entity.Anime;

/**
 * @author OpenWebinars
 * @version 1.0 04/03/2021
 *
 * Interface que define los metodos para la logica de negocio de animes.
 */
public interface AnimeService {
	/**
	 * Metodo que permite consultar un listado de animes.
	 * @return {@link List} animes obtenidos.
	 */
	List<Anime> consultarAnimes();
	
	/**
	 * Metodo que permite guardar un anime.
	 * @param anime {@link Anime} objeto con el anime a guardar.
	 * @return {@link Anime} anime guardado.
	 */
	Anime guardarAnime(Anime anime);
	
	/**
	 * Metodo que permite actualizar un anime.
	 * @param anime {@link Anime} objeto con el anime a actualizar.
	 * @return {@link Anime} anime actualizado.
	 */
	Anime actualizarAnime(Anime anime);
	
	/**
	 * Metodo que permite eliminar un anime.
	 * @param id {@link Long} identificador del anime.
	 */
	void eliminarAnime(Long id);
}

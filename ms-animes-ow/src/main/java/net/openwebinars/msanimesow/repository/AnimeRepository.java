/**
 * 
 */
package net.openwebinars.msanimesow.repository;

import org.springframework.data.repository.CrudRepository;

import net.openwebinars.mscommonsentity.entity.Anime;

/**
 * @author OpenWebinars
 * @version 1.0 04/03/2021
 * 
 * Repositorio que contiene el CRUD heredado de CrudRepository de Spring JPA
 * para las transacciones a la tabla de anime.
 */
public interface AnimeRepository extends CrudRepository<Anime, Long> {

}

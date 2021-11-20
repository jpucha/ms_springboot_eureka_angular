/**
 * 
 */
package net.openwebinars.mscommonsentity.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import net.openwebinars.mscommonsentity.commons.CommonFields;

/**
 * @author OpenWebinars
 * @version 1.0 04/03/2021
 */
@Data
@Entity
@Table(name = "personaje")
public class Personaje extends CommonFields {

	@Column(name = "nombre", length = 45)
	private String nombre;
	
	@Column(name = "actor", length = 45)
	private String actor;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idAnime")
	private Anime anime;
	
	/**
	 * fecha creacion del personaje.
	 */
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Anime getAnime() {
		return anime;
	}

	public void setAnime(Anime anime) {
		this.anime = anime;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
}

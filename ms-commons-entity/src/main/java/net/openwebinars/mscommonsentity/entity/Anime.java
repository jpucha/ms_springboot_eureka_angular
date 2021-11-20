/**
 * 
 */
package net.openwebinars.mscommonsentity.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import net.openwebinars.mscommonsentity.commons.CommonFields;

/**
 * @author OpenWebinars
 *
 */
@Data
@Entity
@Table(name = "anime")
public class Anime extends CommonFields {
	/**
	 * Nombre del anime.
	 */
	@Column(name = "nombre", length = 45)
	private String nombre;
	/**
	 * Genero del anime.
	 */
	@Column(name = "genero", length = 45)
	private String genero;
	
	/**
	 * fecha creacion del anime.
	 */
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}

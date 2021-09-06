package org.generation.lojadegames.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Create Table
@Table(name = "tb_categoria")
public class Categoria {

	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_incremento
	private long id; // bigint

	@NotNull(message = "Obrigatório mencionar o gênero!") // Não pode ser nulo
	@Size(min = 1, max = 255, message = "O atributo genero deve conter no mínimo 01 e no máximo 255 caracteres")
	private String genero;

	@NotNull(message = "Obrigatório mencionar a plataforma!")
	private String plataforma; 

	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Categoria> categoria;
	
	
	// ------ Getters and Setters ---------


	
	public long getId() {
		return id;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	} // Date Timestamp()

}
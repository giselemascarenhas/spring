package org.generation.lojadegames.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity //Create Table
@Table(name = "tb_produto")
public class Produto {
	
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
	private long id; 

	@NotNull(message = "Nome Obrigatório") // Não pode ser nulo
	@Size(min = 5, max = 255)
	private String nome;

	@NotNull(message = "Obrigatório mencionar o Preço")
	private BigDecimal preco; 
	
	@NotNull(message = "Obrigatório mencionar a quantidade!")
	private int quantidade; 

	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne
	@JsonIgnoreProperties("produto") // Para evitar repetição
	private Produto produto;
	
	// ------ Getters and Setters ---------

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}

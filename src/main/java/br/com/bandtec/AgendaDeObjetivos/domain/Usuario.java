package br.com.bandtec.AgendaDeObjetivos.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private int idade;
		
	@Embedded
	private Credenciais credenciais;

	public Usuario(Long id, Credenciais credenciais) {
		super();
		this.id = id;
		this.credenciais = credenciais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	
}

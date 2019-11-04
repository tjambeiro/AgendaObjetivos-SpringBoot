package br.com.bandtec.AgendaDeObjetivos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento")
	@JsonProperty
	private Long idEvento;

	@Column(name = "nome_evento")
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private String descricao;
	
	public Evento() {}

	public Evento(Long idEvento, String nome, String descricao) {
		super();
		this.idEvento = idEvento;
		this.nome = nome;
		this.descricao = descricao;
	}
}

package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Sessao {
	@Id
	@GeneratedValue
	private Integer id;
	private LocalTime horario;
	@ManyToOne
	private Sala sala;
	@ManyToOne 
	private Filme filme;
	
	
	public Sessao() {
		// TODO Auto-generated constructor stub
	}
	
	public Sessao (LocalTime horario, Filme filme, Sala sala, BigDecimal preco) {
		this.horario = horario;
		this.filme = filme;
		this.sala = sala;
		
	}
	
	public LocalTime getHorarioTermino() {
		return this.horario.plusMinutes(filme.getDuracao().toMinutes());
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalTime getHorario() {
		return horario;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public Filme getFilme() {
		return filme;
	}

}

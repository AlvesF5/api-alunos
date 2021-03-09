package com.alunos.alunosapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="TB_ALUNOS")
public class Aluno implements Serializable{
	
	private static final long serialVersionUID = -8318644816202683313L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "matricula")
	private int matricula;

	@Column(name = "sexo")
	private String sexo;
}

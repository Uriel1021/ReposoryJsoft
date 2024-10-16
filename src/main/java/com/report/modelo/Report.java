package com.report.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Report {
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	@Column(name = "TIPO")
	private String tipo;
	@Column(name="VERSION")
	private String version;
	@Column(name = "COMENTARIO")
	private String comentario;
	
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Report(int id, String tipo, String version, String comentario) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.version = version;
		this.comentario = comentario;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
	
}

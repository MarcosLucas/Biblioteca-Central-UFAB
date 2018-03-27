package model;

import enums.TipoDeCurso;

public class Curso {
	
	private String nome;
	private String area;
	private TipoDeCurso tipoDeCurso;
	/**
	 * @param nome
	 * @param area
	 * @param tipoDeCurso
	 */
	public Curso(String nome, String area, TipoDeCurso tipoDeCurso) {
		super();
		this.nome = nome;
		this.area = area;
		this.tipoDeCurso = tipoDeCurso;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the tipoDeCurso
	 */
	public TipoDeCurso getTipoDeCurso() {
		return tipoDeCurso;
	}
	/**
	 * @param tipoDeCurso the tipoDeCurso to set
	 */
	public void setTipoDeCurso(TipoDeCurso tipoDeCurso) {
		this.tipoDeCurso = tipoDeCurso;
	}
	
	
}

package model;

import enums.TipoDeMidia;

/**
 * 
 * @author Marcos Lucas
 *
 */
public class MidiaDigital {

	private String titulo;
	private String dataDeGravacao;
	private TipoDeMidia tipoDeMidia;
	/**
	 * @param titulo
	 * @param dataDeGravacao
	 * @param tipoDeMidia
	 */
	public MidiaDigital(String titulo, String dataDeGravacao,
			TipoDeMidia tipoDeMidia) {
		super();
		this.titulo = titulo;
		this.dataDeGravacao = dataDeGravacao;
		this.tipoDeMidia = tipoDeMidia;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the dataDeGravacao
	 */
	public String getDataDeGravacao() {
		return dataDeGravacao;
	}
	/**
	 * @param dataDeGravacao the dataDeGravacao to set
	 */
	public void setDataDeGravacao(String dataDeGravacao) {
		this.dataDeGravacao = dataDeGravacao;
	}
	/**
	 * @return the tipoDeMidia
	 */
	public TipoDeMidia getTipoDeMidia() {
		return tipoDeMidia;
	}
	/**
	 * @param tipoDeMidia the tipoDeMidia to set
	 */
	public void setTipoDeMidia(TipoDeMidia tipoDeMidia) {
		this.tipoDeMidia = tipoDeMidia;
	}
	
	
}

package model;

import enums.TipoDeAnais;

/**
 * 
 * @author Marcos Lucas
 *
 */
public class AnaisDeCongresso {
	
	private String titulo;
	private String autor;
	private String nomeCongresso;
	private String anoDePublicacao;
	private String local;
	private TipoDeAnais tipoDeAnais;
	/**
	 * @param titulo
	 * @param autor
	 * @param nomeCongresso
	 * @param anoDePublicacao
	 * @param local
	 * @param tipoDeAnais
	 */
	public AnaisDeCongresso(String titulo, String autor, String nomeCongresso,
			String anoDePublicacao, String local, TipoDeAnais tipoDeAnais) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nomeCongresso = nomeCongresso;
		this.anoDePublicacao = anoDePublicacao;
		this.local = local;
		this.tipoDeAnais = tipoDeAnais;
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the nomeCongresso
	 */
	public String getNomeCongresso() {
		return nomeCongresso;
	}
	/**
	 * @param nomeCongresso the nomeCongresso to set
	 */
	public void setNomeCongresso(String nomeCongresso) {
		this.nomeCongresso = nomeCongresso;
	}
	/**
	 * @return the anoDePublicacao
	 */
	public String getAnoDePublicacao() {
		return anoDePublicacao;
	}
	/**
	 * @param anoDePublicacao the anoDePublicacao to set
	 */
	public void setAnoDePublicacao(String anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	/**
	 * @return the local
	 */
	public String getLocal() {
		return local;
	}
	/**
	 * @param local the local to set
	 */
	public void setLocal(String local) {
		this.local = local;
	}
	/**
	 * @return the tipoDeAnais
	 */
	public TipoDeAnais getTipoDeAnais() {
		return tipoDeAnais;
	}
	/**
	 * @param tipoDeAnais the tipoDeAnais to set
	 */
	public void setTipoDeAnais(TipoDeAnais tipoDeAnais) {
		this.tipoDeAnais = tipoDeAnais;
	}
	
	
}

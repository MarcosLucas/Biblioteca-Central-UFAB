package model;

import enums.TiposDeTCC;

/**
 * 
 * @author Marcos Lucas
 *
 */
public class TrabalhoDeConclusao {

	private String titulo;
	private String autor;
	private String orientador;
	private String anoDeDefesa;
	private String local;
	private TiposDeTCC tipoDeTCC;
	/**
	 * @param titulo
	 * @param autor
	 * @param orientador
	 * @param anoDeDefesa
	 * @param local
	 * @param tipoDeTCC
	 */
	public TrabalhoDeConclusao(String titulo, String autor, String orientador,
			String anoDeDefesa, String local, TiposDeTCC tipoDeTCC) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.orientador = orientador;
		this.anoDeDefesa = anoDeDefesa;
		this.local = local;
		this.tipoDeTCC = tipoDeTCC;
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
	 * @return the orientador
	 */
	public String getOrientador() {
		return orientador;
	}
	/**
	 * @param orientador the orientador to set
	 */
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	/**
	 * @return the anoDeDefesa
	 */
	public String getAnoDeDefesa() {
		return anoDeDefesa;
	}
	/**
	 * @param anoDeDefesa the anoDeDefesa to set
	 */
	public void setAnoDeDefesa(String anoDeDefesa) {
		this.anoDeDefesa = anoDeDefesa;
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
	 * @return the tipoDeTCC
	 */
	public TiposDeTCC getTipoDeTCC() {
		return tipoDeTCC;
	}
	/**
	 * @param tipoDeTCC the tipoDeTCC to set
	 */
	public void setTipoDeTCC(TiposDeTCC tipoDeTCC) {
		this.tipoDeTCC = tipoDeTCC;
	}
	
	
}

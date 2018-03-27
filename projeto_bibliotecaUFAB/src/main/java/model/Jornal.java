package model;

public class Jornal {

	private String titulo;
	private String dataDePublicacao;
	private String edicao;
	/**
	 * @param titulo
	 * @param dataDePublicacao
	 * @param edicao
	 */
	public Jornal(String titulo, String dataDePublicacao, String edicao) {
		super();
		this.titulo = titulo;
		this.dataDePublicacao = dataDePublicacao;
		this.edicao = edicao;
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
	 * @return the dataDePublicacao
	 */
	public String getDataDePublicacao() {
		return dataDePublicacao;
	}
	/**
	 * @param dataDePublicacao the dataDePublicacao to set
	 */
	public void setDataDePublicacao(String dataDePublicacao) {
		this.dataDePublicacao = dataDePublicacao;
	}
	/**
	 * @return the edicao
	 */
	public String getEdicao() {
		return edicao;
	}
	/**
	 * @param edicao the edicao to set
	 */
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	
}

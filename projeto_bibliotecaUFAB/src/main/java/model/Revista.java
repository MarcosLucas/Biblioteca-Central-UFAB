package model;
/**
 * 
 * @author Marcos Lucas
 *
 */
public class Revista {

	private String titulo;
	private String editora;
	private String dataDePublicacao;
	private String edicao;
	private int numeroDePaginas;
	/**
	 * @param titulo
	 * @param editora
	 * @param dataDePublicacao
	 * @param edicao
	 * @param numeroDePaginas
	 */
	public Revista(String titulo, String editora, String dataDePublicacao,
			String edicao, int numeroDePaginas) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.dataDePublicacao = dataDePublicacao;
		this.edicao = edicao;
		this.numeroDePaginas = numeroDePaginas;
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
	 * @return the editora
	 */
	public String getEditora() {
		return editora;
	}
	/**
	 * @param editora the editora to set
	 */
	public void setEditora(String editora) {
		this.editora = editora;
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
	/**
	 * @return the numeroDePaginas
	 */
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	/**
	 * @param numeroDePaginas the numeroDePaginas to set
	 */
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	
}

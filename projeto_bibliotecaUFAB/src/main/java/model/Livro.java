package model;

/**
 * 
 * @author Marcos Lucas
 *
 */
public class Livro {
// área (do conhecimento)	tema (subárea).
	private String titulo;
	private int iSBN;
	private String autor;
	private String editora;
	private String anoDePublicacao;
	private String edicao;
	private int numeroDePaginas;
	private String areaConhecimento;
	private String tema;
	private int quantidade;
	
	public Livro(String titulo, int iSBN, String autor, String editora,
			String anoDePublicacao, String edicao, int numeroDePaginas,
			String areaConhecimento, String tema, int quantidade) {
		super();
		this.titulo = titulo;
		this.iSBN = iSBN;
		this.autor = autor;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
		this.edicao = edicao;
		this.numeroDePaginas = numeroDePaginas;
		this.areaConhecimento = areaConhecimento;
		this.tema = tema;
		this.quantidade = quantidade;
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
	 * @return the iSBN
	 */
	public int getISBN() {
		return iSBN;
	}

	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(int iSBN) {
		this.iSBN = iSBN;
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

	/**
	 * @return the areaConhecimento
	 */
	public String getAreaConhecimento() {
		return areaConhecimento;
	}

	/**
	 * @param areaConhecimento the areaConhecimento to set
	 */
	public void setAreaConhecimento(String areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}

	/**
	 * @return the tema
	 */
	public String getTema() {
		return tema;
	}

	/**
	 * @param tema the tema to set
	 */
	public void setTema(String tema) {
		this.tema = tema;
	}

	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

	

}

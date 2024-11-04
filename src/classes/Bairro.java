package classes;

public class Bairro {
	private Integer idBairro;
	private String descricaoBairro;

	public Bairro() {
	}

	public Bairro(Integer idBairro, String descricaoBairro) {
		this.idBairro = idBairro;
		this.descricaoBairro = descricaoBairro;
	}

	public Integer getIdBairro() {
		return idBairro;
	}

	public void setIdBairro(Integer idBairro) {
		this.idBairro = idBairro;
	}

	public String getDescricaoBairro() {
		return descricaoBairro;
	}

	public void setDescricaoBairro(String descricaoBairro) {
		this.descricaoBairro = descricaoBairro;
	}

}

package classes;

public class Fonte {
	private Integer idFonte;
	private String descricaoFonte;
	
	public Fonte() {
	}
	
	public Fonte(Integer idFonte, String descricaoFonte) {
		this.idFonte = idFonte;
		this.descricaoFonte = descricaoFonte;
	}
	
	public Integer getIdFonte() {
		return idFonte;
	}
	public void setIdFonte(Integer idFonte) {
		this.idFonte = idFonte;
	}
	public String getDescricaoFonte() {
		return descricaoFonte;
	}
	public void setDescricaoFonte(String descricaoFonte) {
		this.descricaoFonte = descricaoFonte;
	}
	
	
}

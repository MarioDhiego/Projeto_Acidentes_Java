package classes;

public class Causa {

	private Integer idCausa;
	private String descricaoCausa;
	
	public Causa() {
	}

	public Causa(Integer idCausa, String descricaoCausa) {
		this.idCausa = idCausa;
		this.descricaoCausa = descricaoCausa;
	}
	
	public Integer getIdCausa() {
		return idCausa;
	}
	public void setIdCausa(Integer idCausa) {
		this.idCausa = idCausa;
	}
	public String getDescricaoCausa() {
		return descricaoCausa;
	}
	public void setDescricaoCausa(String descricaoCausa) {
		this.descricaoCausa = descricaoCausa;
	}
	
	
}

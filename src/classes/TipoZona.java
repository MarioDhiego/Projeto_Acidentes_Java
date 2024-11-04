package classes;

public class TipoZona {
	private Integer idTipoZona;
	private String descricaoTipoZona;

	public TipoZona() {
	}

	public TipoZona(Integer idTipoZona, String descricaoTipoZona) {
		this.idTipoZona = idTipoZona;
		this.descricaoTipoZona = descricaoTipoZona;
	}

	public Integer getIdTipoZona() {
		return idTipoZona;
	}

	public void setIdTipoZona(Integer idTipoZona) {
		this.idTipoZona = idTipoZona;
	}

	public String getDescricaoTipoZona() {
		return descricaoTipoZona;
	}

	public void setDescricaoTipoZona(String descricaoTipoZona) {
		this.descricaoTipoZona = descricaoTipoZona;
	}

}

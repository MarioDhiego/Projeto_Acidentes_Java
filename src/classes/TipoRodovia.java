
// ====================================================================================================================//
package classes;

public class TipoRodovia {
	private Integer idTipoRodovia;
	private String descricaoTipoRodovia;

	public TipoRodovia() {
	}

	public TipoRodovia(Integer idTipoRodovia, String descricaoTipoRodovia) {
		this.idTipoRodovia = idTipoRodovia;
		this.descricaoTipoRodovia = descricaoTipoRodovia;
	}

	public Integer getIdTipoRodovia() {
		return idTipoRodovia;
	}

	public void setIdTipoRodovia(Integer idTipoRodovia) {
		this.idTipoRodovia = idTipoRodovia;
	}

	public String getDescricaoTipoRodovia() {
		return descricaoTipoRodovia;
	}

	public void setDescricaoTipoRodovia(String descricaoTipoRodovia) {
		this.descricaoTipoRodovia = descricaoTipoRodovia;
	}

}
// ====================================================================================================================//
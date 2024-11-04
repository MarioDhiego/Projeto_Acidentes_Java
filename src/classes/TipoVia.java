package classes;

public class TipoVia {
	private Integer idTipoVia;
	private String descricaoTipoVia;

	public TipoVia() {
	}

	public TipoVia(Integer idTipoVia, String descricaoTipoVia) {
		this.idTipoVia = idTipoVia;
		this.descricaoTipoVia = descricaoTipoVia;
	}

	public Integer getIdTipoVia() {
		return idTipoVia;
	}

	public void setIdTipoVia(Integer idTipoVia) {
		this.idTipoVia = idTipoVia;
	}

	public String getDescricaoTipoVia() {
		return descricaoTipoVia;
	}

	public void setDescricaoTipoVia(String descricaoTipoVia) {
		this.descricaoTipoVia = descricaoTipoVia;
	}
		
}

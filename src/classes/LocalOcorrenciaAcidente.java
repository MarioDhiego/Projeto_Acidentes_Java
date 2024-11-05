
// ====================================================================================================================//
// PACOTES
package classes;
import abstracts.Local;

public class LocalOcorrenciaAcidente extends Local {
	private Integer idLocalOcorrenciaAcidente;
	private String descricaoLocalOcorrenciaAcidente;

	public LocalOcorrenciaAcidente() {
	}

	public LocalOcorrenciaAcidente(Integer idLocalOcorrenciaAcidente, String descricaoLocalOcorrenciaAcidente) {
		this.idLocalOcorrenciaAcidente = idLocalOcorrenciaAcidente;
		this.descricaoLocalOcorrenciaAcidente = descricaoLocalOcorrenciaAcidente;
	}

	public Integer getIdLocalOcorrenciaAcidente() {
		return idLocalOcorrenciaAcidente;
	}

	public void setIdLocalOcorrenciaAcidente(Integer idLocalOcorrenciaAcidente) {
		this.idLocalOcorrenciaAcidente = idLocalOcorrenciaAcidente;
	}

	public String getDescricaoLocalOcorrenciaAcidente() {
		return descricaoLocalOcorrenciaAcidente;
	}

	public void setDescricaoLocalOcorrenciaAcidente(String descricaoLocalOcorrenciaAcidente) {
		this.descricaoLocalOcorrenciaAcidente = descricaoLocalOcorrenciaAcidente;
	}
}
// ====================================================================================================================//

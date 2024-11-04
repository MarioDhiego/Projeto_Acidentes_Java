package classes;

import abstracts.Rodovia;

public class RodoviaOcorrenciaAcidente extends Rodovia {

	private Integer idRodovia;
	private String descricaoRodovia;
	
	@Override
	public void imprimirRodovia() {
		System.out.println(getIdRodovia() + ", " 
				+ getDescricaoRodovia() + ", "
				+ getTipoRodovia().getDescricaoTipoRodovia()); 
	}

	public Integer getIdRodovia() {
		return idRodovia;
	}

	public void setIdRodovia(Integer idRodovia) {
		this.idRodovia = idRodovia;
	}

	public String getDescricaoRodovia() {
		return descricaoRodovia;
	}

	public void setDescricaoRodovia(String descricaoRodovia) {
		this.descricaoRodovia = descricaoRodovia;
	}


}

package abstracts;

import classes.OcorrenciaAcidente;

public abstract class Veiculo {
	private Integer idVeiculo;
	private OcorrenciaAcidente ocorrenciaAcidente;
	private String marcaVeiculo;
	private String modeloVeiculo;
	private String placaVeiculo;
	
	public abstract void imprimirVeiculo();

	public Integer getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Integer idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public OcorrenciaAcidente getOcorrenciaAcidente() {
		return ocorrenciaAcidente;
	}

	public void setOcorrenciaAcidente(OcorrenciaAcidente ocorrenciaAcidente) {
		this.ocorrenciaAcidente = ocorrenciaAcidente;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

}

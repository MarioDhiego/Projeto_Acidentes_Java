package classes;

public class MarcaModeloVeiculo {

	private Integer idMarcaVeiculo;
	private String marcaVeiculo;
	private String modeloVeicjo;

	public MarcaModeloVeiculo() {
	}
	
	public MarcaModeloVeiculo(Integer idMarcaVeiculo, String marcaVeiculo, String modeloVeicjo) {
		this.idMarcaVeiculo = idMarcaVeiculo;
		this.marcaVeiculo = marcaVeiculo;
		this.modeloVeicjo = modeloVeicjo;
	}
	
	public Integer getIdMarcaVeiculo() {
		return idMarcaVeiculo;
	}
	public void setIdMarcaVeiculo(Integer idMarcaVeiculo) {
		this.idMarcaVeiculo = idMarcaVeiculo;
	}
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}
	public String getModeloVeicjo() {
		return modeloVeicjo;
	}
	public void setModeloVeicjo(String modeloVeicjo) {
		this.modeloVeicjo = modeloVeicjo;
	}
	
	

}

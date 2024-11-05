
// ====================================================================================================================//
// PACOTES
package classes;
import abstracts.Veiculo;

// Veículo da Ocorrência do Acidente herda da CLASSE VEÍCULO
public class VeiculoOcorrenciaAcidente extends Veiculo {

	private Integer idVeiculo;
	private Integer anofabricacao;
	private String placaVeiculo;

	public VeiculoOcorrenciaAcidente() {
	}

	public VeiculoOcorrenciaAcidente(Integer anofabricacao, String placaVeiculo) {
		this.anofabricacao = anofabricacao;
		this.placaVeiculo = placaVeiculo;
	}

	@Override
	public void imprimirVeiculo() {
		System.out.println(getIdVeiculo() + ", " 
				+ getMarcaModeloVeiculo().getMarcaVeiculo() + ", "
				+ getMarcaModeloVeiculo().getModeloVeicjo() + ", " 
				+ getTipoVeiculo().getTipoVeiculo() + ", "
				+ getPlacaVeiculo() + ", "
				+ getOcorrenciaAcidente().getIdOcorrenciaAcidente());
	}

	public Integer getAnofabricacao() {
		return anofabricacao;
	}

	public void setAnofabricacao(Integer anofabricacao) {
		this.anofabricacao = anofabricacao;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public Integer getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Integer idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

}
// ====================================================================================================================//
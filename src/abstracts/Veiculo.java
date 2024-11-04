package abstracts;

import classes.MarcaModeloVeiculo;
import classes.OcorrenciaAcidente;
import classes.TipoVeiculo;

public abstract class Veiculo {
	private OcorrenciaAcidente ocorrenciaAcidente;
	private MarcaModeloVeiculo marcaModeloVeiculo;
	private TipoVeiculo tipoVeiculo;
	
	public abstract void imprimirVeiculo();

	public OcorrenciaAcidente getOcorrenciaAcidente() {
		return ocorrenciaAcidente;
	}

	public void setOcorrenciaAcidente(OcorrenciaAcidente ocorrenciaAcidente) {
		this.ocorrenciaAcidente = ocorrenciaAcidente;
	}

	public MarcaModeloVeiculo getMarcaModeloVeiculo() {
		return marcaModeloVeiculo;
	}

	public void setMarcaModeloVeiculo(MarcaModeloVeiculo marcaModeloVeiculo) {
		this.marcaModeloVeiculo = marcaModeloVeiculo;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
}

package interfaces;

import classes.MarcaModeloVeiculo;
import classes.OcorrenciaAcidente;
import classes.TipoVeiculo;
import classes.VeiculoOcorrenciaAcidente;

public interface IveiculoOcorrenciaAcidente {
	public VeiculoOcorrenciaAcidente gravarVeiculoOcorrenciaAcidente(Integer idVeiculo, 
			OcorrenciaAcidente ocorrenciaAcidente, 
			MarcaModeloVeiculo marcaModeloVeiculo, 
			TipoVeiculo tipoVeiculo, 
			Integer anoFabricacao, 
			String placa);

}

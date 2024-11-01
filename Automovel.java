package classes;

import abstracts.Veiculo;

public class Automovel extends Veiculo {

	@Override
	public void imprimirVeiculo() {
		System.out.println("AUTOMOVEL DA OCORRÊNCIA");

		System.out.println("ID VEÍCULO:     " + getIdVeiculo());
		System.out.println("OCORRÊNCIA:     " +"ID: "+ getOcorrenciaAcidente().getIdOcorrenciaAcidente()+", LOCAL: "+getOcorrenciaAcidente().getLocal());
		System.out.println("MARCA VEÍCULO:  " + getMarcaVeiculo());
		System.out.println("MODELO VEÍCULO: " + getModeloVeiculo());
		System.out.println("PLACA VEÍCULO:  " + getPlacaVeiculo());
	}
}

package classes;

import abstracts.Veiculo;

public class Onibus extends Veiculo
{
	@Override
	public void imprimirVeiculo()
	{
		System.out.println("�NIBUS DA OCORR�NCIA");

		System.out.println("ID VE�CULO:     " + getIdVeiculo());
		System.out.println("OCORR�NCIA:     " +"ID: "+ getOcorrenciaAcidente().getIdOcorrenciaAcidente()+", LOCAL: "+getOcorrenciaAcidente().getLocal());
		System.out.println("MARCA VE�CULO:  " + getMarcaVeiculo());
		System.out.println("MODELO VE�CULO: " + getModeloVeiculo());
		System.out.println("PLACA VE�CULO:  " + getPlacaVeiculo());
	}
}

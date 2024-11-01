package classes;

import abstracts.Veiculo;

public class Vitima {
	private Integer idVitima;
	private Veiculo veiculo;
	private String nomeVitima;
	private String gravidadeVitima;

	public Vitima()
	{
	}

	public Vitima(Integer idVitima, Veiculo veiculo, String nomeVitima, String gravidadeVitima) {
		this.idVitima = idVitima;
		this.veiculo = veiculo;
		this.nomeVitima = nomeVitima;
		this.gravidadeVitima = gravidadeVitima;
	}

	public void imprimirVitima(Vitima vitima) {
		System.out.println("ID V�TIMA:        "+ vitima.getIdVitima());
		System.out.println("OCORR�NCIA:       "+ "ID: "+vitima.getVeiculo().getOcorrenciaAcidente().getIdOcorrenciaAcidente()+", LOCAL: "+vitima.getVeiculo().getOcorrenciaAcidente().getLocal());
		System.out.println("VE�CULO:          "+ "ID: "+vitima.getVeiculo().getIdVeiculo()+", MODELO: " +vitima.getVeiculo().getModeloVeiculo()+", PLACA: " + vitima.getVeiculo().getPlacaVeiculo());
		System.out.println("NOME V�TIMA:      "+ vitima.getNomeVitima());
		System.out.println("GRAVIDADE V�TIMA: "+ vitima.getGravidadeVitima());
	}
	
	public Integer getIdVitima() {
		return idVitima;
	}

	public void setIdVitima(Integer idVitima) {
		this.idVitima = idVitima;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getNomeVitima() {
		return nomeVitima;
	}

	public void setNomeVitima(String nomeVitima) {
		this.nomeVitima = nomeVitima;
	}

	public String getGravidadeVitima() {
		return gravidadeVitima;
	}

	public void setGravidadeVitima(String gravidadeVitima) {
		this.gravidadeVitima = gravidadeVitima;
	}
}

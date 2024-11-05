
// ====================================================================================================================//
package classes;

public class Vitima {
	private Integer idVitima;
	private VeiculoOcorrenciaAcidente veiculoOcorrenciaAcidente;
	private String nomeVitima;
	private String gravidadeVitima;

	public Vitima() {
	}

	public Vitima(Integer idVitima, VeiculoOcorrenciaAcidente veiculoOcorrenciaAcidente, String nomeVitima,
			String gravidadeVitima) {
		this.idVitima = idVitima;
		this.veiculoOcorrenciaAcidente = veiculoOcorrenciaAcidente;
		this.nomeVitima = nomeVitima;
		this.gravidadeVitima = gravidadeVitima;
	}

	public void imprimirVitima(Vitima vitima) {
		System.out.println(vitima.getIdVitima() + ", " 
				+ vitima.getNomeVitima() + ", " 
				+ vitima.getGravidadeVitima() + ", "
				+ vitima.getVeiculoOcorrenciaAcidente().getIdVeiculo()); 
	}

	public Integer getIdVitima() {
		return idVitima;
	}

	public void setIdVitima(Integer idVitima) {
		this.idVitima = idVitima;
	}

	public VeiculoOcorrenciaAcidente getVeiculoOcorrenciaAcidente() {
		return veiculoOcorrenciaAcidente;
	}

	public void setVeiculoOcorrenciaAcidente(VeiculoOcorrenciaAcidente veiculoOcorrenciaAcidente) {
		this.veiculoOcorrenciaAcidente = veiculoOcorrenciaAcidente;
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
// ====================================================================================================================//
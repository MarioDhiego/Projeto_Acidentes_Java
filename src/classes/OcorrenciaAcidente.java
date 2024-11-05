
// ====================================================================================================================//
// PACOTES
package classes;
import abstracts.Ocorrencia;

// Ocorrência do Acidente herda da CLASSE VEÍCULO
public class OcorrenciaAcidente extends Ocorrencia{
	private Integer idOcorrenciaAcidente;
	private String logradouro;
	private String dtAcidente;
	
	public OcorrenciaAcidente() {
	}


	@Override
	public void imprimirOcorrenciaAcidente() {
		System.out.println(getIdOcorrenciaAcidente() + ", " 
				+ getDtAcidente() + ", "
				+ getLogradouro() + ", " 
				+ getLocalOcorrenciaAcidente().getDescricaoLocalOcorrenciaAcidente() + ", "
				+ getLocalOcorrenciaAcidente().getTipoLocal().getDescricaoTipoLocal() + ", "
				+ getBairro().getDescricaoBairro() + ", "
				+ getRodoviaOcorrenciaAcidente().getDescricaoRodovia() + ", "
				+ getRodoviaOcorrenciaAcidente().getTipoRodovia().getDescricaoTipoRodovia() + ", "
				+ getTipoVia().getDescricaoTipoVia() + ", "
				+ getTipoZona().getDescricaoTipoZona() + ", "
				+ getFonte().getDescricaoFonte() + ", "
				+ getCausa().getDescricaoCausa());
	}

	public Integer getIdOcorrenciaAcidente() {
		return idOcorrenciaAcidente;
	}

	public void setIdOcorrenciaAcidente(Integer idOcorrenciaAcidente) {
		this.idOcorrenciaAcidente = idOcorrenciaAcidente;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getDtAcidente() {
		return dtAcidente;
	}

	public void setDtAcidente(String dtAcidente) {
		this.dtAcidente = dtAcidente;
	}
}
// ====================================================================================================================//

package abstracts;

import classes.Bairro;
import classes.Causa;
import classes.Fonte;
import classes.LocalOcorrenciaAcidente;
import classes.RodoviaOcorrenciaAcidente;
import classes.TipoVia;
import classes.TipoZona;

public abstract class Ocorrencia {
	private RodoviaOcorrenciaAcidente rodoviaOcorrenciaAcidente;
	private Fonte fonte;
	private Causa causa;
	private TipoVia tipoVia;
	private TipoZona tipoZona;
	private LocalOcorrenciaAcidente localOcorrenciaAcidente;
	private Bairro bairro;

	public abstract void imprimirOcorrenciaAcidente();

	public RodoviaOcorrenciaAcidente getRodoviaOcorrenciaAcidente() {
		return rodoviaOcorrenciaAcidente;
	}

	public void setRodoviaOcorrenciaAcidente(RodoviaOcorrenciaAcidente rodoviaOcorrenciaAcidente) {
		this.rodoviaOcorrenciaAcidente = rodoviaOcorrenciaAcidente;
	}

	public Fonte getFonte() {
		return fonte;
	}

	public void setFonte(Fonte fonte) {
		this.fonte = fonte;
	}

	public Causa getCausa() {
		return causa;
	}

	public void setCausa(Causa causa) {
		this.causa = causa;
	}

	public TipoVia getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(TipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}

	public TipoZona getTipoZona() {
		return tipoZona;
	}

	public void setTipoZona(TipoZona tipoZona) {
		this.tipoZona = tipoZona;
	}

	public LocalOcorrenciaAcidente getLocalOcorrenciaAcidente() {
		return localOcorrenciaAcidente;
	}

	public void setLocalOcorrenciaAcidente(LocalOcorrenciaAcidente localOcorrenciaAcidente) {
		this.localOcorrenciaAcidente = localOcorrenciaAcidente;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

}

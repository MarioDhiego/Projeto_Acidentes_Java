package interfaces;

import classes.VeiculoOcorrenciaAcidente;
import classes.Vitima;

public interface IvitimaOcorrenciaAcidente {
	public Vitima gravarVitima(Integer id, VeiculoOcorrenciaAcidente veiculoOcorrenciaAcidente, String nome, String gravidade);
	

}

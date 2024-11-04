package interfaces;

import java.util.List;

import classes.OcorrenciaAcidente;
import classes.VeiculoOcorrenciaAcidente;
import classes.Vitima;

public interface ImanutencaoOcorrenciaAcidente {

	public void listarAcidente(OcorrenciaAcidente ocorrenciaAcidente, List<VeiculoOcorrenciaAcidente> veiculoOcorrenciaAcidente, List<Vitima> vitimas);
	
}

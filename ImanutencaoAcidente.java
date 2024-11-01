package interfaces;

import java.util.List;

import abstracts.Veiculo;
import classes.Automovel;
import classes.Motocicleta;
import classes.OcorrenciaAcidente;
import classes.Onibus;
import classes.Vitima;

public interface ImanutencaoAcidente {

	public OcorrenciaAcidente gravarAcidente() throws Exception;
	
	public Automovel gravarAutomovel(OcorrenciaAcidente ocorrenciaAcidente);
	
	public Motocicleta gravarMotocicleta(OcorrenciaAcidente ocorrenciaAcidente);
	
	public Onibus gravarOnibus(OcorrenciaAcidente ocorrenciaAcidente);

	public Vitima gravarVitima(Integer id, Veiculo veiculo, String nome, String gravidade);
	
	public void listarAcidente(OcorrenciaAcidente ocorrenciaAcidente, List<Veiculo> veiculos, List<Vitima> vitimas);
	
}

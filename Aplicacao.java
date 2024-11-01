package aplicacao;

import java.util.ArrayList;
import java.util.List;

import abstracts.Veiculo;
import classes.Automovel;
import classes.ManutencaoAcidente;
import classes.Motocicleta;
import classes.OcorrenciaAcidente;
import classes.Onibus;
import classes.Vitima;

public class Aplicacao
{
	public static void main(String[] args)
	{		
		try
		{
			//---------------- OCORRÊNCIA DE ACIDENTE ---------------
			ManutencaoAcidente manutencaoAcidente = new ManutencaoAcidente();

			OcorrenciaAcidente ocorrenciaAcidente;
			ocorrenciaAcidente = manutencaoAcidente.gravarAcidente();
			
			//---------------- 1° VEÍCULO DA OCORRÊNCIA ---------------
			Automovel automovel = manutencaoAcidente.gravarAutomovel(ocorrenciaAcidente);
			
			//---------------- 2° VEÍCULO DA OCORRÊNCIA ---------------
			Motocicleta motocicleta = manutencaoAcidente.gravarMotocicleta(ocorrenciaAcidente);

			//---------------- 3° VEÍCULO DA OCORRÊNCIA ---------------
			Onibus onibus = manutencaoAcidente.gravarOnibus(ocorrenciaAcidente);

			//---------------- VÍTIMA DO 1° VEÍCULO ---------------
			Vitima vitima = manutencaoAcidente.gravarVitima(1, automovel, "DIEGO VALENTE", "LESÃO CORPORAL LEVE");
			
			//---------------- 2° VÍTMA DO 2° VEÍCULO ---------------
			Vitima vitima2 = manutencaoAcidente.gravarVitima(2, motocicleta, "KLEBER SALIM", "FATAL");
			
			//---------------- 3° VÍTMA DO 3° VEÍCULO ---------------
			Vitima vitima3 = manutencaoAcidente.gravarVitima(3, onibus, "TITO FELIX", "SEM GRAVIDADE");

			//---------------- LISTA DE VEÍCULOS -------------------------
			List<Veiculo> veiculos = new ArrayList<Veiculo>();
			veiculos.add(automovel);
			veiculos.add(motocicleta);
			veiculos.add(onibus);
			
			//-------------------- LISTA DE VEÍCULOS ---------------------
			List<Vitima> vitimas = new ArrayList<Vitima>();
			vitimas.add(vitima);
			vitimas.add(vitima2);
			vitimas.add(vitima3);
			
			//------------------- LISTA A OCORRÊNCIA DE ACIDENTE ----------------
			manutencaoAcidente.listarAcidente(ocorrenciaAcidente, veiculos, vitimas);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

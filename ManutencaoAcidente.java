package classes;

import abstracts.Veiculo;
import interfaces.ImanutencaoAcidente;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ManutencaoAcidente implements ImanutencaoAcidente
{
	@Override
	public OcorrenciaAcidente gravarAcidente() throws Exception
	{
		OcorrenciaAcidente ocorrenciaAcidente = new OcorrenciaAcidente();
		ocorrenciaAcidente.setIdOcorrenciaAcidente(1);
		ocorrenciaAcidente.setFonte("SISTEMA POLICIAL");
		ocorrenciaAcidente.setLocal("CASTANHAL");
		ocorrenciaAcidente.setBairro("JARDIM DAS ACÁCIAS");
		ocorrenciaAcidente.setLogradouro("AV. PRICIPAL");
		// CONVERTE STRING PARA DATA
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAcidente;
		dataAcidente = formato.parse("04/10/2024");
		ocorrenciaAcidente.setDtAcidente(dataAcidente);
		ocorrenciaAcidente.setCausa("MANOBRA IRREGULAR");
		return ocorrenciaAcidente;
	}

	@Override
	public Automovel gravarAutomovel(OcorrenciaAcidente ocorrenciaAcidente)
	{
		Automovel automovel = new Automovel();
		
		automovel.setIdVeiculo(1);
		automovel.setOcorrenciaAcidente(ocorrenciaAcidente);
		automovel.setMarcaVeiculo("TOYOTA");
		automovel.setModeloVeiculo("ETIOS - HATCH");
		automovel.setPlacaVeiculo("QVD0813");
		return automovel;
	}

	@Override
	public Motocicleta gravarMotocicleta(OcorrenciaAcidente ocorrenciaAcidente)
	{
		Motocicleta motocicleta = new Motocicleta();
		
		motocicleta.setIdVeiculo(2);
		motocicleta.setOcorrenciaAcidente(ocorrenciaAcidente);
		motocicleta.setMarcaVeiculo("HONDA");
		motocicleta.setModeloVeiculo("SCOOTER - FORZA 350");
		motocicleta.setPlacaVeiculo("ABC0029");
		return motocicleta;
	}

	@Override
	public Onibus gravarOnibus(OcorrenciaAcidente ocorrenciaAcidente)
	{
		Onibus onibus = new Onibus();
		
		onibus.setIdVeiculo(3);
		onibus.setMarcaVeiculo("SCANNER");
		onibus.setModeloVeiculo("CAIO");
		onibus.setPlacaVeiculo("JWC9476");
		onibus.setOcorrenciaAcidente(ocorrenciaAcidente);
		
		return onibus;
	}
	
	@Override
	public Vitima gravarVitima(Integer id, Veiculo veiculo, String nome, String gravidade)
	{
		Vitima vitima = new Vitima();
		vitima.setIdVitima(id);
		vitima.setVeiculo(veiculo);
		vitima.setNomeVitima(nome);
		vitima.setGravidadeVitima(gravidade);
		return vitima;
	}


	@Override
	public void listarAcidente(
			OcorrenciaAcidente ocorrenciaAcidente,
			List<Veiculo> veiculos,
			List<Vitima> vitimas
			)
	{
		System.out.println("OCORRÊNCIA");
		System.out.println("----------------------------------------");
		ocorrenciaAcidente.imprimirOcorrencia(ocorrenciaAcidente);
		System.out.println("");
		System.out.println("VE͍CULOS");
		for (Veiculo veiculo : veiculos)
		{
			System.out.println("----------------------------------------");
			veiculo.imprimirVeiculo();
			System.out.println("");
		}
		System.out.println("VÍTIMAS");
		for (Vitima vitima : vitimas)
		{
			System.out.println("----------------------------------------");
			vitima.imprimirVitima(vitima);
			System.out.println("");
		}
	}

}

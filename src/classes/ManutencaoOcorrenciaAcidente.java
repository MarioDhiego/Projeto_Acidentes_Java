package classes;

import interfaces.ImanutencaoOcorrenciaAcidente;
import interfaces.IocorrenciaAcidente;
import interfaces.IveiculoOcorrenciaAcidente;
import interfaces.IvitimaOcorrenciaAcidente;
import java.util.List;

public class ManutencaoOcorrenciaAcidente implements ImanutencaoOcorrenciaAcidente, IocorrenciaAcidente, IveiculoOcorrenciaAcidente, IvitimaOcorrenciaAcidente {

	@Override
	public OcorrenciaAcidente gravarOcorrenciaAcidente(Integer idOcorrenciaAcidente, 
			String logradouro,	
			String dtAcidente, 
			RodoviaOcorrenciaAcidente rodoviaOcorrenciaAcidente, 
			Fonte fonte, 
			Causa causa,
			TipoVia tipoVia,
			TipoZona tipoZona,
			LocalOcorrenciaAcidente localOcorrenciaAcidente,
			Bairro bairro) {
		
		OcorrenciaAcidente ocorrenciaAcidente  = new OcorrenciaAcidente();
		ocorrenciaAcidente.setIdOcorrenciaAcidente(idOcorrenciaAcidente);
		ocorrenciaAcidente.setLogradouro(logradouro);
		ocorrenciaAcidente.setDtAcidente(dtAcidente);
		ocorrenciaAcidente.setRodoviaOcorrenciaAcidente(rodoviaOcorrenciaAcidente);
		ocorrenciaAcidente.setFonte(fonte);
		ocorrenciaAcidente.setCausa(causa);
		ocorrenciaAcidente.setTipoVia(tipoVia);
		ocorrenciaAcidente.setTipoZona(tipoZona);
		ocorrenciaAcidente.setLocalOcorrenciaAcidente(localOcorrenciaAcidente);
		ocorrenciaAcidente.setBairro(bairro);
		
		return ocorrenciaAcidente;
	}

	@Override
	public VeiculoOcorrenciaAcidente gravarVeiculoOcorrenciaAcidente(Integer idVeiculo, 
			OcorrenciaAcidente ocorrenciaAcidente, 
			MarcaModeloVeiculo marcaModeloVeiculo, 
			TipoVeiculo tipoVeiculo, 
			Integer anoFabricacao, 
			String placa) {
		
		VeiculoOcorrenciaAcidente veiculoOcorrenciaAcidente = new VeiculoOcorrenciaAcidente();

		veiculoOcorrenciaAcidente.setIdVeiculo(idVeiculo);
		veiculoOcorrenciaAcidente.setOcorrenciaAcidente(ocorrenciaAcidente);
		veiculoOcorrenciaAcidente.setMarcaModeloVeiculo(marcaModeloVeiculo);
		veiculoOcorrenciaAcidente.setTipoVeiculo(tipoVeiculo);
		veiculoOcorrenciaAcidente.setAnofabricacao(anoFabricacao);
		veiculoOcorrenciaAcidente.setPlacaVeiculo(placa);

		return veiculoOcorrenciaAcidente;
	}

	@Override
	public Vitima gravarVitima(Integer id, 
			VeiculoOcorrenciaAcidente veiculoOcorrenciaAcidente, 
			String nome, 
			String gravidade) {
		
		Vitima vitima = new Vitima(id, veiculoOcorrenciaAcidente, nome, gravidade);

		return vitima;
	}

	@Override
	public void listarAcidente(OcorrenciaAcidente ocorrenciaAcidente, List<VeiculoOcorrenciaAcidente> veiculosOcorrenciaAcidente, List<Vitima> vitimas) {
		System.out.println("=======================================================================================");
		System.out.println("------------------------ OCORRÊNCIAS DE ACIDENTE DE TRÂNSITO --------------------------");
		System.out.println("ID OCORRÊNCIA, DATA ACIDENTE, LOGRADOURO DO ACIDENTE, LOCAL, TIPO LOCAL");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("BAIRRO, RODOVIA, TIPO RODOVIA, TIPO VIA, TIPO ZONA, FONTE, CAUSA");
		System.out.println("=======================================================================================");
		System.out.println("");
		System.out.println("");
		System.err.println(" ------------------------------ Resultado da Ocorrência -------------------------------");
		ocorrenciaAcidente.imprimirOcorrenciaAcidente();
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("=======================================================================================");
		System.out.println("---------------- VEÍCULOS DA OCORRÊNCIA DE ACIDENTE DE TRÂNSITO -----------------------");
		System.err.println("=======================================================================================");
		System.out.println("ID VEÍCULO, MARCA, MODELO, TIPO DE VEÍCULO, PLACA, ID OCORRÊNCIA");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("");
		for (VeiculoOcorrenciaAcidente veiculoOcorrenciaAcidente : veiculosOcorrenciaAcidente) {
			veiculoOcorrenciaAcidente.imprimirVeiculo();
		}
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("=======================================================================================");
		System.out.println("---------------- VÍTIMAS DO VEÍCULO DA OCORRÊNCIA DE ACIDENTE DE TRÂNSITO -------------");
		System.out.println("ID VÍTIMA, NOME VÍTIMA, GRAVIDADE VÍTIMA, ID VEÍCULO");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("");
		System.err.println("------------------------------ Resultado das Vítimas ----------------------------------");
		System.out.println("=======================================================================================");
		for (Vitima vitima : vitimas) {
			vitima.imprimirVitima(vitima);
		}
		System.out.println("=======================================================================================");
	}
}
// ====================================================================================================================//

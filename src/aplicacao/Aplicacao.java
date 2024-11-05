
// =====================================================================================================================//
// -------------------------- UNIVERSIDADE FEDERAL DO PÁRA -------------------------------------------------------------//
// -------------------------- FACULDADE DE COMPUTAÇÃO      -------------------------------------------------------------//
// -------------------------- PROF: GUSTAVO HENRIQUE LIMA PINTO --------------------------------------------------------//
// -------------------------- ALUNO: MÁRIO DIEGO VALENTE   -------------------------------------------------------------//
// =====================================================================================================================//

// =====================================================================================================================//
// PACOTES
package aplicacao;
import classes.Bairro;
import classes.Causa;
import classes.Fonte;
import classes.LocalOcorrenciaAcidente;
import classes.ManutencaoOcorrenciaAcidente;
import classes.MarcaModeloVeiculo;
import classes.OcorrenciaAcidente;
import classes.RodoviaOcorrenciaAcidente;
import classes.TipoLocal;
import classes.TipoRodovia;
import classes.TipoVeiculo;
import classes.TipoVia;
import classes.TipoZona;
import classes.VeiculoOcorrenciaAcidente;
import classes.Vitima;
import java.util.ArrayList;
import java.util.List;

//import java.util.*; // Importa todas as classes do pacote java.util
// =====================================================================================================================//


// =====================================================================================================================//
public class Aplicacao
{
	public static void main(String[] args)
	{
		ManutencaoOcorrenciaAcidente manutencaoAcidente = new ManutencaoOcorrenciaAcidente();

//---------------- 1ª OCORRÊNCIA DE ACIDENTE DE TRÂNSITO-----------------------------------------------------------//
		Integer idOcorrenciaAcidente = Integer.valueOf("1");
		String logradouro = "AV. PEDRO ÁLVARES CABRAL";
		String dtAcidente = "02/11/2024";
		RodoviaOcorrenciaAcidente rodoviaOcorrenciaAcidente = new RodoviaOcorrenciaAcidente();
		rodoviaOcorrenciaAcidente.setIdRodovia(Integer.valueOf("1"));
		rodoviaOcorrenciaAcidente.setDescricaoRodovia("BR316");

// -------------- TIPO DE RODOVIA (Municipal, Estadual, Federal) ------------------------------------------------------//
		TipoRodovia tipoRodovia = new TipoRodovia();
		tipoRodovia.setIdTipoRodovia(Integer.valueOf("1"));
		tipoRodovia.setDescricaoTipoRodovia("FEDERAL");
		
		rodoviaOcorrenciaAcidente.setTipoRodovia(tipoRodovia);

// -------------- FONTE DO DADO (PM, PC, Bombeiro, etc.) --------------------------------------------------------------// 
		Fonte fonte = new Fonte();
		fonte.setIdFonte(Integer.valueOf("1"));
		fonte.setDescricaoFonte("POLÍCIA CIVIL(BOAT)");

// -------------- CAUSA PRINCIPAL ACIDENTE  ---------------------------------------------------------------------------//
		Causa causa = new Causa();
		causa.setIdCausa(Integer.valueOf("1"));
		causa.setDescricaoCausa("Manobra Irregular");

// -------------- TIPO DE VIA -----------------------------------------------------------------------------------------//
		TipoVia tipoVia = new TipoVia();
		tipoVia.setIdTipoVia(Integer.valueOf("1"));
		tipoVia.setDescricaoTipoVia("MUNICIPAL");

		TipoZona tipoZona = new TipoZona();
		tipoZona.setIdTipoZona(Integer.valueOf("1"));
		tipoZona.setDescricaoTipoZona("URBANA");
		
		LocalOcorrenciaAcidente localOcorrenciaAcidente = new LocalOcorrenciaAcidente();
		localOcorrenciaAcidente.setIdLocalOcorrenciaAcidente(Integer.valueOf("1"));
		localOcorrenciaAcidente.setDescricaoLocalOcorrenciaAcidente("BELÉM");
		
		TipoLocal tipoLocal = new TipoLocal();
		tipoLocal.setIdTipoLocal(Integer.valueOf("1"));
		tipoLocal.setDescricaoTipoLocal("MUNICÍPIO");
		
		localOcorrenciaAcidente.setTipoLocal(tipoLocal);

// -------------- BAIRRO DO ACIDENTE ----------------------------------------------------------------------------------//
		Bairro bairro = new Bairro();
		bairro.setIdBairro(Integer.valueOf("1"));
		bairro.setDescricaoBairro("CASTANHEIRA");
		
		OcorrenciaAcidente ocorrenciaAcidente1 = manutencaoAcidente.gravarOcorrenciaAcidente(
			idOcorrenciaAcidente, 
			logradouro, dtAcidente, 
			rodoviaOcorrenciaAcidente, 
			fonte, causa, 
			tipoVia, 
			tipoZona, 
			localOcorrenciaAcidente, 
			bairro);
	
// ---------------- 1º VEÍCULO DA OCORRÊNCIA DE ACIDENTE DE TRÂNSITO --------------------------------------------------//
// ---------------- MARCA, MODELO DO VEÍCULO --------------------------------------------------------------------------//
		Integer idVeiculo = Integer.valueOf("1");
		Integer anoFabricacao = Integer.valueOf("2019");
		String placa = "QVD8620";

		MarcaModeloVeiculo marcaModeloVeiculo = new MarcaModeloVeiculo();
		marcaModeloVeiculo.setIdMarcaVeiculo(Integer.valueOf("1"));
		marcaModeloVeiculo.setMarcaVeiculo("TOYOTA");
		marcaModeloVeiculo.setModeloVeicjo("ETIOS - HATCH");

// ---------------- TIPO DE VEÍCULO -----------------------------------------------------------------------------------//
		TipoVeiculo tipoVeiculo = new TipoVeiculo();
		tipoVeiculo.setIdTipoVeiculo(Integer.valueOf("1"));
		tipoVeiculo.setTipoVeiculo("AUTOMÓVEL");

		VeiculoOcorrenciaAcidente veiculoOcorrenciaAcidente1 = manutencaoAcidente.gravarVeiculoOcorrenciaAcidente(idVeiculo, ocorrenciaAcidente1, marcaModeloVeiculo, tipoVeiculo, anoFabricacao, placa);
		
// ---------------- VÍTIMA DO 1º VEÍCULO -------------------------------------------------------------------------------//
		Vitima vitima1 = manutencaoAcidente.gravarVitima(1, veiculoOcorrenciaAcidente1, "Mario Diego Valente", "LESÃO CORPORAL LEVE");
		
// ---------------- 2º VEÍCULO DA OCORRÊNCIA DE ACIDENTE DE TRÂNSITO --------------------------------------------------//
		idVeiculo = Integer.valueOf("2");
		anoFabricacao = Integer.valueOf("2024");
		placa = "ABC0029";

// ---------------- MARCA, MODELO DO VEÍCULO --------------------------------------------------------------------------//
		marcaModeloVeiculo = new MarcaModeloVeiculo();
		marcaModeloVeiculo.setIdMarcaVeiculo(Integer.valueOf("2"));
		marcaModeloVeiculo.setMarcaVeiculo("HONDA");
		marcaModeloVeiculo.setModeloVeicjo("SCOOTER - FORZA 350");

	//TIPO DE VEÍCULO
		tipoVeiculo = new TipoVeiculo();
		tipoVeiculo.setIdTipoVeiculo(Integer.valueOf("2"));
		tipoVeiculo.setTipoVeiculo("MOTOCICLETA");

		VeiculoOcorrenciaAcidente veiculoOcorrenciaAcidente2 = manutencaoAcidente.gravarVeiculoOcorrenciaAcidente(idVeiculo, ocorrenciaAcidente1, marcaModeloVeiculo, tipoVeiculo, anoFabricacao, placa);
		
	//---------------- VÍTIMA DO 2º VEÍCULO ----------------------------------------------------------------------------
		Vitima vitima2 = manutencaoAcidente.gravarVitima(2, veiculoOcorrenciaAcidente2, "Kleber Bezerra Salim", "ÓBITO");
		
	//---------------- CRIA LISTA DE VEÍCULOS --------------------------------------------------------------------------
		List<VeiculoOcorrenciaAcidente> veiculosOcorrenciaAcidente = new ArrayList<>();
		veiculosOcorrenciaAcidente.add(veiculoOcorrenciaAcidente1);
		veiculosOcorrenciaAcidente.add(veiculoOcorrenciaAcidente2);
		
	//-------------------- CRIAR LISTA DE VEÍCULOS ---------------------------------------------------------------------
		List<Vitima> vitimas = new ArrayList<>();
		vitimas.add(vitima1);
		vitimas.add(vitima2);


	//------------------- IMPRIME AS CORRÊNCIAS DE ACIDENTE ------------------------------------------------------------
		manutencaoAcidente.listarAcidente(ocorrenciaAcidente1, veiculosOcorrenciaAcidente, vitimas);
	}

}
// =====================================================================================================================//
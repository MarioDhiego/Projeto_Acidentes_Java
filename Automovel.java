
public class Automovel extends Veiculo{
       @Override
       public void imprimirVeiculo() {
              System.out.println("AUTOMOVEL DA OCORRÊNCIA");
              System.out.println("ID VEICULO: " + getIdVeiculo());
              System.out.println("OCORRENCIA: " + "ID: " + "getOcorrenciaAcidente().getIdOcorrenciaAcidente()+", "LOCAL: "+getOcorrenciaAcidente().getLocal());
              System.out.println("MARCA VEÍCULO: " + getMarcaVeiculo());
              System.out.println("MODELO VEÍCULO: " + getModeloVeiculo());
              System.out.println("PLACA VEÍCULO: " + getPlacaVeiculo());
              
       }

}
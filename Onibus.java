

public class Onibus extends Veiculo{
    @Override
    public void imprimirVeiculo(){
        System.out.println("ÔNIBUS DA OCORRÊNCIA");
        System.err.println("ID VEÍCULO: " + getIdVeiculo());
        System.out.println("OCORRÊNCIA: " + "ID:" + "getOcorrenciaAcidente().getIdOcorrenciaAcidente()+","LOCAL: "+getOcorrenciaAcidente().getLocal());
        System.out.println("MARCA VEÍCULO: " + getMarcaVeiculo());
        System.out.println("MODELO VEÍCULO: " + getModeloVeiculo());
        System.out.println("PLACA VEÍCULO: " + getPlacaVeiculo());
    }
    
}
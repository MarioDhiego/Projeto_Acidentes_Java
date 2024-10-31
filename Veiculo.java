 
// Universidade Federal do Pará   //
// Disciplina: Programação II     //
// Professor: Gustavo             //

public abstract class Veiculo {
       private Integer idVeiculo;
       private OcorrenciaAcidente OcorrenciaAcidente;
       private String marcaVeiculo;
       private String modeloVeiculo;
       private String placaVeiculo;

// ----- IDENTIFICAÇÃO DO VEICULO ----- //
public Integer getIdVeiculo(){
        return idVeiculo;
}
public void setIdVeiculo(Integer idVeiculo){
    this.idVeiculo = idVeiculo;
}
//  --------------------------------  //

//  ------  MARCA DO VEICULO   -----  //
public String getMarcaVeiculo() {
        return marcaVeiculo;
}
public void setIdMarcaVeiculo(String marcaVeiculo){
       this.marcaVeiculo = marcaVeiculo;
}
//  -----------------------------  ///

//  ----- MODELO DO VEICULO  -----  //
public String getModeloVeiculo(){
    return modeloVeiculo;
}
public void setIdModeloVeiculo(String modeloVeiculo){
    this.modeloVeiculo = modeloVeiculo;
}
//  -----------------------------  ///

//  ----- PLACA DO VEICULO  -----  //
public String getPlacaVeiculo(){
    return placaVeiculo;
}
public void setIdPlacaVeiculo(String placaVeiculo){
    this.placaVeiculo = placaVeiculo;
}
//  -----------------------------  ///
}
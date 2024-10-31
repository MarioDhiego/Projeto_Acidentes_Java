
public class OcorrenciaAcidente{
        private Integer idOcorrenciaAcidente;
        private String fonte;
        private String local;
        private String bairro;
        private String logradouro;
        private Date dtAcidente;
        private String causa;

// ----- CONSTRUTORES       -----  //
        public OcorrenciaAcidente() {
        }
        public OcorrenciaAcidente(
            Integer idOcorrenciaAcidente,
            String fonte, 
            String local, 
            String bairro, 
            String logradouro, 
            Date dtAcidente,
            String causa){
            this.idOcorrenciaAcidente = idOcorrenciaAcidente;
            this.fonte = fonte;
            this.local = local;
            this.bairro = bairro;
            this.logradouro =  logradouro;
            this.dtAcidente = dtAcidente;
            this.causa = causa;
        }
        public void imprimirOcorrencia(OcorrenciaAcidente ocorrenciaAcidente){
            System.out.println("ID OCORRÊNCIA: " + ocorrenciaAcidente.getIdOcorrenciaAcidente());   
            System.err.println("FONTE: " + ocorrenciaAcidente.getFonte());
            System.out.println("LOCAL: " + ocorrenciaAcidente.getLocal());
            System.err.println("BAIRRO: " + ocorrenciaAcidente.getBairro());
            System.out.println("LOGRADOURO: " + ocorrenciaAcidente.getLogradouro());
            System.err.println("DATA: " + ocorrenciaAcidente.getDtAcidente());
            System.out.println("CAUSA: " + ocorrenciaAcidente.getCausa());
        }
        public Integer getIdOcorrenciaAcidente(){
                return idOcorrenciaAcidente;
            }
        public void setIdOcorrenciaAcidente(Integer idOcorrenciaAcidente){
            this.idOcorrenciaAcidente = idOcorrenciaAcidente;
        }
        public String getFonte(){
            return fonte;
        }
        public void setFonte(String fonte){
            this.fonte = fonte;
        }
        public String getLocal(){
            return local;
        }
        public void setLocal(String local){
            this.local = local;
        }
        public String getBairro(){
            return bairro;
        }
        public void setBairro(String bairro){
            this.bairro = bairro;
        }
        public String getLogradouro(){
            return logradouro;
        }
        public void setLogradouro(String logradouro){
            this.logradouro = logradouro;
        }
        public String getDtAcidente(){
            return dtAcidente;
        }
        public void setDtAcidente(Date dtAcidente){
            this.dtAcidente = dtAcidente;
        }
        public String getCausa(){
            return causa;
        }
        public void setCausa(String causa){
            this.causa = causa;
        }
}
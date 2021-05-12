public class Chatbot {

    private Resposta rSimples;
    private Resposta rContador;
    private Resposta rHora;
    private Resposta rData;
    private Resposta rAleatoria;
    
    public void adiciona(Resposta r) {
        if (r instanceof RespostaSimples) {
            this.rSimples = r;
        }
        if (r instanceof RespostaContador){
            this.rContador = r; 
        }
        if (r instanceof RespostaHora) {
            this.rHora = r;
        }
        if (r instanceof RespostaData) {
            this.rData = r;
        }
        if (r instanceof RespostaAleatoria) {
            this.rAleatoria = r;
        }
    }

    public String processar(String texto){
        if(rSimples.verifica(texto)){

            return rSimples.produz();

        }
        if(rContador.verifica(texto)){

            return rContador.produz();

        }
        if(rHora.verifica(texto)){

            return rHora.produz();

        }
        if(rData.verifica(texto)){

            return rData.produz();

        }
        if(rAleatoria.verifica(texto)){

            return rAleatoria.produz();

        }
        else{

            return "Não entendi, pode repetir?";

        }
    }

}
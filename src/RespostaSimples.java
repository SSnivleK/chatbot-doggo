public class RespostaSimples extends Resposta{

    private String resposta;
    private String entrada;

    public RespostaSimples(String entrada, String resposta) {
        this.entrada = entrada;
        this.resposta = resposta;
    }

    @Override
    public boolean verifica(String texto){
        if (texto.contains(entrada)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String produz() {
        return resposta;
    }

}
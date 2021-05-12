public class RespostaContador extends Resposta {

    private int cont;
    private String entrada;

    public RespostaContador(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public boolean verifica(String texto){
        if (texto.contains(entrada)) {
            this.cont++;
            return true;
        } else { 
            return false;
        }
    }

    @Override
    public String produz() {
        return "O contador está em: " + this.cont;
    }

}

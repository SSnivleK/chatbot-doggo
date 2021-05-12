import java.util.Random;
import java.util.ArrayList;

public class RespostaAleatoria  extends Resposta{
  private String entrada;
  private ArrayList<String> resposta;
  private int selec;
  Random gerador = new Random();

  public RespostaAleatoria(String entrada, ArrayList<String> resposta){
    this.entrada = entrada;
    this.resposta = resposta;
}

  public void selecionaRandom(){
    for (int i = 0; i < resposta.size(); i++){
        this.selec = gerador.nextInt(resposta.size());
    }
}

  @Override
    public boolean verifica(String texto){
        if (texto.contains(entrada)){
            return true;
        } 
        else{
            return false;
        }
    }

    @Override
    public String produz(){
        selecionaRandom();
        return resposta.get(selec);
    }

}
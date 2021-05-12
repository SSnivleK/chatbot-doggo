import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RespostaHora extends Resposta {
    private String entrada;
    LocalTime hrBase = LocalTime.now();

    public RespostaHora(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public boolean verifica(String texto){
        if (texto.contains(entrada)) {
            this.hrBase = LocalTime.now();
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String produz() {
        String hrCorreto = hrBase.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return "São " + hrCorreto;
    }

}
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RespostaData extends Resposta {
    private String entrada;
    LocalDate dtBase = LocalDate.now();

    public RespostaData(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public boolean verifica(String texto){
        if (texto.contains(entrada)) {
            this.dtBase = LocalDate.now();
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String produz() {
        String dtCorreto = dtBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return "Hoje é " + dtCorreto;
    }

}
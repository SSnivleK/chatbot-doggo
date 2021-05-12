import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Chatbot bot = new Chatbot();

        Resposta r0 = new RespostaSimples("nome", "Meu nome é Doggo");
        Resposta r1 = new RespostaContador("conta");
        Resposta r2 = new RespostaHora("hora");
        Resposta r3 = new RespostaData("data");

        ArrayList<String> piadas = new ArrayList<>();
        piadas.add("Qual é o peixe baterista ? A truta !");
        piadas.add("Qual é o peixe que cai do céu? Atum !");
        piadas.add("Qual o estado que solta hadouken? O Ryu de Janeiro");
        piadas.add("O que a polícia do Street Fighter faz? Honda");
        piadas.add("Qual o game que está sempre gripado? O Overwatchim");
        Resposta r4 = new RespostaAleatoria ("piada", piadas);

        bot.adiciona(r0);
        bot.adiciona(r1);
        bot.adiciona(r2);
        bot.adiciona(r3);
        bot.adiciona(r4);

        Scanner texto = new Scanner(System.in);

        String frase;

        while(true){
            System.out.print(">");
            frase = texto.nextLine();
            System.out.println(bot.processar(frase));
        }

    }

}
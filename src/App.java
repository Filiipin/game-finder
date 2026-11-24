// PASSO 1 - o coração do programa.

import java.util.Scanner;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Game Finder!");
        System.out.println("Responda algumas perguntas para que possamos te indicar jogos que combinam com você.");

        String[] respostas = new String[Questionario.perguntas.length];

        for (int i = 0; i < Questionario.perguntas.length; i++) {
            System.out.println("\n" + (i + 1) + ". " + Questionario.perguntas[i]);

            String[] opcoesDasPerguntas = Questionario.opcoes[i];
            for (int j = 0; j < opcoesDasPerguntas.length; j++) {
                System.out.println("  " + (j + 1) + ") " + opcoesDasPerguntas[j]);
            }
    }
}

// PASSO 1 - o coração do programa.

import java.util.List;
import java.util.Scanner;

public class RecomendadorJogos {

    public static void main (String[] args) {
        List<Jogo> catalogo = CatalogoJogos.listarJogos();
        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.println("Qual o seu gênero favorito? (Acao, Tiro, RPG, Sobrevivencia, Estrategia, Simulacao, Puzzle)");
        String genero = scanner.nextLine().trim();

        System.out.println("Quanto tempo você tem para jogar? (Curto, Medio, Longo)");
        String tempo = scanner.nextLine().trim();

        System.out.println("Qual nível de dificuldade você prefere? (Facil, Media, Dificil)");
        String dificuldade = scanner.nextLine().trim();

        System.out.println("Qual ritmo de jogo você prefere? (Lento, Moderado, Acelerado)");
        String ritmo = scanner.nextLine().trim();

        System.out.println("Qual modo de jogo você prefere? (Singleplayer, Multiplayer, Ambos)");
        String modoJogo = scanner.nextLine().trim();
        
        scanner.close();

        Jogo melhorJogo = null;
        double maiorPontuacao = -1.0;

            for (Jogo jogo : catalogo) {
            double pontuacao = 0.0;

                if (jogo.getGenero().equalsIgnoreCase(genero)) {
                    pontuacao += 3.0;
                }

                if (jogo.getTempo().equalsIgnoreCase(tempo)) {
                    pontuacao += 2.0;
                }

                if (jogo.getDificuldade().equalsIgnoreCase(dificuldade)) {
                    pontuacao += 2.0;
                }

                if (jogo.getRitmo().equalsIgnoreCase(ritmo)) {
                    pontuacao += 1.5;
                }

                if (jogo.getModoJogo().equalsIgnoreCase(modoJogo)) {
                    pontuacao += 3.0;
                }
            }
    }
}
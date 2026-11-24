//PASSO 3 - a classe Questionario (Arrays unidimensionais e bidimensionais).

public class Questionario {
    
    public static final String[] perguntas = 
    
    {
        "Como você está se sentindo hoje?",
        "O que você procura ao jogar hoje?",
        "Qual plataforma você mais joga?",
        "Qual gênero de jogo você prefere?",
        "Qual nível de desafio você deseja?"
    };

    public static final String[][] opcoes = 

    {
        {"Animado", "Tranquilo", "Estressado", "Cansado"},
        {"Adrenalina", "Relaxar", "Explorar", "Me divertir"},
        {"PC", "PS5", "Xbox"},
        {"FPS / Ação", "RPG / Aventura", "Corrida / Esportes", "Simulação / Estratégia"},
        {"Fácil", "Moderado", "Difícil"}
    };
}

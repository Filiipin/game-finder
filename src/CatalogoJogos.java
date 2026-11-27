// Passo 3: o catalogo de jogos.

import java.util.List;

public class CatalogoJogos {

    public static List<Jogo> listarJogos() {

       return List.of( 
            // Acao & Aventura / Clássicos
            new Jogo("God of War", 9.4, "Acao", "Jornada mitologica com combate visceral e narrativa marcante", "Medio", "Media", "Acelerado", "Singleplayer"),
            new Jogo("The Last of Us Part I", 9.3, "Acao", "Sobrevivencia e narrativa cinematografica em mundo pos-apocaliptico", "Medio", "Media", "Moderado", "Singleplayer"),
            new Jogo("Dark Souls Remastered", 8.9, "RPG", "RPG sombrio de alta dificuldade, combate tatico e lore profundo", "Longo", "Dificil", "Moderado", "Ambos"),
            new Jogo("Sekiro: Shadows Die Twice", 9.0, "Acao", "Combate de precisao e parry milimetrico no Japao feudal", "Medio", "Dificil", "Acelerado", "Singleplayer"),
            new Jogo("Hades", 8.9, "Acao", "Roguelike frenetico enfrentando divindades do submundo", "Curto", "Media", "Acelerado", "Singleplayer"),
            new Jogo("Hollow Knight", 9.0, "Acao", "Exploracao metroidvania 2D em reino subterraneo decadente", "Longo", "Dificil", "Moderado", "Singleplayer"),

            // Tiroteio & Multiplayer Competitivo / Cooperativo
            new Jogo("Call of Duty: Modern Warfare", 8.2, "Tiro", "Combate tatico militar em primeira pessoa com ritmo intenso", "Curto", "Media", "Acelerado", "Ambos"),
            new Jogo("Battlefield 1", 8.5, "Tiro", "Guerras em larga escala com veiculos terrestres, aereos e destruicao", "Medio", "Media", "Acelerado", "Ambos"),
            new Jogo("Helldivers 2", 8.6, "Tiro", "Combate cooperativo galactico caotico em terceira pessoa", "Curto", "Media", "Acelerado", "Multiplayer"),
            new Jogo("Tom Clancy's Rainbow Six Siege", 8.0, "Tiro", "Tiro tatico em equipes com destruicao de cenarios e gadgets", "Curto", "Dificil", "Acelerado", "Multiplayer"),

            // RPG & Fantasia / Mundo Aberto
            new Jogo("Elden Ring", 9.2, "RPG", "Exploracao livre e chefes imponentes nas Terras Intermedias", "Longo", "Dificil", "Moderado", "Ambos"),
            new Jogo("Baldur's Gate 3", 9.6, "RPG", "RPG tatico com profundidade de escolhas e regras de mesa", "Longo", "Media", "Lento", "Ambos"),
            new Jogo("The Witcher 3: Wild Hunt", 9.3, "RPG", "Caca a monstros e decisoes morais em mundo aberto detalhado", "Longo", "Media", "Moderado", "Singleplayer"),
            new Jogo("Cyberpunk 2077", 8.3, "RPG", "Mundo aberto futurista em Night City com combate cibernetico", "Longo", "Media", "Moderado", "Singleplayer"),
            new Jogo("Skyrim", 8.6, "RPG", "Mundo fantastico medieval com total liberdade de construcao de personagem", "Longo", "Facil", "Lento", "Singleplayer"),

            // Sobrevivencia & Gerenciamento Hostil
            new Jogo("Project Zomboid", 8.9, "Sobrevivencia", "Sobrevivencia isometrica realista a apocalipse zumbi", "Longo", "Dificil", "Lento", "Ambos"),
            new Jogo("Subnautica", 8.8, "Sobrevivencia", "Mergulho, construcao de bases e misterio em oceano extraterrestre", "Medio", "Media", "Lento", "Singleplayer"),
            new Jogo("Valheim", 8.4, "Sobrevivencia", "Exploracao, colheita e construcao viking com geracao procedural", "Longo", "Media", "Moderado", "Ambos"),
            new Jogo("The Long Dark", 8.3, "Sobrevivencia", "Luta contra frio extremo e fome na natureza selvagem", "Longo", "Dificil", "Lento", "Singleplayer"),
            new Jogo("Rust", 7.8, "Sobrevivencia", "Construcao de fortes e combates disputados em servidores multiplayer", "Longo", "Dificil", "Moderado", "Multiplayer"),

            // Estrategia & Automacao
            new Jogo("Satisfactory", 8.6, "Estrategia", "Engenharia de fabricas gigantescas e automacao em primeira pessoa", "Longo", "Media", "Lento", "Ambos"),
            new Jogo("Factorio", 9.0, "Estrategia", "Criacao de esteiras e logistica com defesa contra criaturas", "Longo", "Media", "Moderado", "Ambos"),
            new Jogo("RimWorld", 8.8, "Estrategia", "Gestao de colonia espacial com simulador de historias emergentes", "Longo", "Dificil", "Lento", "Singleplayer"),
            new Jogo("Civilization VI", 8.5, "Estrategia", "Conduza um imperio desde a idade da pedra ate a era espacial", "Longo", "Media", "Lento", "Ambos"),
            new Jogo("Age of Empires IV", 8.1, "Estrategia", "Batalhas historicas medievais em tempo real com exercitos massivos", "Medio", "Media", "Moderado", "Ambos"),

            // Simulacao & Construcao
            new Jogo("Cities: Skylines", 8.4, "Simulacao", "Planejamento urbano, trafego viario e infraestrutura municipal", "Longo", "Media", "Lento", "Singleplayer"),
            new Jogo("Stardew Valley", 8.9, "Simulacao", "Vida pacata no campo com plantio, mineracao e relacionamentos", "Longo", "Facil", "Lento", "Ambos"),
            new Jogo("Euro Truck Simulator 2", 8.4, "Simulacao", "Logistica e conducao realista de carretas pelas estradas europeias", "Longo", "Facil", "Lento", "Ambos"),
            new Jogo("Parkitect", 8.3, "Simulacao", "Construcao e administracao de parques de diversoes com montanhas-russas", "Medio", "Media", "Lento", "Singleplayer"),

            // Quebra-cabeca & Logica
            new Jogo("Portal 2", 9.4, "Puzzle", "Desafios com arma de portais e humor acido em laboratorios de testes", "Curto", "Facil", "Moderado", "Ambos"),
            new Jogo("Outer Wilds", 9.0, "Puzzle", "Exploracao planetaria em loop temporal movida a curiosidade", "Medio", "Media", "Lento", "Singleplayer"),
            new Jogo("The Witness", 8.5, "Puzzle", "Ilha misteriosa repleta de paineis de labirintos visuais e ambientais", "Medio", "Dificil", "Lento", "Singleplayer")
       );
    }
}
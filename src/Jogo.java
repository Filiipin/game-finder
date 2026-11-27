//PASSO 2 - a classe Jogo.

// Bloco de atributos (variaveis).
public class Jogo {
    private String nome;
    private double nota;
    private String genero;
    private String descricao;
    private String tempo;
    private String dificuldade;
    private String ritmo;
    private String modoJogo;
/* Usamos private para encapsular as variaveis (atributos), ou seja, para que elas 
não possam ser acessadas diretamente de fora da classe. */

    // Bloco do construtor.
    public Jogo (String nome, double nota, String genero, String descricao, String tempo, String dificuldade, String ritmo, String modoJogo) {
        this.nome = nome;
            this.nota = nota;
            this.genero = genero;
            this.descricao = descricao;
            this.tempo = tempo;
            this.dificuldade = dificuldade;
            this.ritmo = ritmo;
            this.modoJogo = modoJogo;
        }
/* Aqui temos o construtor, ele roda no momento exato que criamos um objeto com a palavra new.
Pense nele como a etapa de montagem inicial da ficha do jogo: quando você faz new Jogo(...), o construtor 
pega os valores que você passou ali e já coloca cada um dentro do seu respectivo atributo (nome, nota, genero, descricao).*/

        // Bloco dos métodos.
        public String getNome() {
            return nome;
        }
        public double getNota() {
            return nota;
        }
        public String getGenero() {
            return genero;
        }
        public String getDescricao() {
            return descricao;
        }
        public String getTempo() {
            return tempo;
        }
        public String getDificuldade() {
            return dificuldade;
        }
        public String getRitmo() {
            return ritmo;
        }
        public String getModoJogo(){
            return modoJogo;
        }
/* E por último os métodos que devolvem o valor de cada atributo private para as outras classes poderem ler */
}
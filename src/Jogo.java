//PASSO 2 - a classe Jogo.

public class Jogo {
    private String nome;
    private double nota;
    private String genero;
    private String descricao;
/* Usamos private para encapsular as variaveis (atributos), ou seja, para que elas 
não possam ser acessadas diretamente de fora da classe. */

    public Jogo (String nome, double nota, String genero, String descricao) {
        this.nome = nome;
            this.nota = nota;
            this.genero = genero;
            this.descricao = descricao;
        }
/* Aqui temos o construtor, ele roda no momento exato que criamos um objeto com a palavra new.
Pense nele como a etapa de montagem inicial da ficha do jogo: quando você faz new Jogo(...), o construtor 
pega os valores que você passou ali e já coloca cada um dentro do seu respectivo atributo (nome, nota, genero, descricao).*/

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

}

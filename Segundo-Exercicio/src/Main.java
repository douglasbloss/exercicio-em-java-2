public class Main {
    public static void main(String[] args) {

        System.out.println("Jogador 1");
        Jogador jogador01 = new Jogador();
        jogador01.adicionarGols(2);
        jogador01.adicionarAssists(1);
        jogador01.nome = "João";

        jogador01.verGols();
        jogador01.verAssists();

        System.out.println("Jogador 2");
        Jogador jogador02 = new Jogador();
        jogador02.adicionarGols(1);
        jogador02.adicionarAssists(4);
        jogador02.nome = "José";

        jogador02.verGols();
        jogador02.verAssists();



        if(jogador01 == jogador02) {
            System.out.println("São iguais");
        }else {
            System.out.println("Não são iguais");
        }

    }
}
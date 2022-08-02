public class Jogador {
        String nome;
        int gols;
        int assists;

        public void adicionarGols(int gols) {
            this.gols = gols;
        }

        public void adicionarAssists(int assists) {
            this.assists = assists;
        }

        public void verGols() {
            System.out.println("O número de gols: " + this.gols);
        }

        public void verAssists() {
            System.out.println("O número de assistências: " + this.assists);
        }

        public boolean equals(Jogador jogador) {
            return this.gols == jogador.gols &&
                   this.assists == jogador.assists &&
                   this.nome == jogador.nome;
        }
    }


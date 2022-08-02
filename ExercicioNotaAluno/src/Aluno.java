public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;


    public Aluno(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota, int nrProva) {

        switch (nrProva) {
            case 1:
            case 2:
                if(nota > 30) {
                    System.out.println("Erro! Nota maior do que o máximo! (30)");
                }else {
                    if(nota1 == 0) {
                        nota1 = nota;
                    }else {
                        nota2 = nota;
                    }
                }
                break;
            case 3:
                if(nota > 40) {
                    System.out.println("Erro! Nota maior do que o máximo! (40)");
                }else {
                    this.nota3 = nota;
                }
                break;
        }
    }




}

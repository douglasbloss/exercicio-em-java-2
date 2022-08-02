import java.text.DecimalFormat;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    DecimalFormat df = new DecimalFormat("#,###.00");
    public Aluno(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota, int nrProva) {

        switch (nrProva) {
            case 1:

                if(nota > 30) {
                    System.out.println("Erro! Nota maior do que o máximo! (30)");
                }else {
                    this.nota1 = nota;
                }
                break;
            case 2:
                if(nota > 30) {
                    System.out.println("Erro Nota maior do que o máximo! (30)");
                }else {
                    this.nota2 = nota;
                }
            case 3:
                if(nota > 40) {
                    System.out.println("Erro! Nota maior do que o máximo! (40)");
                }else {
                    this.nota3 = nota;
                }
                break;
        }
    }
    public String toString() {
        return "Nome do aluno: " + this.nome
                + "\n"
                + "Média do aluno: " + df.format(this.returnaMedia())
                + "\n"
                + "Menor nota do aluno: " + df.format(this.retornaMenorNota())
                + "\n"
                + "Maior nota do aluno: " + df.format(this.retornaMaiorNota());
    }

    public double returnaMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public double retornaMenorNota() {
        if(this.nota1 < this.nota2 && this.nota1 < this.nota3) {
            return this.nota1;
        } else if (this.nota2 < this.nota1 && this.nota2 < this.nota3) {
            return this.nota2;
        } else if (this.nota3 < this.nota1 && this.nota3 < this.nota2) {
            return this.nota3;
        }
        return 0;
    }

    public double retornaMaiorNota() {
        if(this.nota1 > this.nota2 && this.nota1 > this.nota3) {
            return this.nota1;
        } else if (this.nota2 > this.nota1 && this.nota2 > this.nota3) {
            return this.nota2;
        } else if (this.nota3 > this.nota1 && this.nota3 > this.nota2) {
            return this.nota3;
        }
        return 0;
    }
}
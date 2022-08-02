public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Maria");
        aluno01.adicionarNota(25,1);
        aluno01.adicionarNota(30,2);
        aluno01.adicionarNota(20,3);

        System.out.println(aluno01);

        System.out.println();

        Aluno aluno02 = new Aluno("Valéria");
        aluno02.adicionarNota(30, 1);
        aluno02.adicionarNota(40,3);

        System.out.println(aluno02);
    }

}

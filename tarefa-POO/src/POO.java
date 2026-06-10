import com.notas.entity.Aluno;

import java.util.Scanner;

public class POO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao Diário de Classe!");
        System.out.println("Quantos Alunos deseja cadastrar?");
        int soma;
        int qn = 0;
        int tamanho = sc.nextInt();
        Aluno[] vetor = new Aluno[tamanho];
        sc.nextLine();
        for (int i = 0; i <vetor.length ; i++) {
            System.out.println("Qual é o nome do Aluno?");
            vetor[i] = new Aluno();
            vetor[i].setAlunos(sc.nextLine());
            System.out.println("Quantas notas serão registradas?");
            qn = sc.nextInt();
            int[] notas = new int[qn];
            vetor[i].setNota(notas);
            soma = 0;
            int j = 0;
            while (j < vetor[i].getNota().length) {
                int notaDigitada;
                do {
                    System.out.println("Qual a nota do " + vetor[i].getAlunos() + "?");
                    notaDigitada = sc.nextInt();
                    if (notaDigitada < 0 || notaDigitada > 10) {
                        System.out.println("Nota inválida! Digite entre 0 e 10.");
                    }
                } while (notaDigitada < 0 || notaDigitada > 10);
                vetor[i].getNota()[j] = notaDigitada;
                soma += notaDigitada;
                j++;
            }
            double media = soma / qn;
            vetor[i].setMedia(media);
            sc.nextLine();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Aluno: "+ vetor[i].getAlunos());
            System.out.println("Média: " + vetor[i].getMedia());
            System.out.println();
        }
    }
}

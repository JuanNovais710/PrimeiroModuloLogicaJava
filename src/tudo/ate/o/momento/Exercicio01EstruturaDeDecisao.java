package com.company;

/*
Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Serão dois parâmetros
para receber um para receber a nota de português e outro para receber as de matemática.
A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150.
Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja,
se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150)
ele não conseguirá a vaga.
No final mostre para o candidato se ele conseguiu ou não.
 */


import java.util.Scanner;

public class Exercicio01EstruturaDeDecisao {
    static final Double notaMinimaNasDuasMaterias = 150.00;
    static final Double notaMinimaUmaMateria = 60.00;
    static final Double notaMaximaNasDuasMaterias = 200.00;
    static final Double notaMaximaUmaMateria = 100.00;
    static final Double notaMinimaZero = 0.00;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a nota do aluno em português: ");
        double notaEmPortugues = scanner.nextDouble();
        System.out.print("Informe a nota do aluno em matemática: ");
        double notaEmMatematica = scanner.nextDouble();
        double somaDasNotas = notaEmMatematica + notaEmPortugues;

        boolean reprovadoEmPortugues = notaEmPortugues < notaMinimaUmaMateria && notaEmPortugues > notaMinimaZero && somaDasNotas < notaMaximaNasDuasMaterias;
        boolean reprovadoEmMatematica = notaEmMatematica < notaMinimaUmaMateria && notaEmMatematica > notaMinimaZero && somaDasNotas < notaMaximaNasDuasMaterias;
        boolean aprovacaoNasDuasMaterias = notaEmPortugues >= notaMinimaUmaMateria && notaEmMatematica >= notaMinimaUmaMateria;
        boolean aprovacaoTotal = somaDasNotas >= notaMinimaNasDuasMaterias && aprovacaoNasDuasMaterias && somaDasNotas <= notaMaximaNasDuasMaterias;
        boolean reprovacaoTotal = notaEmPortugues < notaMinimaUmaMateria && notaEmMatematica < notaMinimaUmaMateria;
        boolean notaInvalidaMaiorQue200 = somaDasNotas > notaMaximaNasDuasMaterias;
        boolean notaInvalidaPortugues = notaEmPortugues > notaMaximaUmaMateria || notaEmPortugues < notaMinimaZero;
        boolean notaInvalidaMatematica = notaEmMatematica > notaMaximaUmaMateria || notaEmMatematica < notaMinimaZero;

        if (aprovacaoTotal) {
            System.out.print("A nota do aluno em português foi: " + notaEmPortugues + "\nA nota em matemática: " + notaEmMatematica + "\nTotalizando: " + somaDasNotas + "\nParabéns! Está aprovado!");
        }else if (reprovacaoTotal) {
            System.out.print("A nota do aluno em português foi: " + notaEmPortugues + "\nA nota em matemática: " + notaEmMatematica + "\nTotalizando: " + somaDasNotas + "\nDeverá se esforçar mais. Não alcançou a média em ambas as matérias.");
        }else if (reprovadoEmMatematica) {
            System.out.print("A nota do aluno em português foi: " + notaEmPortugues + "\nA nota em matemática: " + notaEmMatematica + "\nTotalizando: " + somaDasNotas + "\nDeverá se esforçar mais. Não alcançou a média em matemática.");
        }else if (reprovadoEmPortugues) {
            System.out.print("A nota do aluno em português foi: " + notaEmPortugues + "\nA nota em matemática: " + notaEmMatematica + "\nTotalizando: " + somaDasNotas + "\nDeverá se esforçar mais. Não alcançou a média em português.");
        }else if (notaInvalidaMaiorQue200 || notaInvalidaPortugues || notaInvalidaMatematica) {
            System.out.println("Notas inválidas. ");
        }
    }
}

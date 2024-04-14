package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Este programa recebe informações passadas de você de uma região, calculando a média dos salários dos habitantes;");
		System.out.println("informando qual a pessoa com menor idade e qual a com maior; quantidade de mulheres na região;");
		System.out.println("e dizendo qual a idade com o menor salário e qual o sexo dessa pessoa. (Quando terminar e quiser finalizar o programa, digite a idade como '-1'.)");
		int idade, maior = 0, menor = 200, idade_menorsalario = 999, qtd_mulheres = 0, qtidadehabitantes = 0;
        float salario, menorsalario = 999, soma_salario = 0;
        char sexo, sexo_menorsalario = 0;

        while (true) {
            System.out.print("\nInforme a idade do entrevistado: ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            scanner.nextLine(); 

            System.out.print("Sexo <M/F>: ");
            sexo = scanner.nextLine().charAt(0);

            System.out.print("Informe o salário: R$");
            salario = scanner.nextFloat();

            if (sexo == 'F' || sexo == 'f') {
                qtd_mulheres++;
            }

            if (salario >= 0) {
                soma_salario += salario;
                qtidadehabitantes++;
            }

            if (idade > maior) {
                maior = idade;
            }

            if (idade < menor) {
                menor = idade;
            }

            if (salario < menorsalario) {
                menorsalario = salario;
                idade_menorsalario = idade;
                sexo_menorsalario = sexo;
            }
        }

        System.out.println("\nFim do programa");
        System.out.printf("Média dos salários do grupo: R$ %.1f%n", (soma_salario / qtidadehabitantes));
        System.out.println("Menor idade: " + menor + " anos");
        System.out.println("Maior idade: " + maior + " anos");
        System.out.println("Quantidade de mulheres na região: " + qtd_mulheres);
        System.out.printf("Idade da pessoa com o menor salário: %d anos, sexo: %c%n", idade_menorsalario, sexo_menorsalario);
    }
}
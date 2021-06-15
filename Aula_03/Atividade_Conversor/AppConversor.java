// Atividade de Programação 1

// Nome: Lucas Rodrigues de Oliveira

package Aula_03.Atividade_Conversor;

import java.util.Scanner;


public class AppConversor {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int op = 0;
        int polegada, pes, milha;

        double resultado = 0;

        do{
            System.out.println("----------------------------------");
            System.out.println("BEM VINDO AO CONVERSOR DE MEDIDAS");
            System.out.println("");
            System.out.println("Para começar escolha uma opção! ");
            System.out.println(" Opção 1 - Converter POLEGADAS para CENTIMETROS: ");
            System.out.println(" Opção 2 - Converter PÉS para CENTIMETROS: ");
            System.out.println(" Opção 3 - Converter MILHAS para QUILOMETROS: ");
            System.out.println("");
            System.out.println(" PARA SAIR PRECIONE 4");
            System.out.println("----------------------------------");
            System.out.print("Opção: ");
            op = Integer.parseInt(input.nextLine());

            switch(op){
                case 1:
                    System.out.print("Digite polegadas: ");
                    polegada = Integer.parseInt(input.nextLine());
                    resultado = Converter.polegadasEmCentimetros(polegada);
                    System.out.println("" + polegada + " equivale a " + resultado + " cm!");
                    System.out.println("----------------------------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Digite polegadas: ");
                    pes = Integer.parseInt(input.nextLine());
                    resultado = Converter.pesEmCentimetros(pes);
                    System.out.println("" + pes + " equivale a " + resultado + " cm!");
                    System.out.println("----------------------------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Digite polegadas: ");
                    milha = Integer.parseInt(input.nextLine());
                    resultado = Converter.milhasEmQuilometros(milha);
                    System.out.println("" + milha + " equivale a " + resultado + " km!");
                    System.out.println("----------------------------------");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saindo!");
                    System.out.println("----------------------------------");
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    System.out.println("");
                    op = 1;
                    break;
            }

        }while(op > 0 && op <4);
    }
}

package montadora;
import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Carro carroDoJoao = new Carro(); // Carro do Joao é um objeto
        System.out.println("Carro do joão ");
        carroDoJoao.andar();
        carroDoJoao.parar();
        carroDoJoao.setCor("Branco");
        carroDoJoao.setMarca("Fiat");
        carroDoJoao.setModelo("Uno");
        carroDoJoao.setPortas(2);
        carroDoJoao.setProprietario("João");
        carroDoJoao.setVelocidade(160);
        System.out.println("-------------");

        // Instanciar o carro do Ze
        Carro carroDoZe = new Carro();
        System.out.println("Carro do Zé ");
        // Setar variaveis
        carroDoZe.setCor("Vermelho");
        carroDoZe.setMarca("VW");
        carroDoZe.setModelo("Gol");
        carroDoZe.setPortas(4);
        carroDoZe.setProprietario("Zé");
        carroDoZe.setVelocidade(150);
        System.out.println("-------------");
        //Recuperar variaveis
        /*
        System.out.println("Cor: " + carroDoZe.getCor());
        System.out.println("Marca: " + carroDoZe.getMarca());
        System.out.println("Modelo: " + carroDoZe.getModelo());
        System.out.println("-------------");
        

        String resposta;
        resposta = "Cor:  " + carroDoZe.getCor() + "\n" +
                   "Marca: " + carroDoZe.getMarca() + "\n" +
                   "Modelo: " + carroDoZe.getModelo() + "\n";
        System.out.println(resposta);
        */
  

        System.out.println(carroDoZe.toString());
        System.out.println("----------------------------");

        // Inserindo dados via console carro do Zé
        System.out.print("Cor do carro do Zé: ");
        String cor = input.nextLine();
        System.out.print("Marca do carro do Zé: ");
        String marca = input.nextLine();
        System.out.print("Modelo do carro do Zé: ");
        String modelo = input.nextLine();
        System.out.print("Quantas portas tem o Carro do Zé");
        int numeroPortas = input.nextInt();
        System.out.print("Qual a velocidade maxima do carro do Zé: ")
        int velocidadeMaxima = input.nextInt();
        System.out.print("Qual o nome do proprietario: ");
        String nomeProprietario = input.nextLine();
        System.out.println("----------------------------");
        carroDoZe.setCor(cor);
        carroDoZe.setMarca(marca);
        carroDoZe.setModelo(modelo);
        carroDoZe.setPortas(numeroPortas);
        carroDoZe.setProprietario(nomeProprietario);
        carroDoZe.setVelocidade(velocidadeMaxima);
        System.out.println(carroDoZe.toString());
        System.out.println("----------------------------");
    }
}

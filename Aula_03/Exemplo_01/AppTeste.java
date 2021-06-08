package Aula_03.Exemplo_01;

public class AppTeste {
    
    public static void main(String args[]){
        TesteStatic t1, t2;
        
        t1 = new TesteStatic();
        t2 = new TesteStatic();

        t1.atributo1 =  10;
        t1.atributo2 = 100;

        t2.atributo1 = 20;
        t2.atributo2 = 200;

        TesteStatic.ATRIBUTO3 = 500;

        t1.exibirAtributo("t1");
        t2.exibirAtributo("t2");

    }
}

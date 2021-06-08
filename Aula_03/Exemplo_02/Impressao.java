package Aula_03.Exemplo_02;

public class Impressao {
    public static void imprimirTexto(String texto){
        System.out.println("MEtodo Static: " + texto);
    }

    public static void somarDoisValores( int x, int y){
        int resposta = x + y;
        System.out.println("Nosso Calculo: " + resposta);
    }

    public static void imprimirDocumento(Documento documento){
       
        String status = "";
        String assinatura = "";
        switch(documento.getStatus()){
            case 0:
                status = "Novo Documento";
                break;
            case 1:
                status = "Em processamento";
                break;
            case 2:
                status = "Aguardando Autorização";
                break;
            case 3:
                status = "Finalizado";
                break;        
        }  
        
        switch(documento.getAssinatura()){
            case 0:
                assinatura = "Diretor";
                break;
            case 1:
                assinatura = "Supervisor";
                break;
            case 2:
                assinatura = "Cordenador";
                break;
            case 3:
                assinatura = "Não assinado";
                break;
        }
        
        String resposta = "Id: "         + documento.getId()       + "\n" +
                          "Nome: "       + documento.getNome()       + "\n" +
                          "Status: "     + status     + "\n" +
                          "Assinatura: " + assinatura + "\n" +
                          "------------------------------";
        System.out.println(resposta);
    }
}

package Aula_03.Exemplo_02;

public class AppTeste2 {
    public static void main(String args[]){
        Documento d1, d2, d3;

        d1 = new Documento(1, "Teste1");
        d2 = new Documento(2, "teste2");
        d3 = new Documento(3, "teste3");

        d1.exibirDados("d1");
        d1.setStatus(Documento.AGUARDADNO_AUTORIZACAO);
        d1.setAssinatura(Assinatura.DIRETOR);
        // d2.exibirDados("d2");
        d1.exibirDados("d1");
        
        Impressao.imprimirTexto("Nosso texto na tela!");
        Impressao.somarDoisValores(8, 2);
        Impressao.imprimirDocumento(d3);
        Impressao.imprimirDocumento(d1);
    }
}

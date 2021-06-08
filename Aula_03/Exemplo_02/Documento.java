package Aula_03.Exemplo_02;

public class Documento {
    // Atributos da Classe
    private int id;
    private String nome;
    private int status;
    private int assinatura;

    /*
        0 = Novo Documento
        1 = em processamento
        2 = aguardando autorização
        3 = finalizado.
    */
    // Atributos estasticos/constantes:
    public static final int NOVO_DOCUMENTO = 0;// Valor imutavel valor deve ser declarado
    public static final int PROCESSAMENTO = 1;
    public static final int AGUARDADNO_AUTORIZACAO = 2;
    public static final int FINALIZADO = 3;

    // Metodo construtor
    public Documento(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.status = NOVO_DOCUMENTO;
        this.assinatura = Assinatura.NAO_ASSINADO;
    }

    public void setId( int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public void setAssinatura(int assinatura){
        this.assinatura = assinatura;
    }
    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public int getStatus(){
        return this.status;
    }
    public int getAssinatura(){
        return this.assinatura;
    }

    public void exibirDados(String nomeObjeto){
        String resposta = "Objeto: "     + nomeObjeto      + "\n" +
                          "Id: "         + this.id         + "\n" +
                          "Nome: "       + this.nome       + "\n" +
                          "Status: "     + this.status     + "\n" +
                          "Assinatura: " + this.assinatura + "\n" +
                          "------------------------------";
        System.out.println(resposta);
    }

}

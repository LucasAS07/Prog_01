public class TesteStatic{
    public int atributo1;
    public int atributo2;

    public static int ATRIBUTO3;

    public void exibirAtributo(String nomeObjeto){
        String resposta = "Objeto: " + nomeObjeto + "\n" +
                          "Atributo1" + atributo1 + "\n" +
                          "Atributo2: " + atributo2 + "\n" +
                          "Atributo3: " + ATRIBUTO3 + "\n" +
                          "------------------------------";
    }
}
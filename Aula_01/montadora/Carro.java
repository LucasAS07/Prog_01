package montadora;

public class Carro{
    // Atributos
    private String cor;
    private String marca;
    private String modelo;
    private String nomeProprietario;
    private int velocidadeMaxima;
    private int numeroPortas;
    // Metodo
    //Teste
    protected void andar(){
        ligar();
        System.out.println("Carro andando!");
    }

    protected void parar(){
        System.out.println("Carro parado!");
    }

    private void ligar(){
        System.out.println("Carro Ligado!");
    }
    // Metodos Gets e Sets;
    // Variavel cor;
    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    // variavel marca
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    //variavel modelo
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    // Variavel proprietario
    public int getVelocidade(){
        return this.velocidadeMaxima;
    }
    public void setVelocidade(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Variavel portas
    public int getPortas(){
        return this.numeroPortas;
    }
    public void setPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }

    // Variavel proprietario
    public String getProprietario(){
        return this.nomeProprietario;
    }
    public void setProprietario(String nomeProprietario){
        this.nomeProprietario = nomeProprietario;
    }

    // metodo de resposta dos textos;
    public String toString(){
        return "Cor: " + cor + "\n" +
               "Marca: " + marca + "\n"+
               "Modelo: " + modelo + "\n";
               "Nome do Proprietario: " + nomeProprietario +"\n";
               "Numero de Portas: " + numeroPortas + "\n";
               "Velociadeda Maxima: " + velocidadeMaxima + "\n";
               

    }
    


}
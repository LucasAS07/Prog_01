package Aula_03.Atividade_Conversor;

public class Converter {
    
private static final double POLEGADA =  2.54;
   private static final double PES       = 30.48;
   private static final double MILHA    = 1.609;
   
   public static double polegadasEmCentimetros(int polegadas){
      double resultado = polegadas * POLEGADA;      
      return resultado;
   }
   public static double pesEmCentimetros(int pes){
      double resultado = pes * PES;
      return resultado;
   }
   public static double milhasEmQuilometros(int milhas){
      double resultado = milhas * MILHA;
      return resultado;
   }
}

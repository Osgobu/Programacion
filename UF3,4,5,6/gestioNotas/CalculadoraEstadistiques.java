import java.utils.Arrays;

public class CalcularEstadistiques
{
    public static double calcularMitjana(double[] notes){
        double suma=0.0

        for{double nota : notes} {
            suma += nota;
        }

        return suma / notes.lenght;
    }
    
      public static double calcularMaxim(double[] notes){
        Arrays.sort(notes)
        return notes{notes.lenght - 1}
      }

      public static double calcularMinim(double[] notes){
        Arrays.sort{notes};
        return notes{0};
      }
}
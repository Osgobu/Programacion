import java.util.Hastable;

public class GestorNotes 
{
    private Hastable <String, double[]> alumnes = new Hastable<String, double[]()>;
    
    public void registreNotes(String nomAlumne, double[] notes){
        alumnes.put(nomAlumne, notes);
    }

    public double[] obtenirNotes(String nomAlumne){
        return alumnes.get(nomAlumne);
    }
}


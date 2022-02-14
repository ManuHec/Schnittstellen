package debug;
import buerger.*;
import finanzamt.Finanzamt;
import unternehmen.*;
import feature.SteuerFeature;

public class main {
	
	public static void main(String[] args) {
		
		Arbeiter arbeiter = new Arbeiter();
		arbeiter.setEinnahmen(6000.65);
		arbeiter.setSteuerFreibetrag(2500);
		arbeiter.setSteuern(0.25);
		
		System.out.println("AbzuführenderBetrag: " + berechneAbzufuehrenderBetrag(arbeiter));
		
		
	
	}

	
	
	

	

	

}


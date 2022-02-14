package feature;

public class SteuerFeature {

	public static double berechneAbzufuehrenderBetrag(ISteuer s) {
		return s.getEinkommen()* s.getSteuern()*s.getSteuerFreibetrag();
		
	}
}

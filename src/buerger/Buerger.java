package buerger;

public abstract class Buerger implements feature.IEinkommen,feature.ISteuer {
	
	private double steuern;
	private double einnahmen;
	private double steuerFreibetrag;
	public double getSteuern() {
		
		return steuern;
	}
	public void setSteuern(double steuern) {
		this.steuern = steuern;
	}
	public double getEinnahmen() {
		return einnahmen;
	}
	public void setEinnahmen(double einnahmen) {
		this.einnahmen = einnahmen;
	}
	public double getSteuerFreibetrag() {
		return steuerFreibetrag;
	}
	public void setSteuerFreibetrag(double steuerFreibetrag) {
		this.steuerFreibetrag = steuerFreibetrag;
	}

}

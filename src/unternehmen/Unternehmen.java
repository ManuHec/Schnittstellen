package unternehmen;

public abstract class Unternehmen implements feature.IEinkommen,feature.ISteuer {
	
	private double steuern;
	private int angestellte;
	private double einnahmen;
	
	public double getSteuern() {
		return steuern;
	}
	public void setSteuern(double steuern) {
		this.steuern = steuern;
	}
	public int getAngestellte() {
		return angestellte;
	}
	public void setAngestellte(int angestellte) {
		this.angestellte = angestellte;
	}
	public double getEinnahmen() {
		return einnahmen;
	}
	public void setEinnahmen(double einnahmen) {
		this.einnahmen = einnahmen;
	}
	
	

}

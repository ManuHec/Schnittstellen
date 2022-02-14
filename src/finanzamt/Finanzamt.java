package finanzamt;

public abstract class Finanzamt implements feature.IEinkommen,feature.ISteuer {
	
	private double einkommen;
	private double steuern;
	private double steuerFreibetrag;
	
	public double getEinkommen() {
		return einkommen;
	}
	public void setEinkommen(double einkommen) {
		this.einkommen = einkommen;
	}
	public double getSteuern() {
		return steuern;
	}
	public void setSteuern(double steuern) {
		this.steuern = steuern;
	}
	public double getSteuerFreibetrag() {
		return steuerFreibetrag;
	}
	public void setSteuerFreibetrag(double steuerFreibetrag) {
		this.steuerFreibetrag = steuerFreibetrag;
	}
	
	

}

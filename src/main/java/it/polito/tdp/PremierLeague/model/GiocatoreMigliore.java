package it.polito.tdp.PremierLeague.model;

public class GiocatoreMigliore {
	private Player p;
	private double d;
	public GiocatoreMigliore(Player p, double d) {
		super();
		this.p = p;
		this.d = d;
	}
	public Player getP() {
		return p;
	}
	public void setP(Player p) {
		this.p = p;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "GiocatoreMigliore [Player=" + p + ", delta=" + d + "]";
	}
	
}

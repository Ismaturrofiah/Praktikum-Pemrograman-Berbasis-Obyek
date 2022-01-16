
public class SegitigaSiku {
	double alas;
	double tinggi;
	double miring;
	
	public void setAlas(double alas) {
		this.alas = alas;
	}
	
	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	
	public void setMiring(double alas, double tinggi) {
		double miring = Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
		this.miring = miring;
	}
	
	public double getAlas() {
		return alas;
	}
	
	public double getTinggi() {
		return tinggi;
	}
	
	public double getMiring() {
		return miring;
	}
	
	public double getKeliling() {
		return alas + tinggi + miring;
	}
	
	public double getLuas() {
		return (alas*tinggi)/2;
	}
}

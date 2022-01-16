
public class MainSegitigaSiku {
	
	public static void main(String [] args) {
		SegitigaSiku segitigaSiku = new SegitigaSiku();
		segitigaSiku.setAlas(24);
		segitigaSiku.setTinggi(7);
		segitigaSiku.setMiring(24, 7);
		System.out.println("Alas segitiga = "+segitigaSiku.getAlas());
		System.out.println("Tinggi segitiga = "+segitigaSiku.getTinggi());
		System.out.println("Sisi miring segitiga = "+segitigaSiku.getMiring());
		System.out.println("Keliling segitiga = "+segitigaSiku.getKeliling());
		System.out.println("Luas segitiga = "+segitigaSiku.getLuas());
	}
}

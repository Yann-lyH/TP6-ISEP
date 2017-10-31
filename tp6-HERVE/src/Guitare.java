
public class Guitare implements InterfaceInstruments{

	public int nombreCorde;
	public String son;

	public Guitare(int VnombreCorde, String Vson) {
		this.nombreCorde = VnombreCorde;
		this.son = Vson;
	}

	public void jouer() {
		int n = 1;
		String SON = "";
		while (n <= this.nombreCorde) {
			SON = SON + " " + this.son;
			n = n + 1;
		}
		System.out.println(SON);
	}

	

	public static void main(String[] args) {
		Guitare Guitare1;
		Guitare1 = new Guitare(5, "Do");
		Guitare1.jouer();
		
		
		InterfaceInstruments flute;
		flute = new Guitare(6, "Mi");
		flute.jouer();

	}

}

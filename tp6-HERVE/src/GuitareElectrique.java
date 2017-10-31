
public class GuitareElectrique extends Guitare {

	public GuitareElectrique(int VnombreCorde, String Vson) {
		super(VnombreCorde, Vson);
	}
	public void Maj() {
		
		this.son = this.son.toUpperCase();
		
	}
	public void disto() {
		this.son = this.son + " " + "OUUUIIIINGGG";
	}
	

	public static void main(String[] args) {
		GuitareElectrique GuitareElectrique1;
		GuitareElectrique1 = new GuitareElectrique(5, "Do");
		GuitareElectrique1.Maj();
		GuitareElectrique1.jouer();
		GuitareElectrique1.disto();
		GuitareElectrique1.jouer();
		

	}

}


public class TabGuitare {
	

	public static void main(String[] args) {
		InterfaceInstruments Guitare0;
		InterfaceInstruments GuitareElectrique0;
		InterfaceInstruments [] tableau = new InterfaceInstruments [25];
		for (int i = 0; i<tableau.length;i++) {
			int a = (int) (Math.random()*10);
			if (a <=5) {
				Guitare0 = new Guitare (i, "Do");
				tableau[i] = Guitare0;
			} else {
				GuitareElectrique0 = new GuitareElectrique(i, "DO");
				tableau[i] = GuitareElectrique0;
			}
			
		}
		for (int i = 0; i<tableau.length;i++) {
			tableau[i].jouer();
		}

	}

}


public class Exercice3 {
	public static class InstrumentsMusiciens {
		public String instrument;

		public InstrumentsMusiciens(String NomInstrument) {
			this.instrument = NomInstrument;
		}

	}

	public static class Musiciens extends InstrumentsMusiciens {
		public int NbInstruments;
		public String NomMusicien;

		public Musiciens(String NomInstrument, int nombreInstru, String NameMusicien) {
			super(NomInstrument);
			this.NbInstruments = nombreInstru;
			this.NomMusicien = NameMusicien;
		}
	}

	public static class GroupeMusique extends Musiciens {
		public String NomduGroupe;
		public int NombreMusiciens;
		public String Style;
		public int NombreFestival;

		public GroupeMusique(String NomInstrument, int nombreInstru, String NameMusicien, int NbMusiciens,
				String NameGroup, String StyleMusic, int Nbfestival) {
			super(NomInstrument, nombreInstru, NameMusicien);
			this.NombreMusiciens = NbMusiciens;
			this.NomduGroupe = NameGroup;
			this.Style = StyleMusic;
			this.NombreFestival = Nbfestival;
		}

	}

	public static class Festival extends GroupeMusique {
		public String StyleFestival;

		public Festival(String NomInstrument, int nombreInstru, String NameMusicien, int NbMusiciens, String NameGroup,
				String StyleMusic, int Nbfestival, String StyleMusicFestival) {
			super(NomInstrument, nombreInstru, NameMusicien, NbMusiciens, NameGroup, StyleMusic, Nbfestival);
			this.StyleFestival = StyleMusicFestival;
		}

		public void GroupeAccepte() {
			if (this.StyleFestival == this.Style) {
				System.out.println("Groupe autorisé à jouer");
			} else {
				System.out.println("Groupe non autorisé à jouer");
			}
		}
	}

	public static void main(String[] args) {
		GroupeMusique GroupeRock;
		GroupeRock = new GroupeMusique("Guitare", 3, "Bob", 4, "Nirvana", "Rock", 2);
		Festival PopFestival;
		PopFestival = new Festival("Guitare", 3, "Bob", 4, "Nirvana", "Rock", 2, "Rock");
		PopFestival.GroupeAccepte();

	}

}


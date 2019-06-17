package aerei;
import java.util.ArrayList;

public class Compagnia {
	
	private String  nomeCompagnia;
	private AeroportiMondo aeroportiMondo;
	
	
	
	public String getNomeCompagnia() {
		return nomeCompagnia;
	}


	public void setNomeCompagnia(String nomeCompagnia) {
		this.nomeCompagnia = nomeCompagnia;
	}


	public AeroportiMondo getAeroportiMondo() {
		return aeroportiMondo;
	}


	public void setAeroportiMondo(AeroportiMondo aeroportiMondo) {
		this.aeroportiMondo = aeroportiMondo;
	}


	public Compagnia(String nomeCompagnia, AeroportiMondo aeroportiMondo) {
		
	}
	
	//--------------------------------------
	// Single aircraft class
	public class Aereo{
		
		private String codiceModelloAereo;
		private int numeroPostiDisponibili;
		
		// Add an Aircraft to the list of aircrafts
		// If aircraft already exists, throw an exception InvalidCode
		public void addAereo(String codiceModelloAereo, int postiDisponibili) {
			
		}

		// Getter Aircraft code model
		public String getCodiceModelloAereo() {
			return codiceModelloAereo;
		}
		
		// Setter aircraft code model
		public void setCodiceModelloAereo(String codiceModelloAereo) {
			this.codiceModelloAereo = codiceModelloAereo;
		}

		// Getter number of available seats
		public int getNumeroPostiDisponibili() {
			return numeroPostiDisponibili;
		}

		// Setter of available seats
		public void setNumeroPostiDisponibili(int numeroPostiDisponibili) {
			this.numeroPostiDisponibili = numeroPostiDisponibili;
		}
		
		
		
	
		
	}
	
	
	//---------------------------------------
	// Aircrafts's class
	public class Aerei{
		
		private ArrayList<Aereo> aerei = new ArrayList<>();

		// Getter
		public ArrayList<Aereo> getAerei() {
			return aerei;
		}
		
		// Setter
		public void setAerei(ArrayList<Aereo> aerei) {
			this.aerei = aerei;
		}
		
		
		
	}
	
	//---------------------------------------
	// Single flight class
	public class Volo extends Aereo{
		private String codiceVolo;
		private String codiceAeroportoDiPartenza;
		private String codiceAeroportoDiArrivo;
		private String giornoDellaSettimana;
		
		// Getters and Setters
		public String getCodiceVolo() {
			return codiceVolo;
		}
		public void setCodiceVolo(String codiceVolo) {
			this.codiceVolo = codiceVolo;
		}
		public String getCodiceAeroportoDiPartenza() {
			return codiceAeroportoDiPartenza;
		}
		public void setCodiceAeroportoDiPartenza(String codiceAeroportoDiPartenza) {
			this.codiceAeroportoDiPartenza = codiceAeroportoDiPartenza;
		}
		public String getCodiceAeroportoDiArrivo() {
			return codiceAeroportoDiArrivo;
		}
		public void setCodiceAeroportoDiArrivo(String codiceAeroportoDiArrivo) {
			this.codiceAeroportoDiArrivo = codiceAeroportoDiArrivo;
		}
		public String getGiornoDellaSettimana() {
			return giornoDellaSettimana;
		}
		public void setGiornoDellaSettimana(String giornoDellaSettimana) {
			this.giornoDellaSettimana = giornoDellaSettimana;
		}
		
		// End Getters and Setters ...
		
		// Add a single flight to the list of flights.
		// If flight isn't in the list throw an exception InvalidCode
		public void addVolo(String codiceVolo, String codiceModelloAereo,
							String codiceAeroportoDiPartenza, 
							String codiceAeroportoDiArrivo,
							String giornoDellaSettimana) {
			
		}
		
		// Cancel a flight from the list.
		// If a flight doesn't exist throw an exception InvalidCode.
		public void cancelVolo(String codiceVolo) {
			
		}
		
		// Return a string like "Alitalia;AZ321;L734;TorinoTRN;ParisCDG;
		// Martedi;10".
		@override
		public String toString() {
			String s = nomeCompagnia + ";" + codiceVolo + ";" + 
						getCodiceModelloAereo() + ";" + codiceAeroportoDiPartenza + 
						";" + codiceAeroportoDiArrivo + ";" + 
						getNumeroPostiDisponibili();
			
			return s;
		}
		
		
	}
	
	//---------------------------------------
	// flights class
	public class Voli{
		private ArrayList<Volo> voli = new ArrayList<>();

		// Getter
		public ArrayList<Volo> getVoli() {
			return voli;
		}

		// Setter
		public void setVoli(ArrayList<Volo> voli) {
			this.voli = voli;
		}
		
		
	}
	
	
	// -------------------------------------
	// Number of seats for the booking
	private int numeroPostiDaPrenotare;
	
	
	public int getNumeroPostiDaPrenotare() {
		return numeroPostiDaPrenotare;
	}


	public void setNumeroPostiDaPrenotare(int numeroPostiDaPrenotare) {
		this.numeroPostiDaPrenotare = numeroPostiDaPrenotare;
	}

	
	// Return a number of seats available for booking by flight.
	// If flight code isn't in the list throw an exception InvalidCode.
	public int postiLiberi(String codiceVolo) {
		
		
		
		return 0;
	}
	
	
	
	// Booking function.Return true if is there enough seat for the flight,
	// false in the other case.
	// If flight code isn't in the list throw an exception InvalidCode
	public boolean prenota(int numeroPostiDaPrenotare, String codiceVolo) {
		
		
		
		
		return true;
	}
	
	
	
	
	
	
	
	// Others Functions
	
	// Delay of a flight in Departure
	// If flight code isn't in the list throw an exception InvalidCode.
	public int partitoVolo(String codiceVolo, int ritardo) {
		
		
		return 0;
	}
	
	
	// 

}

package aerei;
import java.util.ArrayList;
import aerei.Compagnia.Volo;

public class Aeroporto {
	
	private String code;
	
	// Constructor of airport class
	public Aeroporto(String code) {
		this.code = code;
	}
	
	
	// Getter of airport code
	public String getCode() {
		return code;
	}
	
	// Setter of airport code
	public void setCode(String code) {
		this.code = code;
	}
	
	// List of Arrivals and Departures flights for a single airport.
	private ArrayList<Volo> arrivi = new ArrayList<>();
	private ArrayList<Volo> partenze = new ArrayList<>();

	
	
	public ArrayList<Volo> getArrivi() {
		return arrivi;
	}


	public void setArrivi(ArrayList<Volo> arrivi) {
		this.arrivi = arrivi;
	}


	public ArrayList<Volo> getPartenze() {
		return partenze;
	}


	public void setPartenze(ArrayList<Volo> partenze) {
		this.partenze = partenze;
	}

	

	
	
	
	
	
	
}

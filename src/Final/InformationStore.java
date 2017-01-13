package Wersja1;

import com.google.gson.annotations.SerializedName;

public class InformationStore {
	@SerializedName("poslowie.imie_pierwsze")
	private String firstName;

	@SerializedName("poslowie.nazwisko")
	private String lastName;

	@SerializedName("poslowie.liczba_wyjazdow")
	private Integer deputyNumberOfTrips;

	public Integer getdeputyNumberOfTrips() {
		return deputyNumberOfTrips;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}


	public void setdeputyNumberOfTrips(Integer deputyNumberOfTrips) {
		this.deputyNumberOfTrips = deputyNumberOfTrips;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

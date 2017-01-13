package Wersja1;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonElement;

import java.util.*;

public class Stages {

	@SerializedName("wydatki")
	private Expenses Expenses;

	@SerializedName("wyjazdy")
	private JsonElement isTrips;

	@SuppressWarnings("unchecked")
	public void loadtrips() {

		if (this.isTrips.isJsonObject())
			this.trips = new ArrayList<Map<String, String>>();
		else {
			this.trips = new Gson().fromJson(this.isTrips, List.class);

		}
	}

	public Expenses getExpenses() {
		return Expenses;
	}

	public JsonElement getIsTrips() {
		return isTrips;
	}

	public void setExpenses(Expenses wydatki) {
		this.Expenses = wydatki;
	}

	public List<Map<String, String>> getTrips() {
		return trips;
	}

	public void setTrips(List<Map<String, String>> trips) {
		this.trips = trips;
	}

	private List<Map<String, String>> trips;

	public void setIsTrips(JsonElement isTrips) {
		this.isTrips = isTrips;
	}

}
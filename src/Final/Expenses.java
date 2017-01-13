package Wersja1;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Expenses {

	@SerializedName("punkty")
	private List<Map<String, String>> points;

	@SerializedName("roczniki")
	private List<Years> yearbooks;

	public List<Map<String, String>> getpoints() {
		return points;
	}

	public void setpoints(List<Map<String, String>> punkty) {
		this.points = punkty;
	}

	public List<Years> getyearbooks() {
		return yearbooks;
	}

	public void setyearbooks(List<Years> roczniki) {
		this.yearbooks = roczniki;
	}

	public double getSum() {
		double suma = 0;
		for (Years elem : this.yearbooks) {
			suma += elem.getYearsum();
		}
		return suma;
	}

}

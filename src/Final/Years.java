package Wersja1;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Years {
	@SerializedName("pola")
	private List<Double> scope;

	@SerializedName("rok")
	private String year;

	public List<Double> getscope() {
		return scope;
	}

	public String getYear() {
		return year;
	}

	public double getYearsum() {
		double suma = 0;
		for (Double elem : this.scope) {
			suma += elem.doubleValue();
		}
		return suma;
	}

	public void setscope(List<Double> scope) {
		this.scope = scope;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
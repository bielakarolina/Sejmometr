package Wersja1;

import com.google.gson.annotations.SerializedName;

public class Deputy {

	@SerializedName("id")
	private String id;

	@SerializedName("data")
	private InformationStore data;

	@SerializedName("layers")
	private Stages layers;

	public String getId() {
		return id;
	}

	public InformationStore getData() {
		return data;
	}

	public Stages getLayers() {
		return layers;
	}

	public String getFirstName() {
		return this.getData().getFirstName();
	}

	public String getLastName() {
		return this.getData().getLastName();
	}

	public double getDeputySum() {
		double sum = this.getLayers().getExpenses().getSum();
		return sum;
	}

	public String getElementNamed(int k, Object key) {
		return this.getLayers().getTrips().get(k).get(key);
	}

	public static String setId(String id) {
		return id;
	}

	public void setData(InformationStore data) {
		this.data = data;
	}

	public void setLayers(Stages layers) {
		this.layers = layers;
	}

}

package Wersja1;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Cadency {

	@SerializedName("Dataobject")
	private List<Deputy> deputies = null;

	public void addTo(List<Deputy> tList) {
		deputies.addAll(tList);
	}

	public List<Deputy> getDeputies() {
		return deputies;
	}

	public void setDeputies(List<Deputy> deputies) {
		this.deputies = deputies;
	}

}

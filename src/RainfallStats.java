import java.util.ArrayList;
import java.util.List;

public class RainfallStats {
	private final List<Double> rainfall = new ArrayList<>();

	public int getCount() {
		return rainfall.size();
	}

	public double getMean() {
		if (rainfall.size() == 0) {
			throw new IllegalStateException("Rainfall list empty");
		}
		double sum =0.0;
		for(double i: rainfall) {
			sum +=i;
		}
		return sum/rainfall.size();
	}

	public void addMeasurement(double d) {
		if (d<0) {
			throw new InvalidRainfallException("Rainfall negative");
		}
		rainfall.add(d);
	}

	public double getMax() {
		if (rainfall.size() == 0) {
			throw new IllegalStateException("Rainfall list empty");
		}
		double max =0.0;
		for (double i: rainfall) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}

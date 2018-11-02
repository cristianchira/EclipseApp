package marcusbiel;

public class CarSelector {
	public static void main(String[] args) {

		CarService carService = new CarService();
		for (String arg : args) {
			carService.process(arg);

		}

	}
}

package strategyPattern;

public class RadioController implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("¶óµð¿À ÄÑÁü");
	}

	@Override
	public void turnOff() {
		System.out.println("¶óµð¿À ²¨Áü");
	}
}

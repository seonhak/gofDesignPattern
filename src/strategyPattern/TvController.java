package strategyPattern;

public class TvController implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("Tv°ÜÁü");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv²¨Áü");
	}
}

package strategyPattern;

public class TvController implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("Tv����");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv����");
	}
}

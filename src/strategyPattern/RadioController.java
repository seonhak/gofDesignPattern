package strategyPattern;

public class RadioController implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("���� ����");
	}

	@Override
	public void turnOff() {
		System.out.println("���� ����");
	}
}

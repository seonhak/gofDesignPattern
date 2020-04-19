package strategyPattern;

public class RemoteRun {

	private RemoteController remoteController;

	public RemoteRun(RemoteController remoteController) {
		super();
		this.remoteController = remoteController;
	}
	
	public void trunOn() {
		remoteController.turnOn();
	}
	
	public void trunOff() {
		remoteController.turnOff();
	}
}

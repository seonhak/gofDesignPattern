package strategyPattern;

public class Person {
	public static void main(String[] args) {

		RemoteRun remoteRunTv = new RemoteRun(new TvController());
		remoteRunTv.trunOn();
		remoteRunTv.trunOff();

		RemoteRun remoteRunRadio = new RemoteRun(new RadioController());
		remoteRunRadio.trunOn();
		remoteRunRadio.trunOff();
	}
}

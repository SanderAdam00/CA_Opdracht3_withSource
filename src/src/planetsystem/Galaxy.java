package planetsystem;

public class Galaxy extends Universe {
	private char universeId;

	public Galaxy(char universeId) {
		this.universeId = universeId;
	}

	public char getUniverseId() {
		return universeId;
	}
}

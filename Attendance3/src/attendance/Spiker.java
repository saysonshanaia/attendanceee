package attendance;

class Spiker extends Player {
	
	public Spiker(String name) {
		super(name, "Spiker");
	}
	
	@Override
	void serve() {
		System.out.print("Spiker performs a powerful jump serve");
	}
	
	@Override
	void spike() {
		System.out.print("Spiker spikes the ball with great force");
	}

}

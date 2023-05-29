package attendance;

class Setter extends Player {
	
	public Setter(String name) {
		super(name, "Setter");
	}
	
	@Override
	void serve() {
		System.out.println("Setter performs a jump float serve");
	}
	
	@Override
	void spike() {
		System.out.println("Setter sets the ball for a spike");
	}

}

package attendance;

class Libero extends Player {
	
	public Libero(String name) {
		super(name, "Libero");
	}
	
	@Override
	void serve() {
		System.out.println("Libero performs a short serve");
	}
	
	@Override
	void spike() {
		System.out.println("Libero digs the ball with precision");
	}

}

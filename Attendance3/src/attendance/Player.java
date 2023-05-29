package attendance;

abstract class Player {
	
	private String name;
	private String position;
	
	public Player(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public String position() {
		return position;
	}
	
	abstract void serve();
	
	abstract void spike();
	
	void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Position: " + position);
	}
}

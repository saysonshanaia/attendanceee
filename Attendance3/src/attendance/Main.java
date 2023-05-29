package attendance;

public class Main {
	public static void main(String[] args) {
		VolleyballTeam team = new VolleyballTeam();
		
		Player kageyama = new Setter("Kageyama");
		Player hinata = new Spiker("Hinata");
		Player nishinoya = new Libero ("Nishinoya");
		
		team.performAction(kageyama);
		
		team.performAction(hinata);
		
		team.performAction(nishinoya);
	}

}

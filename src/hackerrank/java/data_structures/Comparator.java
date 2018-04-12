package hackerrank.java.data_structures;

public class Comparator implements java.util.Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if (o1.score == o2.score)
			return o1.name.compareTo(o2.name);
		else
			return o1.score - o2.score;
	}

}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

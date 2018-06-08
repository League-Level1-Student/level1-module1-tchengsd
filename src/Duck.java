
public class Duck {
	int numberOfFriends;
	String favoriteFood;

	void quack() {
		System.out.println("Quack");
	}

	void waddle() {
		System.out.println("waddle waddle waddle");
	}
	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
}
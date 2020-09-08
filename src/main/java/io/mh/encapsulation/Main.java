package io.mh.encapsulation;

public class Main {
	public static void main(String[] args) {
//		Player player = new Player();
//		player.fullName = "Max";
//		player.health = 20;
//		player.weapon = "Sword";
//
//		int damage = 10;
//
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.getRemaining());
//
//		damage = 11;
//		player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.getRemaining());


		EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Max", 23, "Sword");
		System.out.println("Initial health is " + enhancedPlayer.getHealth());
	}

}

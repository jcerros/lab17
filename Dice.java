public class Dice {
	static int total=0;
	static int RollDice(int NumOfDice,int sidesofdice) {
		total+= NumOfDice;
		
		// number of dices

		return (1 * NumOfDice + (int) (Math.random() * sidesofdice * NumOfDice));

	}

	static int Roll_1_Dice() {
		total++;
		return 1 + (int) (Math.random() * 6);
		
	}
	static int RollCount(){
		
		return total;
		
		
	}

}


lab17
=====
public class Dice {
  static int total=0;
	static int RollDice(int NumOfDice,int sidesofdice) {
		total++;
		// number of dices

		return (1 * NumOfDice + (int) (Math.random() * sidesofdice * NumOfDice));

	}

	static int Roll_1_Dice() {

		return 1 + (int) (Math.random() * 6);
	}
	static int RollCount(){
		
		return total;
		
		
	}

}

public class Testprogram {

public static void main(String args[]) {
  	
		Dice Object= new Dice();
		
		System.out.println(Object.RollDice(2,6));
		System.out.println(Object.RollDice(2,6));
		System.out.println(Dice.RollCount());
		}
}

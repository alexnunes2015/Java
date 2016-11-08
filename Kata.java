public class Kata {

	public static void main(String[] args){
		Kata k = new Kata();
		Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 15, 5), "Harry");
	}

  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    String currentFighter=firstAttacker;
    while(true){
		if(currentFighter==fighter1.name){
			if(fighter1.health>0){
				fighter2.health=fighter2.health-fighter1.damagePerAttack;
				currentFighter=fighter2.name;
			}else
				break;
		}else{
			if(fighter2.health>0){
				fighter1.health=fighter1.health-fighter2.damagePerAttack;
				currentFighter=fighter1.name;
			}else
				break;
		}
	}
	if(currentFighter==fighter1.name)
		return fighter2.name;
	else
		return fighter1.name;
  }
}


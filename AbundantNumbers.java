public class AbundantNumbers {
    
    public static boolean abundantNumber(int num) {
        int sumDiv = 0;
        for(int i=0; i<= num/2; i++;){
			if(num%i == 0)
				sumDiv++;
		}
		if(sum>num)
			return false;
		else retrun true;
    }
    
}

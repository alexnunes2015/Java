public class EasyWallpaper {
	
	public static void main(String[] args){
		EasyWallpaper w = new EasyWallpaper();
		System.out.println(w.wallpaper(6.3, 5.8, 3.13));
	}	
	
	public String wallpaper(double l, double w, double h) {
			if((l*w*h)!=0){
				// Medidas Standard
				final double stW=0.52;
				final double stL=10;
				
				double area=(l*h*2)+(w*h*2);
				double wpNeeded=area+area*0.15;
						
				EasyWallpaper cR = new EasyWallpaper();		
				EasyWallpaper g = new EasyWallpaper();				
				
				return g.getOrdinalNumber(cR.calcRolls(wpNeeded,stW*stL));
			}else{
				return "zero";
			}
	}
	
	public int calcRolls(double wp,double st){
		// Contar rolos/em metros pelo tamanho 'l' e 'w'
		double lRest=wp;
		int nL=0;
		while(st<=lRest){
		  nL++;
		  lRest=lRest-st;
		}
		return (wp%st==0) ? (int)(wp/st) : (int)(wp/st)+1;
	}
	
	public String getOrdinalNumber(int number){
			// Array de numeros em estenso
			String[] A={"one","two","three","four","Five","six","seven","eight","nine","ten"};
			String[] B={"teen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
			String[] C={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	
		
			if(number==0){
				return "zero";
			}
			if(number<11){
				return A[number-1];
			}
			if(number>=11 && number<20){
				return C[number-11];
			}
			if(number>=20 && number<30){
				if(number==20){
					return B[1];
				}else{
					return B[1]+A[number-21];
				}
			}
			if(number>=30 && number<40){
				if(number==30){
					return B[2];
				}else{
					return B[2]+A[number-31];
				}
			}
			if(number>=40 && number<50){
				if(number==40){
					return B[3];
				}else{
					return B[3]+A[number-41];
				}
			}
			if(number>=50 && number<60){
				if(number==50){
					return B[4];
				}else{
					return B[4]+A[number-51];
				}
			}
			if(number>=60 && number<70){
				if(number==60){
					return B[5];
				}else{
					return B[5]+A[number-61];
				}
			}
			if(number>=70 && number<80){
				if(number==70){
					return B[6];
				}else{
					return B[6]+A[number-71];
				}
			}
			if(number>=80 && number<90){
				if(number==80){
					return B[7];
				}else{
					return B[7]+A[number-81];
				}
			}
			if(number>=90 && number<100){
				if(number==90){
					return B[8];
				}else{
					return B[8]+A[number-91];
				}
			}
	
			return null;
	}
}

import java.io.*;


public class CentParser {
	
  public static void main(String[] args){
	System.out.println(toCents("**"));
  }
  public static Integer toCents(String price) {
	String end="";
	boolean firstZero=true;
	for(char c : price.toCharArray()){
		if(Character.getNumericValue(c)>=0 && Character.getNumericValue(c)<=0){
			if(c=='0'){
				if(firstZero){
					return null;
				}else{
					end=end+c;
				}
			}else{
				firstZero=false;
				end=end+c;
			}			
		}
	}
	return Integer.parseInt(end);
  }
  
}

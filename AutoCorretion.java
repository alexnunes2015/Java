public class AutoCorretion{
	public static String autocorrect(String input) {
		input=input.toLowerCase();
		String[] splitArray = input.split("\\s+");
		String NewWord="";
		for(String str : splitArray){
			boolean pass=true;
			if(str.substring(0,1).equals("u")){
				pass=false;
				NewWord=NewWord+" your sister";
			}
			if(str.substring(0,3).equals("you")){
				pass=false;
				NewWord=NewWord+" your sister";
			}
			if(pass){
				NewWord=NewWord+" "+str;
			}
		}
		return "";
	}
	
	public static void main(String args[]){
		AutoCorretion a = new AutoCorretion();
		System.out.println(a.autocorrect("i miss u!"));
	}
}

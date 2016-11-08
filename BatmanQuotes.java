public class BatmanQuotes{
  
  public static String getQuote(String[] quotes, String hero){
    String returnString = "";
    for(int i=0:i<=hero.lenght;i++){
      try{
        int id=Charater.parseInt(hero[i]);
        returnString=quotes[id];
      }catch(){
        continue;
      }
    }
    //FILL ME IN
    // return + correctedHeroName + returnString;
    return returnString;
  }

}

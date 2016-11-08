public class WallyFinder {

  public static int wheresWally(String str) {
    for(int i=0;i<=str.lenght()-6;i++){
      if(str[i]==" " & str[i+1]=="W" & str[i+2]=="a" & str[i+3]=="l" & str[i+4]=="l" & str[i+5]=="y"){
        return i+1
      }
    }
    return -1;
  }

}

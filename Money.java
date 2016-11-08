public class Money {

  public static void main(String[] args){
	calculateYears(1000,0.05,0.18,1100); 
  }
  public static int calculateYears(double principal, double interest,  double tax, double desired) {
    int years=0;
    double interestRate;
    double taxRate;
    while(principal<desired){
	  interestRate=principal*interest;
	  taxRate=interestRate*tax;
      principal=principal+interestRate-taxRate;
      years++;
    }
    return years;
  }
}

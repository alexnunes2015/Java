public class DnaStrand {
	public static void main(String[] args){
		DnaStrand m = new DnaStrand();
		System.out.println(m.makeComplement(args[0]));
	}
	
  public static String makeComplement(String dna) {
    //Your code
    String newString="";
    for(char c : dna.toCharArray()){
			switch(c){
					case 'A':
						newString=newString+'T';
						break;
					case 'T':
						newString=newString+'A';
						break;
						
					case 'C':
						newString=newString+'G';
						break;
					case 'G':
						newString=newString+'C';
						break;					
			}
	}
    return newString;
  }
}

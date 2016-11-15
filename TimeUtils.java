class TimeUtils {
	public static void main(String[] args){
		TimeUtils w = new TimeUtils();
		System.out.println(w.convertTime(93660));
	}	

  public static String convertTime(int timeDiff) {
  	String endString="";
  	boolean negative=false;
    int seconds=0;
    int minutes=0;
    int hours=0;
    int days=0;
    
    if(timeDiff<0){
    	negative=true;
    	int tmp=timeDiff;
    	timeDiff=(timeDiff-timeDiff)-timeDiff;
    }
            
    while(timeDiff>0){
    	 if(seconds==60){
        minutes++;
        seconds=0; 
      }
      if(minutes==60){
        minutes=0;
        hours++;
        seconds=0;
      }
      if(hours==24){
        hours=0;
        days++;
        minutes=0;
        seconds=0;
      }
      seconds++;
      timeDiff-=1;
    }
    if(negative){
    	if(days!=0){
    		endString="-"+days;
    	}else{
    		endString=days;
    	}
    	if(hours!=0){
    		endString=endString+"-"+hours;
    	}else{
    		endString=hours;
    	}
    	if(minutes!=0){
    		endString=endString+"-"+minutes;
    	}else{
    		endString=minutes;
    	}
    	if(seconds!=0){
    		endString=endString+"-"+seconds;
    	}else{
    		endString=seconds;
    	}
    	
    }else
    	endString=days+" "+hours+" "+minutes+" "+seconds;
    return endString;
  }
}

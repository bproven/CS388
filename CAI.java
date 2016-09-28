import java.util.*;

public class CAI {
	static Scanner input = new Scanner(System.in);
	static Random randomNum = new Random();
	public static void main(String[] args){
   	 question();
    }
    
    public static void question(){
    	int num1, num2, result;
   	 	num1 = randomNum.nextInt(11);
   	 	num2 = randomNum.nextInt(11);
   	 do{
   		 System.out.printf("How much is %d time %d: ",num1,num2);
   		 result = input.nextInt();
   		 
   		 if(result == (num1 * num2)){
   			 displayResponse(respondNum(),true);
   			 question();
   		 }
   		 else 
   			displayResponse(respondNum(),false);
   		 
   	 }while(result != (num1 * num2));
    }
    
    public static int respondNum(){
    	int respond;
    	respond = randomNum.nextInt(4) + 1;
    	return respond;
    }
    
    public static void displayResponse(int respond, boolean answer){
    	String ans;
    	if(answer){
    		switch(respond){
    		case 1: ans = "Very good!";
    				break;
    		case 2: ans = "Excellent!";
					break;
    		case 3: ans = "Nice work!";
					break;
    		case 4: ans = "Keep up the good work!";
    				break;
    		default: ans = "Invalid response";
    				break;
        	}
    	}else{
    		switch(respond){
    		case 1: ans = "No. Please try again.";
    				break;
    		case 2: ans = "Wrong. Try once more.";
					break;
    		case 3: ans = "Don't give up!";
					break;
    		case 4: ans = "No. Keep trying.";
    				break;
    		default: ans = "Invalid response";
    				break;
        	}
    	}
    	System.out.println(ans);
    }
}

import java.util.Scanner;

class largeNumber
{  
        public static void main(String args[])
        {
        	System.out.println("Enter numbers to find Largest!");
         	Scanner keyboard = new Scanner(System.in);
			int largest=0;
			int count=1;
			while(count<=10){
			//for(int count = 1; count <= 10; count = count + 1) {
		        System.out.print("Enter an integer("+count+"): ");
				int number = keyboard.nextInt();
				//System.out.println("Entered num: "+number);
				count++;
				if(number>largest){
					largest=number;
				}
			}
		      //}
		      System.out.println("================================");
		      System.out.println("The largest num is  " + largest);

        }

}

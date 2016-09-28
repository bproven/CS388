import java.util.Scanner;

import java.util.Random;





public class Cai {

   public static void main(String[] args)

   {

      question();

   }

   

   public static void question()

   {

      Scanner input = new Scanner(System.in);

      Random randomNum = new Random();

      int num1, num2, result;



      num1 = randomNum.nextInt(11);

      num2 = randomNum.nextInt(11);

      do

      {

          System.out.printf("How much is %d time %d: ",num1,num2);

          result = input.nextInt();

          

          if(result == (num1 * num2))

          {

              System.out.println("Very Good!");

              question();

          }

          else 

              System.out.println("No. Please try again.");

          

      }while(result != (num1 * num2));

   }

}
// Reverse an already initialized number
package JavaPrograms;
import java.util.Scanner;
class ReverseNumberDemo
{
   public static void main(String args[])
   {
      int num=123456789;
      int reversenum =0;
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of specified number is: "+reversenum);
   }
}
// Reverse a number using recursion
class RecursionReverseDemo
{
   //A method for reverse
   public static void reverseMethod(int number) {
       if (number < 10) {
	   System.out.println(number);
	   return;
       }
       else {
           System.out.print(number % 10);
           //Method is calling itself: recursion
           reverseMethod(number/10);
       }
   }
   public static void main(String args[])
   {
	int num=0;
	System.out.println("Input your number and press enter: ");
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
	System.out.print("Reverse of the input number is:");
	reverseMethod(num);
	System.out.println();
   }
}
// Reverse a number using for Loop
class ForLoopReverseDemo
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Input your number and press enter: ");
      //This statement will capture the user input
      Scanner in = new Scanner(System.in);
      //Captured input would be stored in number num
      num = in.nextInt();
      /* for loop: No initialization part as num is already
       * initialized and no increment/decrement part as logic
       * num = num/10 already decrements the value of num
       */
      for( ;num != 0; )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of specified number is: "+reversenum);
   }
}

// Reverse a number using while Loop
class ReverseNumberWhile
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Input your number and press enter: ");
      //This statement will capture the user input
      Scanner in = new Scanner(System.in);
      //Captured input would be stored in number num
      num = in.nextInt();
      //While Loop: Logic to find out the reverse number
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of input number is: "+reversenum);
   }
}
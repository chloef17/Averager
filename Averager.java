/**
*
* Reads in scores until a negative value is encountered, at which point it determines and prints the average
*
* @author <Chloe Fink>
* @version <14th October 2014>
*
*/
import java.util.Scanner;

public class Averager{
   public static void main (String [] args){
   Scanner scnr = new Scanner(System.in);
   double averageScores = 0;
   
   System.out.print("Please enter your test scores, or -5 to quit.");
   double addScores = scnr.nextInt();
   while (addScores != -5) {
      averageScores = averageScores + addScores/3;
      System.out.println("Please enter another score or -5 to quit.");
      addScores = scnr.nextDouble();
   }
   
   System.out.println("The averagae of your scores is " +averageScores);
   }
 }
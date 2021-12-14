/*
* The "Hello Word!" program, just proves you can show print to terminal.
*
* @author  Darien R-H
* @version 1.0
* @since   2021-12-14
*/


import java.util.Scanner;

public class Main {

 public static void main(String[] args){

 float logLength = 0;

 float totalLogs = 0;

 int logWeightPerMeter = 20; //20 kg per meter

 int maxTruckLoad = 1100; // 1100 kg per truck

 float maxMeterLogs = maxTruckLoad/logWeightPerMeter;  //Maximum number of meters per load

 Scanner myInput = new Scanner (System.in);  //define instance of Scanner for input

 System.out.print("Enter the length of the logs for this load: ");

 logLength = myInput.nextFloat () ;  //get length of log

 totalLogs = maxMeterLogs / logLength;   // Using log length calculate maximum capacity.

 System.out.println ("Total number of logs this truck can carry = " + totalLogs);

 }

}
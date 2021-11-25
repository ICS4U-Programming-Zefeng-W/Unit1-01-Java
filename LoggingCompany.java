/*
 * Outputs the number of logs that can be carried by a truck that can carry 1100 kg  
   given that the mass of the logs are 20 kg/m and the length of the log is inputted by the user.
 * By Zefeng Wang
 * Created on November 25, 2021
 * */

// imports the Scanner class to allow users to input data
import java.util.Scanner;

// class LoggingCompany.
class LoggingCompany {
  // Main does the necessary calculations and outputs the number of logs the truck can carry.
  public static void main(String[] args) {
    System.out.println("What is the length of each log (0.25 metres, 0.50 metres, and 1 metres)?");
    Scanner scannerObj = new Scanner(System.in);
    double logLength = scannerObj.nextDouble();
    final int logWeight = 20;
    final int truckLimit = 1100;
    int logCount = (int) (truckLimit / (logWeight * logLength));
    System.out.printf("The number of logs of length %s and weight %s that can be carried is %s\n",
                        logLength, logWeight, logCount);
  }
}
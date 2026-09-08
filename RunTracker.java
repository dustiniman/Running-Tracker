/********************************************
*	AUTHORS:	Dustin Iman
* COLLABORATORS: <name of peer, tutor, instructor>
*	LAST MODIFIED:	<date of last change>
********************************************/

/********************************************
*	Running Tracker Program
*********************************************
*	PROGRAM DESCRIPTION:
*	This program allows users to view multiple runs at the same time using a custom Run object 
* and tracks running statistics like pace, miles, and calories burned.
*********************************************
*	ALGORITHM:
* Initialize user name and create an array of Run objects.
* Loop through array to show run details.
* Get total miles and total minutes.
* Calculate pace, average miles, and calories burned.
* Print user's running stats with feedback for them.
* Use things like constructors and the equals method.
*********************************************
*	STATIC METHODS:
* calculatePace()
* calculateCaloriesBurned()
* calculateAvgMiles()
*********************************************
*	ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
 *	Not used for UD1
*	<ex: Scanner= used for console input>
*********************************************/

// <IMPORTS GO HERE - Not used for UD1>

public class Main 
{
  /***** CONSTANT SECTION *****/

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    String userName;
    int totalRuns; 
    Run[] myRuns;
    
    double totalMiles = 0;
    double totalMinutes = 0;
    
    double pace;
    double calories;
    double avgMiles;
    /***** INITIALIZATION SECTION *****/
    userName = "Dustin";
    totalRuns = 5;



    myRuns = new Run[totalRuns];
    myRuns[0] = new Run("Half Marathon", 13.1, 128, false);
    myRuns[1] = new Run("Quick Jog", 3.0, 23, true);
    myRuns[2] = new Run("Full Marathon", 26.2, 457, false);
    myRuns[3] = new Run("Longer Run", 10.0, 92, true);
    myRuns[4] = new Run("Tempo Run", 6.7, 41, false);

    System.out.println("=========================================");
    System.out.println("    Object-Oriented Running Tracker      ");
    System.out.println("=========================================");




    /***** PROCESSING SECTION *****/
    for (int i = 0; i < totalRuns; i++)
    {
      System.out.println("\nRun #" + (i + 1));

      System.out.println(myRuns[i].toString());

      
      totalMiles += myRuns[i].getMiles();
      totalMinutes += myRuns[i].getMinutes();



    }

    pace = calculatePace(totalMinutes, totalMiles);
    calories = calculateCaloriesBurned(totalMiles);
    avgMiles = calculateAvgMiles(totalMiles, totalRuns);

    /***** OUTPUT SECTION *****/
    System.out.println("\nStats For " + userName);
    System.out.println("-----------------------------------------");
    System.out.println("Total Miles: " + totalMiles);
    System.out.println("Total Minutes: " + totalMinutes);
    System.out.println("Pace (minute/mile): " + pace);
    System.out.println("Calories Burned: " + calories);
    System.out.println("Average Miles Per Run: " + avgMiles);
    System.out.println("-----------------------------------------");

    if (pace < 8)
    {
    System.out.println("Niceee! Your pace is fast");
    }
    else if (pace < 12)
    {
    System.out.println("Steady pace, good job!");
    }
    else
    {
    System.out.println("Train More To Improve Pace");
    }

    System.out.println("\n--- Testing Required Class Features ---");
    Run blankRun = new Run();
    System.out.println("Default constructor test: " + blankRun.toString());
    blankRun.setAll("Intervals", 4.5, 35, false);
    System.out.println("After setAll test: " + blankRun.toString());

    Run duplicateRun = new Run("Intervals", 4.5, 35, false);
    System.out.println("Checking equality with identical run: " + blankRun.equals(duplicateRun));
    System.out.println("Checking equality with first run: " + blankRun.equals(myRuns[0]));
  }
  /***** STATIC METHODS *****/
  public static double calculatePace(double minutes, double miles)
  {
    return minutes / miles;
  }

  public static double calculateCaloriesBurned(double miles)
  {
    return miles * 125;
  }
  public static double calculateAvgMiles(double miles, int runs)
  {
    return miles / runs;
  }

}

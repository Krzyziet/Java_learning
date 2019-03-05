import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type value of minutes: ");
        int minutes = scan.nextInt();
        System.out.println("Type value of seconds: ");
        int seconds = scan.nextInt();
        System.out.println(getDurationString(minutes, seconds));
    }
    public static String getDurationString(int minutes, int seconds)
    {
        if ( minutes < 0 || seconds < 0 )  //validation
        {
            return "Invalid Value";
        }
        System.out.println("Your time : " + minutes + " minutes " + seconds + "seconds"); //printing declarated time
        if(seconds > 59)
        minutes = minutes+ ((int)seconds/60);
        int hours = minutes / 60; //how many hours is in your declarated minutes time
        int remainingseconds = seconds % 60; // taking remaining seconds from full minutes
        int remainingminutes = minutes % 60; // taking remaining minutes from full hours
        return getDurationString(hours, remainingminutes, remainingseconds);


    }

    public static String getDurationString (int hour, int minute, int second)
    {
        String hours = toPrintFormating(hour); //taking hour to string
        String minutes = toPrintFormating(minute);
        String seconds = toPrintFormating(second);
        return ("Your formated times is equal to: " + hours + "h " + minutes + "m " + seconds + "s" );
    }

    public static String toPrintFormating(int number)
    {
        String formated;
        if(number >= 9) //validation of digits
        {
            formated = String.valueOf(number);
        }
        else {
            Integer.toString(number);
            formated = 0 + String.valueOf(number); // adding 0 to one digit numbers
        }
        return formated;
    }

}

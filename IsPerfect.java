public class Main {

    public static void main(String[] args) {
        int number = 6;
        if(isPerfect(number))
            System.out.println("You put here PERFECT number");
        else
            System.out.println("Your number is not PERFECT");
    }
    public static int sumDividors(int number)
    {
        int sum = 0;
        for(int i = 1; i < number ; i++)
        {
            if(number % i == 0)
                sum += i;
        }
        return sum;
    }
    public static boolean isPerfect(int number)
    {
        if (number == sumDividors(number))
            return true;
        else
            return false;
    }
}

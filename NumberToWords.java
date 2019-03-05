public class Main {

    public static void main(String[] args) {
        int number = -1000;
        System.out.println("You put here: " + number);
        System.out.println("In words: " + printing(number, digitCount(number))); //function calling
    }
    public static String numberToWord(int number) // method with Case Statement who's returning number in word string
    {
        switch(number)
        {
            default:
            {
                System.out.println("Bad values");
            }
            case 0: {
                return "Zero ";
            }
            case 1: {
                return "One ";
            }
            case 2: {
                return "Two ";
            }
            case 3: {
                return "Three ";
            }
            case 4: {
                return "Four ";
            }
            case 5: {
                return "Five ";
            }
            case 6: {
                return "six ";
            }
            case 7: {
                return "Seven ";
            }
            case 8: {
                return "Eight ";
            }
            case 9: {
                return "Nine ";
            }
        }
    }
    public static int reverse(int number) // reversing a number
    {
        boolean sign; //taking + or - sign
        if(number > 0)
            sign = true;
        else {
            sign = false;
            number *= -1;
        }
        int reverse = 0;
        while (number > 0)
        {
            reverse = reverse*10+number%10;
            number /= 10;
        }
        if (sign == true) // usign sign
            return reverse;
        else
            return reverse*-1;
    }

    public static String printing(int number, int zeroDigits) //print method
    {
        if (number == 0)
            return "Zero";
        String words;
        int digit;
        number = reverse(number);
        if (number < 0) //if number is negative adding a Minus word at start of string
        {
            number *=-1;
            words = "Minus ";
        }
        else
            words ="";
        while (number > 0) // transfering a variable digit to numberToWord method
        {
            digit = number % 10;
            words += numberToWord(digit);
            number /= 10;
        }
        for(int i = 0; i < zeroDigits ; i++) // validation of number with 0 at end of number
        {
            words = words + "Zero ";
        }
        return words;
    }
    public static int digitCount (int number) //counting a number of digits and returning a count of diffrence. It's to validate a 100, 1000 ETC
    {
        int reversedDigits= 0;
        int numberDigits = 0;
        int reverse;
        if (number < 0)
            number *= -1;
        reverse = reverse(number);
        while(reverse > 0)
        {
            reversedDigits++;
            reverse /=10;
        }
        while(number > 0)
        {
            numberDigits++;
            number /=10;
        }
        return numberDigits-reversedDigits;

    }
}

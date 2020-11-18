import java.util.Scanner;
/*
    @author Ronald Ewing
    CSCI 1010-9 and 1011-1
    Assignment 5

        The program will allow a user to put
        how many apples they have and get the
        amount using java.util.Scanner and
        System.out.println

 */
public class ApplePicker {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many apples did you pick?");

        String userString = myScanner.nextLine();

        //Does not account for non integer convertable strings, who cares!
        int apples = Integer.parseInt(userString);


        //All of this is very inefficient, but it works for now!

        //TODO: Use a switch, but it doesnt really support this
        // and the efficiency is about 20ns (nanoseconds) so its fine
        if(apples < 0) {
            System.out.println("Number does not exist, please dont be Autisti");
            return;
        }

        if (apples < 10 )
        {
            System.out.println("Total Charge is: " + apples*5);
        }

        if (apples >= 10 && apples <= 39 )
        {
            System.out.println("Total Charge is: " + apples*4.5);
        }

        if (apples >= 40 && apples <= 59 )
        {
            System.out.println("Total Charge is: " + apples*4);
        }

        if (apples > 60 )
        {
            System.out.println("Total Charge is: " + apples*3.5);
        }

        //This is the end just incase it breaks you atleast get something!
        System.out.println("Goodbye!");

    }
}
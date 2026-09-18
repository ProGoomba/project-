
import java.util.Scanner;


class Main
{
    public static void main(String[] Args)
    {
        //Pass The Story Project

        //This program takes string input and assigns it to null spaces within the WordList array!

        Scanner sc = new Scanner(System.in);
         String[] WordList = new String[6];
        String firstEntry = "Once upon a time, there was a Hare with 8 lives";
        WordList[0] = firstEntry;
        int i = 1;

        //Assigns String inputs to free spaces within the Array.
        while (i < WordList.length) {
                String wordInput = sc.nextLine();

                //wordInput Allocating String input to Array Space.
                WordList[i] = wordInput;
                i++;

        }
        //Prints every Non-null story entry from the Array with a function.
        printArray(WordList);
    }

    public static void printArray(String [] Array)
    {

        for (int s = 0; s< Array.length; s++) {

                if (s == 0) {

                    System.out.println("\n" + Array[s] + " ");
                }
                else if(s == Array.length - 1)
                {
                    System.out.println("\n" + Array[s] + " ");
                }

                else
                {
                    System.out.println("\n" + Array[s] + " and then,");
                }

        }

    }
}
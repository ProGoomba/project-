
import java.util.Scanner;


class Main
{
    void main(String[] Args)
    {

        //Pass The Story Project
        //This program takes string input and assigns it to null spaces within the WordList array!

        Scanner sc = new Scanner(System.in);
        String[] WordList = new String[10];
        int i = 0;

        //Assigns String inputs to free spaces within the Array.
        while (i < WordList.length) {

            //Non-String input handling via: Try, Catch.
            try
            {
                String wordInput = sc.nextLine();

                //Special characters or numbers? ACCESS DENIED! >:C
                if(!wordInput.matches("[a-zA-Z]+"))
                {
                    throw new IllegalArgumentException("Please only input strings or alphabetical numbers." + "\nNo Special characters");
                }

                //WordCheck Passed Allocating String input to Array Space.
                WordList[i] = wordInput;
                i++;

                //Prints out each and every word assigned from Array index 0 to 9
                if (i == WordList.length)
                {
                    for (int a = 0; a < WordList.length; )
                    {
                        System.out.println(WordList[a] + " ");
                        a++;
                    }
                }

            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Error: " + e.getMessage());

            }


        }
    }
}
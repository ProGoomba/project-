
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

            //Non-String input handling via: Try, Catch.
            try
            {
                String wordInput = sc.nextLine();

                //Special characters or numbers? ACCESS DENIED! >:C
                if(!wordInput.endsWith("and then."))
                {
                    throw new IllegalArgumentException("End of sentence must end with \"and then.\"");
                }

                //WordCheck Passed Allocating String input to Array Space.
                WordList[i] = wordInput;
                i++;

                //Prints every Non-null story entry into the Array
                if (i == WordList.length)
                {
                    for (int a = 0; a < WordList.length; )
                    {
                        if(WordList[a] != null) {
                            System.out.println(WordList[a] + " ");

                        }
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
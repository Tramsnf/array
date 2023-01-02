import java.util.Random;
import java.util.Scanner;

public class Program1 {
    // declare a random object
    static Random random;
    /**
     * method gets input from user.
     * @return an integer
     */
    static int getUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        return sc.nextInt();
    }

    /**
     * method removes element from a random position in the array
     * @param arr is an array of integers
     * @return  an array of integer with removed element
     */
    static Integer[] removeRandom(Integer [] arr){
        //declare max and min according to size of array
        int max = arr.length-1 , min = 0;
        //get random position within the array
        int position = random.nextInt((max+1) - min) + min;
        // if not null delete remove the element
        if(arr[position] == null){
            System.out.println("Deleting element from index "+position+": The cell is empty");
        }else{
            System.out.println("Deleting element from index "+position+": "+arr[position]);
            arr[position] = null;
        }

        return arr;
    }
    public static void main(String ... args){
        //initialize the random class
        random = new Random();
        //get user input
        int N = getUserInput();
        //create an array of integers with N as its size
        Integer[] arr = new Integer[N];

        //loop to initialize the array with random numbers between 1 - 100
        for(int i = 0; i < N; i++)
        {
            int max = 100, min = 1;
            //generate a random number using the random class
            //since 1 and 100 are inclusive, increase max by 1, subtract min to get the random range, add min which is the fixed range
            Integer rand = random.nextInt((max+1) - min) + min;
            //insert number in array
            arr[i] = rand;
        }
        //
        int i = 0;
        //continuously remove elements from the arr array until empty
        //to ensure program completes, use a while loop and repeatedly call removeRandom() until a certain position is null
        //if null, move to next position
        while(i < arr.length){
            if(arr[i] != null){
                arr = removeRandom(arr);
            }else{
                i++;
            }
        }
    }

}

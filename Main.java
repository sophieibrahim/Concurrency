import java.util.Random;

public class Main {

    //Finding minimum number? (Someone mentioned this would help but I don't know how...)
    public void Summation(int[] array, int first, int second)
    {
        this.array = array;
        this.first = first;
        this.second = Math.min(second, array.length);
    }
    //Trying to create recursive function to add sums
    public static int sum(int[] array, int first, int second) {
        int sum = 0;
        for (int i = first; i < second; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        //Initialize random
        Random rand = new Random();

        //Initialize Array of 200M spaces
        int[] array = new int[200000000];

        //Random numbers generated from 1 - 10
        for (int i = 0; i < array.length; i++) {

            array[i] = rand.nextInt(10) + 1;
        }

        //Calling recursive function? But I can't figure out how to get it to keep itterating
        //Not sure how to use threads :(
        System.out.println(sum(array, array[i], array[i + 1]));
    }
}


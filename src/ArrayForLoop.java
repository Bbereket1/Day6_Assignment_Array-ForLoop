import java.util.Arrays;

public class ArrayForLoop {
    public static void main(String[] args) {

        /*

        1.An array is a list of values. Arrays are often used for contact apps, groceries list apps,
        and also apps that include a shopping cart of items such as Amazon and Best Buy.

        Create a method that takes an array of prices and returns the sum of the prices.
        For this problem, you can assume that the array always has 4 values.

        In your main method, create an array with 4 doubles to represent the costs of items in the shopping cart.
        The array should only contain costs (Example: 14:56, 4.99, 2.53).
        Invoke your other method and pass this array so that it prints the result to the console.



        2.BONUS FOR 5 POINTS:

        Create a method that takes an array of numbers. Use a for loop to return the sum of an array.
        This should work regardless of the size of the array.
        In other words, I should be able to invoke this method with 3 items, 4 items, or 5 and they should all work.
        We haven't covered for loops yet so you'll have to Google it.
        Throughout your career as a developer you will constantly be confronted with problems
        that you don't know how to solve and for which you will have to Google the answers.
        This is an essential skill to have.



        3.BONUS FOR 10 POINTS:

        Create a method that takes an array of numbers. Use a for loop to return the average values of the array.
        For example, I should be able to invoke your method with numbers 5, 10, 3 - this should return 6.
        I should also be able to invoke the same method with 10, 7, 4, 9, 5 and it should return 7.

         */


        System.out.println("Question1A*******************");


        double[] costs = {14.56, 4.99, 2.53, 5.5};
        System.out.println(shoppingCart(costs));

        System.out.println("Question2*********************");

        double[] num = {3, 5,5,4,2};
        arrayOfNumbers(num);


        System.out.println("question3A*************************");

        int [] nums = {5, 5, 5, 5};
        myNumbers(nums);
        System.out.println(myNumbers(nums));

    }


    public static double shoppingCart(double[] prices) {
        return Arrays.stream(prices).sum();


    }

    public static void arrayOfNumbers(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.stream(nums).sum());
        }

    }


    public static double myNumbers(int [] num) {
        int  sum=0;
        for (int i=0; i < num.length; i++) {
            sum += num[i];
        }
        // I couldn't able to return the average value
        double average = sum/(int) num.length;
        return average;

    }

    }






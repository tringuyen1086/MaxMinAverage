// Date: 08/08/2023
// This program is created by Tri Nguyen
/* Program Description:
Calculate the Maximum, Minimum, or Average values of any given variable number of arguments
 */

package tri.nguyen;

import java.util.Arrays;

public class MaxMinAverage {
    public static double max(double... numbers){
        double maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maximum){
                maximum = numbers[i];
            }
        }
        return maximum;
    }

    public static double min(double... numbers){
        double minimum = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < minimum){
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    public static double average(double... numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        return average;
    }
    public static void main(String[] args){
        double[] data = {3, 7, 1, 20, 3.5, 2.8};

        System.out.printf("The maximum values of %s is %.2f \n", Arrays.toString(data), max(data));
        System.out.printf("The minimum values of %s is %.2f \n", Arrays.toString(data), min(data));
        System.out.printf("The average values of %s is %.2f \n", Arrays.toString(data), average(data));



        System.out.printf("The maximum value of the given numbers (3, 4, 5) is %.2f \n", max(3,4,5));
        System.out.printf("The maximum value of the given numbers (9, 7, 10, 25) is %.2f \n", max(9, 7, 10, 25));
        System.out.printf("The minimum value of the given numbers (3, 4, 5) is %.2f \n", min(3,4,5));
        System.out.printf("The minimum value of the given numbers (9, 7, 10, 25) is %.2f \n", min(9, 7, 10, 25));
        System.out.printf("The average value of the given numbers (3, 4, 5) is %.2f \n", average(3,4,5));
        System.out.printf("The average value of the given numbers (9, 7, 10, 25) is %.2f \n", average(9, 7, 10, 25));


    }
}

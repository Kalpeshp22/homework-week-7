package homeworkweek7;
/*
Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Programme17 {
    public static void main(String[] args) {

       int   [] my_array1 = {
                101, 705, 999, 888, 111,
                222, 333, 444, 555, 666,
                199, 299, 399, 499};

        String[] my_array2 = {
                "Jack",

                "Mac",
                "Jerry",
                "Tom",
                "Charlie",
                "Chaplin"
        };
        System.out.println("Original numeric array : "+ Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+Arrays.toString(my_array2));


    }
}

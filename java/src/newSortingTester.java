import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class newSortingTester{
    //This test case tests to see if newSorting.java works with an array of all positive numbers
    //Passed
    @Test
    public void newSorting1(){
        int[] arry = {10, 4, 7, 1, 5, 2, 8, 9, 3, 6};
        int[] testArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        newSorting sol = new newSorting();
        sol.newSorting(arry,10);
        assertArrayEquals(testArr, arry);
    }

    //This test case tests to see if newSorting.java works with an array of negative and positive numbers
    //Passed
    @Test
    public void newSorting2(){
        int[] arry = {-4, 0, -3, -7, 9, 2, 4, 8, -9, 1};
        int[] testArr = {-9, -7, -4, -3, 0, 1, 2, 4, 8, 9};
        newSorting sol = new newSorting();
        sol.newSorting(arry,10);
        assertArrayEquals(testArr, arry);
    }

    //This test case tests to see if newSorting.java works with an array that has duplicate numbers
    //Passed
    @Test
    public void newSorting3(){
        int[] arry = {0, 2, 7, 1, 10, 10, 1, 2, 1, 4};
        int[] testArr = {0, 1, 1, 1, 2, 2, 4, 7, 10, 10};
        newSorting sol = new newSorting();
        sol.newSorting(arry,10);
        assertArrayEquals(testArr, arry);
    }

    //This test case tests to see if newSorting.java works with an array of all the same numbers
    //Passed
    @Test
    public void newSorting4(){
        int[] arry = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] testArr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        newSorting sol = new newSorting();
        sol.newSorting(arry,10);
        assertArrayEquals(testArr, arry);
    }

    //This test case tests to see if newSorting.java works with already sorted array of numbers
    //Passed
    @Test
    public void newSorting5(){
        int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] testArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        newSorting sol = new newSorting();
        sol.newSorting(arry,10);
        assertArrayEquals(testArr, arry);
    }
}

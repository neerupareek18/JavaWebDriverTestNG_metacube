package Assignment6;

import org.testng.annotations.Test;

public class Assignmnet6_2 {

    @Test
    public void is3greaterThan5() {
        System.out.println(compareNumbers(3, 5));
    }

    public boolean compareNumbers(int a, int b) {

        if (a > b)
            return true;
        else
            return false;

    }
}
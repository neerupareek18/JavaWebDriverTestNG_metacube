package Assignment6;

import org.testng.annotations.Test;

public class Assignment6_1 {

    @Test
    public void notEqualNumbers(){
        int a = 3;
        int b = 5;

        if(a==b){
            System.out.printf("%d, %d are equal", a,b);
        }
        else
            System.out.printf("%d, %d  are not equal",a,b);
    }

}

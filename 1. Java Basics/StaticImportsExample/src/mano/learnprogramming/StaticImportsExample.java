package mano.learnprogramming;

//static imports
import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static mano.learnprogramming.Config.*;

public class StaticImportsExample {

    public static void main(String[] args) {
        int min = min(5,7);
        out.println("min= " + min);
        out.println(PI);

        pringConfig();

        out.println(NAME);
        out.println(MAX_COLUMN_COUNT);
    }
}

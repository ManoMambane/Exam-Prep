package ParentPackage.ChildPackage; //be careful in exam

import java.util.Random; //importing random package

public class ImportExample {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(5));
    }
}

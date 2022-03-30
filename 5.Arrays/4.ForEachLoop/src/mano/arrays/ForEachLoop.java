package mano.arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] names = {"Jimmy", "John", "Tom", "Anthony"};

        for (int i = 0; i < names.length;i++){
            System.out.println("name= " + names[i]);
        }

        System.out.println();

        for (String name : names){
            System.out.println("name= " + name);
        }

        System.out.println();

        for (String name : names){
            name = name + " " + name; //cant change local variable
        }

        System.out.println();

        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };

        for (StringBuilder builder : builders){
            System.out.println(builder);
        }

        for (StringBuilder builder : builders){
            builder.append("123");
        }

        for (StringBuilder builder : builders){
            System.out.println(builder);
        }

        System.out.println();

        String pets = "Parrot";

        for (char c : pets.toCharArray()){
            System.out.println(c);
        }
    }
}

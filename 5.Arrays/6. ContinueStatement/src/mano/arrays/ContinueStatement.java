package mano.arrays;

public class ContinueStatement {

    public static void main(String[] args) {

        myLabel: {
            int[] mtArray = {1, 2, 3};
        }

        String[] animals = {"Dog", "Cat", "Lizzard", "Bird", "Snake"};

        for(String animal : animals){
//            System.out.println(animal);
        }

        System.out.println();

        MY_LOOP: for (String animal : animals){
            if(animal.equals("Bird")){
                continue MY_LOOP;
            }
            System.out.println(animal);
        }

        System.out.println();

        animal: for (String animal : animals){
            if(animal.equals("Bird")){
                continue animal;
            }
            System.out.println(animal);
        }

        System.out.println();

        for (String animal : animals){
            if(animal.equals("Lizzard") || animal.equals("Cat")){
                continue;
            }
            System.out.println(animal);
        }

        int index = 0;
        while (index < animals.length){
            String animal = animals[index];
            index++; //watch out!!

            if (animal.equals("Lizzard")){
                continue;
            }
            System.out.println(animal);
        }
    }
}

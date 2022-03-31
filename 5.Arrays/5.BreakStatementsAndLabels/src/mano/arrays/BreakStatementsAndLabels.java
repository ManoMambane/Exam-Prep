package mano.arrays;

public class BreakStatementsAndLabels {

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
                break MY_LOOP;
            }
            System.out.println(animal);
        }

        System.out.println();

        animal: for (String animal : animals){
            if(animal.equals("Bird")){
                break animal;
            }
            System.out.println(animal);
        }

        System.out.println();

        for (String animal : animals){
            if(animal.equals("Lizzard")){
                break;
            }
            System.out.println(animal);
        }

        int index = 0;
        while (index < animals.length){
            String animal = animals[index];

            if (animal.equals("Lizzard")){
                break;
            }
            System.out.println(animal);
            index++;
        }
    }
}

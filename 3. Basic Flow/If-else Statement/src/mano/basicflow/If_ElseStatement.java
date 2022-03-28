package mano.basicflow;

public class If_ElseStatement {

    public static void main(String[] args) {
        boolean b = true;
        boolean c = false;

        if (b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // if boolean is not true example
        if (!c) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        int x = 2;
        //if(x){}
        //if (x = 1) {}
        if (x == 1) {}

        int testScore = 76;
        char grade;

        if(testScore >= 90) {
            grade='A';
        } else if(testScore >=80){
            grade='B';
        } else if(testScore >=70){
            grade='C';
        } else if(testScore >= 60){
            grade='D';
        } else if(testScore >= 50){
            grade='E';
        } else {
            grade = 'F';
        }
        System.out.println("grade= "+grade);

        int hoursOfDay = 10;
        if(hoursOfDay < 11) System.out.println("Afternoon");
        else if(hoursOfDay < 17) System.out.println("Evening");
        else
            System.out.println("Day");

        if(hoursOfDay < 17) {
            System.out.println("Afternoon");
        } else if(hoursOfDay < 11) { // 11 is < 17
            System.out.println("Morning");
        } else {
            System.out.println("Evening");
        }
    }
}

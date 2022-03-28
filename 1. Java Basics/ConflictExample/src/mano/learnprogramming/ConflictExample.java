package mano.learnprogramming;

//import java.sql.*;

import java.util.List;

public class ConflictExample {

    public static void main(String[] args) {
        java.util.Date date;
        java.sql.Date sqlDate;
    }

    //code formatting
    public void checkEmpty(List list) {
        if (list.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    public class LineNumbers {
        public void checkEmpty(List list) {
            if (list.isEmpty()) {
                System.out.println("Empty");
            } else {
                System.out.println("Not Empty");
            }
        }
    }
}
package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "David";
        } else if (query.contains("plus")) {
            String[] strings = query.split(" ");
            int counter = 0;
            int[] numbers = new int[2];
            for (int i = 0; i < strings.length; i++) {
                try {
                    double x = Double.parseDouble(strings[i]);
                    numbers[counter] = (int) x;
                    counter++;
                } catch (Exception e) {
                    continue;
                }
            }
            int sum = numbers[0] + numbers[1];
            return "" + sum;
        }// TODO extend the programm here
        else if (query.contains("largest")) {
            String[] strings = query.split(" ");
            int counter = 0;
            int[] numbers = new int[20];
            for (int i = 0; i < strings.length; i++) {
                try {
                    double x = Double.parseDouble(strings[i]);
                    numbers[counter] = (int) x;
                    counter++;
                } catch (Exception e) {
                    continue;
                }
            }
            int currentMax = 0;
            for (int x : numbers) {
                if (x > currentMax) {
                    currentMax = x;
                }
            }
            return "" + currentMax;
        } else if (query.contains("multipl")) {
            String[] strings = query.split(" ");
            int counter = 0;
            int[] numbers = new int[2];
            for (int i = 0; i < strings.length; i++) {
                try {
                    double x = Double.parseDouble(strings[i]);
                    numbers[counter] = (int) x;
                    counter++;
                } catch (Exception e) {
                    continue;
                }
            }
            int sum = numbers[0] * numbers[1];
            return "" + sum;
        } else if (query.contains("which city is the Eiffel tower ")) {

            return "paris";

        } else {

            return "";
        }//hello
    }

}

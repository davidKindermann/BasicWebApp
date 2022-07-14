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
            Double[] numbers = new Double[2];
            for (int i = 0; i < strings.length; i++) {
                try {
                    double x = Double.parseDouble(strings[i]);
                    numbers[counter] = x;
                    counter++;
                } catch (Exception e) {
                    continue;
                }
            }
            double sum = numbers[0] + numbers[1];
            return "" + sum;
        }// TODO extend the programm here
        else {
            return "";
        }//hello
    }
}

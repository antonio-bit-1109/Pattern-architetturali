package org.example.facade_pattern;

public class HandleUpperCase {

    public String handleIfPair_or_odd(boolean isPari , String frase){

        return isPari ? OneCapitalOneNo(frase) : OneCapitalTwoNo(frase);

    }

    private String OneCapitalOneNo(String frase){

        String output = "";
        boolean capital = true;
        for (int i = 0; i< frase.length(); i++){
            char l = frase.charAt(i);

            if (capital){
                output += (String.valueOf(l).toUpperCase());
                capital = false;
            }

            output += String.valueOf(l);
        }

        return output;
    }

    private  String OneCapitalTwoNo(String frase){

        String output = "";

        for (int i = 0; i< frase.length(); i++){
            char l = frase.charAt(i);

            if (i == 0 || i % 3 == 0){

                output += (String.valueOf(l).toUpperCase());
            }
            output += String.valueOf(l);
        }

        return output;
    }
}

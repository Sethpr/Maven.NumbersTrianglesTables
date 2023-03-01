package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder word = new StringBuilder("");
        for(int i = start; i < stop; i++){
            if(i%2==1)
                word.append(i);
        }

        return word.toString();
    }


    public static String getOddNumbers(int start, int stop) { // I think these are backwards in the test
        StringBuilder word = new StringBuilder("");
        for(int i = start; i < stop; i++){
            if(i%2==0)
                word.append(i);
        }

        return word.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder word = new StringBuilder();
        for(int i = start; i < stop; i+= step){
            word.append(i*i);
        }

        return word.toString();
    }

    public static String getRange(int stop) {
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < stop; i++){
                word.append(i);
        }

        return word.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder word = new StringBuilder();
        for(int i = start; i < stop; i++){
                word.append(i);
        }

        return word.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder word = new StringBuilder("");
        for(int i = start; i < stop; i+= step){
            word.append(i);
        }

        return word.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder word = new StringBuilder("");
        for(int i = start; i < stop; i+=step){
            word.append((int) Math.pow(i, exponent));
        }

        return word.toString();
    }
}

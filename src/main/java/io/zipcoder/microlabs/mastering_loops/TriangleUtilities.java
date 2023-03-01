package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder tri = new StringBuilder();
        System.out.println(numberOfRows);
        int max = numberOfRows-1;// IDK if the -1 is proper here but it matches the expected output. the values passed in are one higher than the number of rows the expected values have
        for(int i = 0; i < max; i++){
            tri.append("*".repeat(i+1) + "\n");
        }


        return tri.toString();
    }

    public static String getRow(int numberOfStars) {
        return "*".repeat(numberOfStars);
    }

    public static String getSmallTriangle() {
        StringBuilder tri = new StringBuilder();
        int max = 4;
        for(int i = 0; i < max; i++){
            tri.append("*".repeat(i+1) + "\n");
        }


        return tri.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder tri = new StringBuilder();
        int max = 10;
        for(int i = 0; i < max; i++){
            tri.append("*".repeat(i+1) + "\n");
        }


        return tri.toString();
    }
}

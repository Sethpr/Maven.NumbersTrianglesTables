package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        int max = 5; // no magic numbers :)
        int num = 0;
        for(int i = 0; i < max; i++){
            for(int j = 0;j < max; j++) {
                num = (j + 1) * (i + 1);
                if(num<10){
                    table.append("  " + num + " |");
                }
                else{
                    table.append(" " +num + " |");
                }

            }
            table.append("\n");
        }
        return table.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        int max = 10; // no magic numbers :)
        int num = 0;
        for(int i = 0; i < max; i++){
            for(int j = 0;j < max; j++) {
                num = (j + 1) * (i + 1);
                if(num<10){
                    table.append("  " + num + " |");
                }
                else if(num<100){
                    table.append(" " + num + " |");
                }
                else{
                    table.append(num + " |");
                }

            }
            table.append("\n");
        }
        return table.toString();
    }


    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        int max = tableSize; // no magic numbers :)
        int num = 0;
        for(int i = 0; i < max; i++){
            for(int j = 0;j < max; j++) {
                num = (j + 1) * (i + 1);
                if(num<10){
                    table.append("  " + num + " |");
                }
                else if(num<100){
                    table.append(" " + num + " |");
                }
                else{
                    table.append(num + " |");
                }

            }
            table.append("\n");
        }
        return table.toString();
    }
}

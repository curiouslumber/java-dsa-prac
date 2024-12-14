package Hackerrank;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        if(s.substring(s.length() - 2).equals("AM")) {
            if(!s.substring(0, 2).equals("12")) {
                return s.substring(0, s.length() - 2);
            }
        }
    
        Integer hours = Integer.parseInt(s.substring(0, 2)) + 12;
        String finalHours  = "";
        if(hours.equals(24)) {
            finalHours = s.substring(s.length() - 2).equals("AM") ? "00" : "12";
        } else {
            finalHours = hours.toString();
        }

        return (finalHours + s.substring(2, s.length() - 2));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
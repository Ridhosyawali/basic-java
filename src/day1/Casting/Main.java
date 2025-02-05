package day1.Casting;

public class Main {
    public static void main(String[] args) {
        int number =123;

        String inToString = Integer.toString(number);
        //konversi int ke string
        System.out.println("number to string : " + inToString);

        //konversi string ke integer
        String numberString = "123";
        System.out.println("string to integer : " + Integer.parseInt(numberString));

        //String to double
        String doubleString = "123.45";
        System.out.println("string to double : " + Double.parseDouble(doubleString));

        //String to boolean
        String booleanString  = "true";
        System.out.println("string to boolean : " + Boolean.parseBoolean(booleanString));

        //int to double
        int intValue =12;
        double doubleValue = intValue;
        System.out.println("int to double : " + doubleValue);

        //double to int
        int intValueFromDouble = (int) doubleValue;
        System.out.println("double to int : " + intValueFromDouble);
    }
}

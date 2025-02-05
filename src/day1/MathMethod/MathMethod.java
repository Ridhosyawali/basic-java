package day1.MathMethod;

public class MathMethod {
    public static void main(String[] args) {
        float phi = (float) Math.PI;
        System.out.println("Math.PI"+phi);

        double floorValue = Math.floor(3.8); // dibulat kebawah
        System.out.println("Math Floor : " + floorValue);

        double ceilValue = Math.ceil(3.2); // dibulatkan ke atas
        System.out.println("Math ceil : " + ceilValue);

        double roundeValue = Math.round(3.4); // dibulatkan terdekat
        System.out.println("Math.round"+roundeValue);

        double squeareValue = Math.sqrt(64); // Menghitung akar
        System.out.println("Math.sqrt : " + squeareValue);

        double powerOfTwo = Math.pow(4,2); //menghitung pangkat
        System.out.println("Math.pow :" + powerOfTwo);

        int min = Math.min(10,5);
        System.out.println("Math.min :"+min);

        int max = Math.max(10,5);
        System.out.println("Math.max :" + max);

        double randomValue = Math.random(); //generate nilai random
        System.out.println("Math.random :" + randomValue);
    }
}

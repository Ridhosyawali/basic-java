package day1.Looping;

public class Looping {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        //for biasa
        for (int i = 0; i < numbers.length; i++) { //jika variabel numbers sudah dihitung sampai 0
            System.out.println("for biasa : " + i); // maka tampilkan
        }

        // nehanced loop
        for (int i : numbers){
            System.out.println("nehanced :" + i);
        }

        // while loop
        int i = 0;
        while (i < numbers.length){
            System.out.println("while : " + i);
            i++;
        }
    }
}

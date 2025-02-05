package day1.Array;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        System.out.println("==== ARRAY ====");
        int[] numbers = {1,2,3,4,5};
        System.out.println("Array length : " + numbers.length);
        numbers[4] = 7; // untuk mengganti indeks ke empat menjadi 7

        System.out.println("==== ARRAY METHOD ====");
        System.out.println("==== SORT ====");
        Integer sortArray[] = {2,3,4,1,8,5,7,2};
        // mehtod array untuk ngurutin ASC (dari kecil ke besar)
        Arrays.sort(sortArray);
        for (int i : sortArray){
            System.out.println("Sorted array = " + i);
        }

        System.out.println("==== FILL ====");
        // method fill : method untuk mengisi semua indeks array dengan nilai yang sama
        int[] fillNumbers = new int[5];
        Arrays.fill(fillNumbers, 8); // untuk mengisi semua data jadi 7
        for (int i : fillNumbers){
            System.out.println("fill : " + i);
        }

        System.out.println("==== COPY OF ARRAY ====");
        // method untuk menyalin array lain
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
        for (int i : copyNumbers){
            System.out.println("copy numbers : " + i);
        }

        // menyalin data dari array numbers ke array newNumbers
        int[] newNumbers = Arrays.copyOf(numbers, numbers.length +  1);
        newNumbers[5] = 50;
        for (int i : copyNumbers){
            System.out.println("copy newNumbers : " + i);
        }

        //qeuals array : menyamakan 2 data array
        System.out.println("==== EQUALS ARRAY ====");
        int[] equalNumbers1 = {1,2,3,4,5};
        int[] equalNumbers2 = {1,2,3,4,5};
        boolean isEquals = Arrays.equals(equalNumbers1, equalNumbers2);
        System.out.println("isEquals : " + isEquals);

        // dibawah ini contoh ketika looping yang menggunkan logic
         int search = 4;
         for (int i : equalNumbers1){
             if(equalNumbers1[i] == search){
                 System.out.println("value 4 is exist");
                 System.out.println("current value :" + equalNumbers1[i]);
                 break; // untuk memberhentikan proses looping ketika kondisi terpenuhi
             }
         }

        System.out.println("==== Convert to String ====");
        String arrayToString = Arrays.toString(newNumbers);
        System.out.println("Array to String : " + arrayToString);
    }
}

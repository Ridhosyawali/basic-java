package day1.Method;

//cara import methode instance
import static day1.Method.MultipleMethod.*;
import static day1.Method.Animal.*;

public class Method {
    // Method : fungsi untuk menjalankan suatu perintah/perilaku tertentu (fungsi dalam JS)


    /* Public static int add(int num1, int num2){} cara membuat method
    *  Public static : access modifier agar method ini bisa digunakan secara global
    *  int add(params) : method/fungsi dengan return integer
    *  return : untuk menampilkan nilai
    *  */
    public static int add(int num1, int num2){return num1 + num2;}

    public static int cekNilai(int nilai){
        if (nilai >= 80){
            System.out.println("LULUS");
        }else {
            System.out.println("Baik");
        }
        return nilai;
    }

    public static void main(String[] args) {
        //cara jalanin method
        int result = add(5,2);
        System.out.println("Sum : " + result);

        System.out.println("Status nilai : " + cekNilai(70));
        cekNilai(90);

        // memanggil file multiple
        System.out.println("=== METHOD OVERLOAD ===");
        System.out.println("Multiple : " + multiple(2,10));
        System.out.println("Double : " + multiple(3 , 2, 10));
        System.out.println("Double : " + multiple(3.2 , 2.1, 10));

        System.out.println("=== METHOD OVERRIDE ===");
        System.out.println(sound()); // parent yang return asli
        System.out.println(Cat.sound()); // child yang mereplace method parent

        // cara memanggil instance method
        System.out.println("===instance methode===");
        Animal hewan = new Animal();
        System.out.println(hewan.sound());

        Cat kocheng = new Cat();
        System.out.println("kocheng : "+kocheng.sound());
    }
}

package day2.BasicOOP;

/* Class : konsep dasar untuk membuat objek atau kerangka kerja yang mendefinisikan
* karakteristik dan perilaku suatu objek
* atau bisa dibilang class yang berisi fungsionalitas suatu program */
public class Basic { // CLASS PENAMPUNG
    public static class Human { // CLASS STATIC YANG BISA DIPANGGIL OLEH CLASS LAINNYA SEBAGAI OBJEK
        // Class atribute : data yang dimiliki objek
        String name;
        int age;

        // Constructor : method khusus yang menginisialisasikan objek/mengatur nilai awal dari variabel class
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void breath(){
            System.out.println(name + "is breathing. and he's age" + age + "years old");
        }

        public void fart(){
            System.out.println(name + "is Farting");
        }


    }
}

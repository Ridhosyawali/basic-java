package day2.BasicOOP.AccessModifier;

public class Person {
 //Access Modifier : kata kunci untuk mengatur akssebilitas, visibilitas dari sebuah class, variable, method
    // public
    public String name; // berfungsi dapat diakses dimana saja

    // private
    private int age; // hanya bisa diakses dalam kelas sendiri(person)

    // protected
    protected String address; // hanya dapat diakses oleh class sendiri (person) dan subclassnya

    // Non-access modifier :
    // static
    public static int totalPerson = 0; // Variabel statis untuk memberikan nilai awal terhadap variabel

    // final
    public final String NATIONALITY = "Indonesian"; // untuk membuat nilai constant

   public Person(String name, int age, String address){
      this.name = name;
      this.age = age;
      this.address = address;
      totalPerson++;
   }

   // method
   public void displayInfo(){
      System.out.println("My name : " + name);
      System.out.println("My age : " + age);
      System.out.println("My address : " + address);
   }

   // method static untuk menampilkan total objek setiap kali objek person bertambah
   public static void displayTotalPerson(){
      System.out.println("Total person : "+ totalPerson);
   }

   // kapan harus menggunakan access modifier ?
    /* public : biasa digunakan untuk class atau method2 yang biasanya bisa dipanggil dimana saja
    * private : biasanya dipakai untuk mendeklarasikan variabel secara private dalam 1 class
    * final : ketika kita mau mendefinisikan nilai default yang konstant untuk suatu variabel */
}

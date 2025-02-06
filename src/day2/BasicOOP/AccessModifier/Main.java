package day2.BasicOOP.AccessModifier;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Dimas", 21, "jakarta");
        Person person2 = new Person("Fakri", 22, "Periuk");
        Person person3 = new Person("Alwi", 22, "Bekasi");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        Person.displayTotalPerson();

        // Akses datanya
        System.out.println("Public Access ; " + person1.name);
//        System.out.println("Private Access ; " + person1.age); // error karna tidak bisa diakses karna private
        System.out.println("Protected Access ; " + person1.address);
        System.out.println("Final Access ; " + person1.NATIONALITY);

    }
}

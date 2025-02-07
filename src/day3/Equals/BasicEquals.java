package day3.Equals;

class Car{
    String model;
    int year;

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }
}

/* EQUALS : method untuk membandingkan 2 objek apakah mereka punya atribut dan isi yang sama
* ini sama kaya operator == di javascript */

public class BasicEquals {
    public static void main(String[] args) {
        Car car1 = new Car("Hyundai Ionic 5", 2023); // buat objek car1
        Car car2 = new Car("Toyota Supra X", 2025); // buat objek car2
        Car car3 = car1; // mereferensikan (akses alamat) objek ke objek yang sudah ada


        // method equals default dari object
        System.out.println(car1.equals(car2)); // false
        System.out.println(car1.equals(car3)); // true

        System.out.println(car1 == car2); // false
        System.out.println(car1 == car3);// true

        //implementasi dengan logic
        if (car1.equals(car3)){
            System.out.println("mobilnya sama");
        } else {
            System.out.println("mobilnya beda");

        }
    }
}

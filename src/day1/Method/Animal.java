package day1.Method;

//Method ovveride : method yang bisa di overwrite
//class parent
public class Animal {
    public static String sound(){return "kiw kiw";}
}

//class children yang mewarisi sifat/method2 parent
class Cat extends Animal {
    public static String sound(){return "Miaw miaw";}
}

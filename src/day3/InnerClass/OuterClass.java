package day3.InnerClass;

/* INNER CLASS : class dalam class, inner class bisa mengakses atribut dan method milik outer class
* implementasi inner class bisa dipakai ketika kita mau membuat struktur data objek didalam objek
* atau untuk grouping antara atribut dan fungsionalitas*/

public class OuterClass {
    private String outerVar = "10";


    public class InnerClass{
        public void display(){
            System.out.println("outer var : " + outerVar);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}

/* VISUAL JS
  Const outer = {
     outerVar : "10",
     InnerClass : {
                    inner = outerVar;
                  }
               }

*  */
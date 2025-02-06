package day2.BasicOOP.AccessModifier.AbstrakClass;
/* ABSTRAK CLASS : class yang tidak bisa dibuat instance secara langsung
* atau gabisa dibuat object secara langsung, cuma bisa dipakai untuk class, subclass dan turunananya*/
public abstract class Hewan {
    public String nama;
    public int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    /* Abstract method : method yang harus diimplementasikan oleh class turunannya
    * kalau tidak bisa di implementasi, maka class turunannya juga akan jadi abstract
    * dan gabisa dibuat object secara langsung*/

    public abstract void makan();

    //method biasa
    public void tidur(){
        System.out.println(nama + "lagi turu!");
    }

    // getter/setter(getter digunakan untuk ambil data, setter digunakan untuk mengeset data)
    public String getNama() {
        return nama;
    }

    public int   getUmur(){
        return umur;
    }
}

package day2.BasicOOP.AccessModifier.AbstrakClass;

public class Kucing extends Hewan{
    public Kucing (String nama, int umur){
        // Super digunakan untuk memanggil constructor dari class parent
        super(nama, umur);
    }

    @Override
    public void makan(){
        System.out.println(nama + "Lagi makan whisky!");
    }
}

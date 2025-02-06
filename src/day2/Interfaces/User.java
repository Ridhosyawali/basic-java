package day2.Interfaces;

// Interface : Kumpulan method yang harus dipake oleh class yang mengimplementasikannya

public interface User {
    // method biasa yang wajib dipakai oleh class yang mengimplementasikannya
    String getUsername();
    String getPassword();

    void addUser(String username, String password);
    int getAllUser();

    // Default method = method ini ga perlu di override(opsional) / bisa langsung dipanggil
    default void getCompany(){
        System.out.println("company : PT Aigen Global Teknologi");
    }

    // Static method = method yang bisa dipanggil langsung tanpa memerlukan class (method ini gabisa di override)
    static void setName(String name){
        System.out.println("nama : "+name);
    }
}

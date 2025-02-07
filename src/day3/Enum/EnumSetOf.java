package day3.Enum;

import java.util.EnumSet;
import java.util.Set;

/*ENUM JUGA BISA DISIMPAN KE DALAM SET*/
public class EnumSetOf {
    enum Menu{
        INDOMIE,PECEL_AYAM,ES_TEH,KOPI
    }

    public static void main(String[] args) {
        // nambahin menu ke dalam set
        Set<Menu> availableMenu = EnumSet.of(Menu.INDOMIE,Menu.PECEL_AYAM);

        // nambahin menu lain
        availableMenu.add(Menu.ES_TEH);

        // cek menu ada kaga
        if(availableMenu.contains(Menu.ES_TEH)){
            System.out.println("Es teh is available");
        }

        System.out.println("Todays menu : " + availableMenu);
    }
}

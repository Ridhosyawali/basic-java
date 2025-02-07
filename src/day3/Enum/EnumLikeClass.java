package day3.Enum;

/* ENUM bisa juga seperti Class  : punya variabel constructor dan method seperti class
* fungsinya supaya enum lebih fleksibel */

public enum EnumLikeClass {
    SUNDAY("Weekend"), MONDAY("Weekday");

    private String type;
    EnumLikeClass(String type){this.type = type;}

    public String getType(){return type;}
}

package day3.Equals;

public class User {
    private String username;
    private String email;

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    // method juga bisa di override untuk menentukan apakah objek tersebut sama atau tidak
    public boolean equals(Object obj){
        if (this == obj)return true; // pertama cek jika objeknya sama
        // cek apakah objeknya null atau bukan instance/class
        if(obj == null || getClass() != obj.getClass())return false;
        // bandingkan username dan email
        User user = (User) obj;
        return username.equals(user.username) && email.equals(user.email);
    }

    public String getData(){return "username : " + username + ", email : " + email;}
    public String getUsername(){return username;}
}

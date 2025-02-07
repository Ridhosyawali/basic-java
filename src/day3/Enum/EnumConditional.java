package day3.Enum;

public class EnumConditional{
   enum userStatus{
        ACTIVE, NONACTIVE, BANNED
    }

    static class User{
        private String nama;
        private userStatus status;

        public User(String nama, userStatus status){
            this.nama = nama;
            this.status = status;
        }

        public void setStatus(userStatus status){this.status=status;}
        public void checkStatus(){
            System.out.println("User " + nama + " is " + status);
        }
    }

    public static void main(String[] args) {
        userStatus user1 = userStatus.ACTIVE;

        if (user1 == userStatus.ACTIVE){
            System.out.println("User is active");
        }else {
            System.out.println("User is not active");
        }

        User ridho = new User("ridho", userStatus.ACTIVE);
        System.out.println("====CHECK STATUS====");
        ridho.checkStatus();

        System.out.println("====UPDATE STATUS====");
        ridho.setStatus(userStatus.BANNED);
        ridho.checkStatus();
    }
}

package day2.AnonymousClass;

/* ANONYMOUS CLASS : class sementara yang mewarisi class parentnya
* ini cara singkat/ sekali pakai untuk ngasih fungsi tambahan pada class dan interface yang sudah ada
* daripada bikin class baru yang terpisah */
public class Main {
    public static void main(String[] args) {
        User user = new User("danang", 20);

        UserInterface userActions = new UserInterface() {
            @Override
                public void displayUser(){
                System.out.println("user name : " + user.getName());
                System.out.println("user age : " + user.getAge());
            }
            @Override
            public void updateUser(){
                System.out.println("user updated!");
            }
        };
        userActions.displayUser();
        userActions.updateUser();
    }
}

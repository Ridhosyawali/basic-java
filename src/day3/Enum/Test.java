package day3.Enum;

/*ENUM TEST
* Buat class untuk mengelola hak akses user menggunakan role spesifikasi berikut :
* 1. buat enum userAccess dengan nilai : CREATE, EDIT, DELETE, DISPLAY_DASHBOARD, dan USER_MANAGEMENT
* 2. buat enum ROLE yang masing-masing role punya akses berikut :
*    - ADMIN punya semua akses
*    - EDITOR punya akses CREATE, EDIT dan Display_Dashboard
*    - GUEST cuma punya akses Display_Dashboard
* 3. buat kelas User dengan atribut name dan role
* 4. buat method untuk validasi dan menampilkan apakah user punya hak akses tertentu
* 5. buat main method untuk eksekusinya didalam satu file ini*/

import java.util.EnumSet;

public class Test {
    // nomer 1
    private enum userAccess{
        CREATE,
        EDIT,
        DELETE,
        DISPLAY_DASHBOARD,
        USER_MANAGEMENT}

    // nomer 2
    private enum Role {
        ADMIN(EnumSet.of(userAccess.CREATE, userAccess.EDIT, userAccess.DELETE, userAccess.DISPLAY_DASHBOARD, userAccess.USER_MANAGEMENT)),
        EDITOR(EnumSet.of(userAccess.CREATE, userAccess.EDIT, userAccess.DISPLAY_DASHBOARD)),
        GUEST(EnumSet.of(userAccess.DISPLAY_DASHBOARD));

        EnumSet<userAccess> access;

        Role(EnumSet<userAccess> access) {
            this.access = access;
        }
    }


    // nomer 3
    private static class User {
        private String name;
        private Role role;

        public User(String userName, Role userRole) {
            this.name = userName;
            this.role = userRole;
        }

        // nomer 4
        public void validateAccess(userAccess access) {
            if (role.access.contains(access)) {
                System.out.println("User " + name + " is "+ role +" has access to " + access);
                System.out.println(role+" "+ name + " : "+role.access);
                System.out.println();
            } else {
                System.out.println("User " + name + " does not have access to " + access);
                System.out.println(role+" "+ name + " : "+role.access);
            }
        }
    }


    // nomer 5
    public static void main(String[] args) {
        System.out.println("===== TEST ENUM =====");
        Role admin = Role.ADMIN;
        Role guest = Role.GUEST;
        Role editor = Role.EDITOR;

        User user1 = new User("ridho", admin);
        user1.validateAccess(userAccess.CREATE);

        User user2 = new User("zain", editor);
        user2.validateAccess(userAccess.CREATE);

        User user3 = new User("darma", guest);
        user3.validateAccess(userAccess.CREATE);
    }
}

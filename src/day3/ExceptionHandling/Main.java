package day3.ExceptionHandling;

import java.util.Objects;

/*EXCEPTION HANDLING : error handling ketika ada operasi yang gagal
* macam maca error handling:
* - IllegalArgumentException : error handling untuk argumen/parameter yang salah
* - Array ArrayIndexOutOfBoundsException : error handling ketika index array tidak valid
* - ArithmeticException : error handling ketika operasi perhitungan/aritmatika
* - ResourceNotFoundException : error handling ketika file tidak ditemukan atau (404 Not found)
* - BadRequestException : error handling ketika request tidak valid atau (400 Bad request)
* - UnauthorizedException : error handling ketika user tidak memiliki akses atau (401 Unauthorized)
* - ForbiddenException : error handling ketika user tidak memiliki akses atau (403 Forbidden)
* - InternalServerErrorException : error handling ketika server mengalami kesalahan atau (500 Internal Server Error)
* - Error : error handling ketika ada kesalahan yang tidak terduga
* */

public class Main {
    static void checkRole(String Role){
        // equals untuk mengecek data yang dikirim dari parameter
        if(Objects.equals(Role, "admin")){
            //respon error manual
            throw new  IllegalArgumentException("Access Denied! only admin can access!");
        }else {
            System.out.println("Access Granted!");
        }
    }

    public static void main(String[] args) {
        try {
            // panggil method
            checkRole("admin");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

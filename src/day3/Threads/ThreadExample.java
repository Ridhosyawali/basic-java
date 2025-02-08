package day3.Threads;

/* THREAD(asyncronous) : untuk menjalankan tugas secara bersamaan di latar belakang tanpa mengganggu
* proses utamanya. */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Thread.currentThread().getName() : untuk mengambil nama thread yang sedang berjalan
            System.out.println(Thread.currentThread().getName() + " value : " + i);

            try {
                // Menghentikan thread selama 1 detik sebelum looping selanjutnya
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                System.out.println("Error : Interupted Thread");
                break;
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start(); //thread pertama
        thread1.interrupt(); // menghentikan thread
        thread2.start(); //memulai thread kedua setelah yang pertama dihentikan
        thread3.start(); //thread ketiga
    }
}

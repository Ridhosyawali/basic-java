package day3.InnerClass;

public class BankAccout {
    private double saldo;

    public BankAccout(double saldo){this.saldo=saldo;}

    public class Transaction{
        private double total;

        public Transaction(double total){this.total=total;}

        public void HitungTotal(){
            saldo += total;
            System.out.println("Transaksi sukses, Saldo saat ini : " + saldo);
        }
    }

    public static void main(String[] args) {
        // masukan saldo dengan nilai awal 1000
        BankAccout accout = new BankAccout(1000);
        // bikin objek transaksi dari innerclass dan lakukan transaksi 500
        BankAccout.Transaction transaction = accout.new Transaction(500);
        // panggil method hitung total
        transaction.HitungTotal();
    }
}

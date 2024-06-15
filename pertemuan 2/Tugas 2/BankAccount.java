public class BankAccount{
    private float balance;

    public BankAccount(float balance){
        this.balance = balance;
    }

    public void deposit(float jumlah){
        balance += jumlah;
    }

    public void withdraw(float jumlah){
        if(jumlah>balance){
            System.out.println("Saldo tidak mencukupi!");
        }else{
            balance -= jumlah;
        }
    }

    public float getBalance() {
        return balance;
    }
}
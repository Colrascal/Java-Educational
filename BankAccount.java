public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(12345, 400, "ANONIM", "BİLİNMİYOR", "+90123456789");
        System.out.println("BOŞ CONSTRUCTOR ÇAĞRILDI");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber){
        System.out.println("DOLU CONSTRUCTOR ÇAĞRILDI");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int amount){
        this.balance = this.balance  + amount;
        System.out.println(amount + " KADAR EKLEME YAPTINIZ. YENİ BAKİYE = " + this.balance + "TL");
    }

    public void withdrawFunds(int amount){
        if(this.balance < amount) {
            System.out.println("YETERSİZ BAKİYE. " + this.balance + "TL HESABINIZDAKİ PARANIZDIR.");
        }
        else {
            this.balance = this.balance - amount;
            System.out.println(amount + " KADAR ÇEKİM YAPTINIZ. YENİ BAKİYE = " + this.balance);
        }
    }
}

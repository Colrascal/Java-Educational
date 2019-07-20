public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("UNKNOWN USER", 0.0, "UNKNOWN EMAIL ADDRESS");
        System.out.println("BOŞ CONSTRUCTOR");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "UNKNOWN EMAIL ADDRESS");
        System.out.println("İKİ ELEMANLI CONSTRUCTOR");
    }

    public VipCustomer(String name, double creditLimit, String email){
        System.out.println("ÜÇ ELEMANLI CONSTRUCTOR");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

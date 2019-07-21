public class Main {
    public static void main(String[] args){
        System.out.println("EMİRBANK'A HOŞGELDİNİZ.");
//        BankAccount emir = new BankAccount();

//        emir.setAccountNumber(456897854);
//        emir.setBalance(450000);
//        emir.setCustomerName("AHMET KARA");
//        emir.setEmail("ek@gmail.com");
//        emir.setPhoneNumber("+123456789");


//        System.out.println("HOŞGELDİNİZ " + emir.getCustomerName());
//        System.out.println("HESAP BİLGİLERİNİZ: " + emir.getAccountNumber() +
//                " BAKİYENİZ: " + emir.getBalance() + "TL" + " EMAİL: " + emir.getEmail() + " TELEFON: " + emir.getPhoneNumber());
//        emir.depositFunds(50000);
//        emir.withdrawFunds(600000);

        VipCustomer vip = new VipCustomer("AHMET KARA", 250.50, "test@mail.com");
        System.out.println("KULLANICI ADI: " + vip.getName() + " KREDİ LİMİTİ: " + vip.getCreditLimit()
                + " KULLANICI EMAIL ADRESİ: " + vip.getEmail());
    }
}

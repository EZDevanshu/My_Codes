// Create a class named Bank_Account with data memebers accountNo, userName, email,
// accountType and accountBalance, Also create methods getAccountDetails() and
// displayAccountDetails(). 
class Bank_Account {
    int accountNumber;
    String userName;
    String email;
    String accountType;
    int accountBalance;

    public Bank_Account(int accountNumber, String userName, String email, String accountType, int accountBalance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void getAccountDetails()
    {
          System.out.println("your Detail sucessful fetched");
    }

    public void displayAccountDetails()
    {
        System.out.println("---------------------------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("---------------------------");
    }
}

public class A3 {
    public static void main(String[] args)
     {
        Bank_Account b1 = new Bank_Account(12348, "arjun8", "arjunbala@211", "saving", 12025000);
        Bank_Account b2 = new Bank_Account(12345, "arjun5", "arjunbala@2112", "bisness4", 12058200);

        // Bank_Account b3 = new Bank_Account(12346, "arjun6", "arjunbala@2113", "saving", 12052000);
        // Bank_Account b4 = new Bank_Account(12347, "arjun7", "arjunbala@2114", "bisness2", 1299000);

         b1.displayAccountDetails();
         b2.displayAccountDetails();
    }
}
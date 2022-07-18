package BankAccount.com.example.BankAccount;

public class BankAccount {

    public static void main(String[] args) {

        Withdraw payment = new Withdraw();
         // payment.wplac(5000);


          if (payment.wyplac(1100))
        {
            System.out.println("wypłacono");
        }
        else
            System.out.println("za mało na koncie");
        System.out.println(payment.getBalance());

        }

    }


    class Withdraw
    {
        
        private  int balance;

        public Withdraw()

            {
                balance = 1000;
            }

            int getBalance()
          {
              return balance;
          }

         boolean setBalance(int ile)
          {
              this.balance = balance;
              return true;

          }

          boolean wyplac( int ile)

          {

              if (balance < ile)
                  return false;

              else
                  setBalance(balance - ile);
              return true;
          }

          boolean wplac( int ile)
          {
              setBalance( balance + ile);
              return true;

          }

        private void getBalance(int ile) {
        }


    }

                



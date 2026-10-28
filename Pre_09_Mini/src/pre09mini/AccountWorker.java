package pre09mini;
public class AccountWorker implements Runnable {private final Account account;private final int times;private final long amount;public AccountWorker(Account a,int t,long n){account=a;times=t;amount=n;}public void run(){for(int i=0;i<times;i++)account.deposit(amount);System.out.println(Thread.currentThread().getName()+" finished");}}

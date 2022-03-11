import java.util.Scanner;
public class prac3_1 {
    public static void main(String[] args) {
        Bank a = new Bank();
        a.creat_Acc();
        a.Deposit();
        a.Withdraw();
        a.BalanceInquiry();
        Bank b = new Bank();
        b.creat_Acc();
        b.Deposit();
        b.Withdraw();
        b.BalanceInquiry();
        
    }
}
class Bank{
    String Dipositor_name,acc_type;
    private int Balance=0;
    static int acc_num=0;
    Scanner scn = new Scanner(System.in);
    void creat_Acc(){
        ++acc_num;
        System.out.print("Eneter Name : ");
        Dipositor_name=scn.next();
    }
    void Deposit(){
        System.out.print("Eneter Deposit Amount : ");
        int dep = scn.nextInt();
        Balance+=dep;
    }
    void Withdraw(){
        System.out.print("Eneter Withdraw Amount : ");
        int dep = scn.nextInt();
        if(Balance<dep){
            System.out.println("You have not suffisted Amount of Balance");
            return;
        }
        Balance-=dep;
    }
    void BalanceInquiry(){
        System.out.print("Account Number : "+acc_num);
        System.out.println("Account Name : "+Dipositor_name);
        System.out.println("Account Balance : "+Balance);
    }

}
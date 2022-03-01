import java.util.Scanner;
class prac2_2{
    public static void main(String args[]){
        Scanner scn =  new Scanner (System.in);
        System.out.print("Enter terms of Fibonacci Serires : ");
        int num=scn.nextInt();
        int ans1=0,ans2=1,ans;
        for(int i=0;i<num;i++){
            System.out.println(ans1);
            ans=ans1+ans2;
            ans1=ans2;
            ans2=ans;
        }
        
    }
}
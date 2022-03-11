import java.util.Scanner;

public class prac2_7 {
    public static void main(String []s){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Text : ");
        String text = scn.next();
        int k = scn.nextInt();
        cipher c = new cipher(text,k);
        System.out.println("Encription is "+c.Encryption());
        System.out.println("Decription is "+c.Decription());
    }
}
class cipher{
    String plain_text;
    int key;
    String enc="";
    cipher(String plain_text,int key){
        this.plain_text=plain_text;
        this.key=key;
    }
    String Encryption(){
        char s;
        for (int i = 0; i < plain_text.length(); i++) {
            s=plain_text.charAt(i);
            s=(char)(s+key);
                this.enc=this.enc+s;
        }
        return this.enc;
    }
    String Decription(){
        String dec="";
        char s;
        for (int i = 0; i < enc.length(); i++) {
            s=enc.charAt(i);
            s=(char)(s-key);
                dec=dec+s;
        }
        return dec;
    }
}

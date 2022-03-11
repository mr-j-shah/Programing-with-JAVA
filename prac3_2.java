public class prac3_2 {
    public static void main(String[] args) {
        Time t = new Time(2, 30, 40);
        Time t2 = new Time(2, 30, 30);
        Time Total;
        Total=t.sum(t,t2);
        Total.printTime();
    }
}
class Time{
    int hour=0,min=0,sec=0;
    Time(int hour,int min,int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    Time(){

    }
    Time sum(Time t1,Time T2){
        Time t = new Time();
        if ((t1.sec+T2.sec)>60) {
            t.sec=(t1.sec+T2.sec)-60;
            t.min=t1.min+T2.min+1;
            if(t.min>60){
                t.min-=60;
                t.hour=t1.hour+T2.hour+1;
            }
            else{
                t.hour=t1.hour+T2.hour;
            }
        }
        else if((t1.min+T2.min)>60){
            t.sec=(t1.sec+T2.sec);
            t.min=(t1.min+T2.min)-60;
            t.hour=t1.hour+T2.hour+1;
        }
        else{
            t.hour=t1.hour+T2.hour;
            t.min=t1.min+T2.min;
            t.sec=t1.sec+T2.sec;
        }
        return t;
    }
    void printTime(){
        System.out.println("Time is "+hour+":"+min+":"+sec);
    }
}
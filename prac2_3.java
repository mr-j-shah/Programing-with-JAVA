import java.util.Scanner;
class prac2_3 {
    public static void main(String args[]) {
        int[] arr = { 1, 4, 5, 2, 3 };
        array a1 = new array(arr);
        a1.Reverse_an_array();
        System.out.print("\nMaximum of the Array is " + a1.Maximum_of_array());
        System.out.print("\nAverage of the Array is " + a1.Average_of_array());
        a1.display();
        a1.sort();
        a1.display();
        System.out.print("\nSearch of 2 is " + a1.search(2));
    }
}

class array {
    int[] data;
    Scanner scn = new Scanner(System.in);

    array() {
        data = new int[10];
        System.out.print("Enter data of array in Size of 10 : ");
        for (int i = 0; i < 10; i++) {
            data[i] = scn.nextInt();
        }
    }
    array(int size) {
        data = new int[size];
        System.out.print("Enter data of array in Size of " + size + " : ");
        for (int i = 0; i < size; i++) {
            data[i] = scn.nextInt();
        }
    }
    array(int[] data) {
        this.data = data;
    }
    void display() {
        System.out.print("\nData in the Array is ");
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
    void Reverse_an_array() {
        System.out.print("Reverse of the Array is ");
        for (int i = data.length; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
    int Maximum_of_array() {
        int max = data[0];
        for (int i : data) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    int Average_of_array() {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return (sum / data.length);
    }
    int size() {
        return data.length;
    }
    int search(int key) {
        int first = 0,last=data.length,mid = (first + last) / 2;
        while (first <= last) {
            if (data[mid] < key) {
                first = mid + 1;
            } 
            else if (data[mid] == key) {
                return (mid+1);
            } 
            else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return 0;
    }
    void sort(){
        int min,temp;
        for (int i = 0; i < data.length; i++) {
            min=i;
            for (int j = i+1; j < data.length; j++) {
                if(data[j]<data[min]){
                    temp=data[j];
                    data[j]=data[min];
                    data[min]=temp;
                }
            }
        }
    }
}
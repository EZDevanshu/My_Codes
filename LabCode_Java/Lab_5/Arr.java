import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arr : ");
        int size = sc.nextInt();

        int[] Arr = new int[size];
        int indexff = -1;

        System.out.println("Enter Elements : ");

        for (int i = 0; i < size; i++) {

            Arr[i] = sc.nextInt();

        }
        System.out.println("Enter the Index of Element : ");
        int index = sc.nextInt();

        int[] newArr = new int[size];
        int position = 0;

        for (int i = index; i < size; i++) {
            newArr[position++] = Arr[i];
        }

        for (int i = 0; i < index; i++) {
            newArr[position++] = Arr[i];
        }

        System.out.println("reverse arr is : ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the element which you find Index ");
        int element = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (element == newArr[i]) {
                indexff = i;
            }
        }
        if (indexff != -1){
            System.out.println("index of Element is :  "+ indexff);
        }
        else {
            System.out.println("Invalid Element ");
        }
        sc.close();
    }
}

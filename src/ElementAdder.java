import java.util.Scanner;

public class ElementAdder {
    public static void main(String[] args) {
        int [] a;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        size = scanner.nextInt();
        a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        int X;
        System.out.println("Enter new element: ");
        X = scanner.nextInt();
        int index;
        System.out.println("Position of element: ");
        index = scanner.nextInt();
        if ((index <= 1) || (index >= a.length - 1)) {
            System.out.println("Can not add this element!");

        }
        int [] b;
        b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i < index) {
                b[i] = a[i];
            } else if (i == index) {
                b[i] = X;
            } else {
                b[i] = a[i-1];
            }
        }
        System.out.println("New value in list: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + "\t");
        }
    }
}

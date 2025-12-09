package Project;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void bubbleSort(int[] data) {
        int i, j, temp;
        boolean swapped;
        int n = data.length;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        printArray(data);
    }

    public static void quickSort(int[] data, int low, int high) {
        // Quick Sort Algorithm
        System.out.println("Quick Sort not implemented yet.");
    }

    public static void printArray(int[] data) {
        if (data == null) return;
        System.out.print("[ ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + (i < data.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = null;

        System.out.println("--- Bubble Sort & Quick Sort ---");

        // 1. รับค่า Input
        while (true) {
            System.out.print("Enter the elements example '5 1 9': ");
            String inputLine = scanner.nextLine();
            try {
                if (inputLine.trim().isEmpty()) continue;
                String[] parts = inputLine.trim().split("\\s+");
                data = new int[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    data[i] = Integer.parseInt(parts[i]);
                }
                break; 
            } catch (Exception e) {
                System.out.println("Please enter numbers only");
            }
        }
        System.out.print("Initial Data: ");
        printArray(data);

        // 2. เมนูเลือก
        while (true) {
            System.out.println("\n1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            // จำลองข้อมูล
            int[] temp = Arrays.copyOf(data, data.length);

            if (choice.equals("1")) {
                bubbleSort(temp);
            } else if (choice.equals("2")) {
                quickSort(temp, 0, temp.length - 1);
            } else if (choice.equals("0")) {
                break;
            }
        }
        scanner.close();
    }
}
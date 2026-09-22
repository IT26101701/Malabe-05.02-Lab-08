public class IT26101701Lab8Q2 {
	
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println();
        System.out.println("A Array Contents:");
        printArray(A);

        System.out.println();
        System.out.println("B Array Contents:");
        printArray(B);

        System.out.println();
        System.out.println("C Array Contents (A + B):");
        printArray(C);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
		
        System.out.println();
    }
}
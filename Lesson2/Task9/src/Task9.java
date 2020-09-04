public class Task9 {

    public static void main(String[] args) {
        int[] arr = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int tmp;

        // Идем по массиву до середины, меняя местами значения элементов n и length - n
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }

        for (int a:arr) {
            System.out.print(a + " ");
        }
    }
}

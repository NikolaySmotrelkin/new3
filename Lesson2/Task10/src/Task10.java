public class Task10 {

    public static void main(String[] args) {
        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};

        // Бежим по массиву в поисках нуля
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // Как нашли элемент со значением 0, то ищем в массиве с права на лево свободное место (не нулевое)
                // и меняем местами эти значения
                for (int j = arr.length - 1; j >= 0; j--) {
                    if ((arr[j] != 0) && (i <= j)) {
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }

        // Выодим результаты
        for (int a:arr) {
            System.out.print(a + " ");
        }
    }
}

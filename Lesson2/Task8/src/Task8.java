public class Task8 {

    public static void main(String[] args) {
        int[] arr = {1,-10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        int maxValue = arr[0];    // максимальное значение
        int positiveSumm = 0;     // Сумма положительных
        int negativeSumm = 0;     // Сумма отрицательных
        int evenNegativeSumm = 0; // Сумма четных отрицательных
        int positiveCount = 0;    // Количество положительных
        int negativeCount = 0;    // Количество отрицательных
        double negativeAvg; // Среднее арифметическое отрицательных элементов

        for (int i = 0; i < arr.length; i++) {

            // Если текущий элемент массива больше максимального, то кладем его в maxValue
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

            // Если число положительное, то добавлем его к positiveSumm и увеличиваем счетчик positiveCount
            if (arr[i] > 0) {
                positiveSumm += arr[i];
                positiveCount++;
            }

            // Если число отрицательное, то увеличиваем счетчик negativeCount и сумму negativeSumm
            if (arr[i] < 0) {
                negativeSumm += arr[i];
                negativeCount++;
            }

            // Если число отрицательное и четное, то прибавляем его к evenNegativeSumm
            if ((arr[i] < 0) && (arr[i] % 2 == 0)) {
                evenNegativeSumm += arr[i];
            }
        }

        negativeAvg = (double)negativeSumm / negativeCount;

        System.out.println("Максимальное значение: " + maxValue);
        System.out.println("Сумма положительных элементов: " + positiveSumm);
        System.out.println("Сумма четных отрицательных элементов: " + evenNegativeSumm);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Среднее арифметическое отрицательных элементов: " + negativeAvg);

    }
}

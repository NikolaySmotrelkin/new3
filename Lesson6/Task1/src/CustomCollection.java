public class CustomCollection<T> {
    // Массив элементов коллекции
    private T[] elements;
    // Количество элементов коллекции.
    private int count;
    // Величина приращения коллекци, в случае ее полного заполенния.
    private final int increment;
    // Количество приращений коллекции
    private int incrementCount;

    public CustomCollection(int increment) {
        this.count = 0;
        this.increment = increment <= 0 ? 1 : increment;
        this.incrementCount = 1;
        this.elements = (T[]) new Object[increment];
    }

    @Override
    public String toString() {
        // Вывод элементов массива в строку.
        String str = "[";
        for (int i = 0; i < count; i++) {
            if (elements[i] != null) {
                str += elements[i].toString() + ";";
            }
        }
        str += "]";
        return str;
    }

    private void checkRange(int index) {
        // Проверка на выход индекса за пределы коллекции.
        if ((index > count - 1) || (index < 0)) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы коллекции");
        }
    }

    public T get(int index) {
        checkRange(index);
        return elements[index];
    }

    public void add (T item) {
        count++;
        // Если количество элементов массива достигло предельного значения, то расширяем массив на велчичину increment.
        if (count > (increment * incrementCount)) {
            incrementCount++;
            // Создаем новый временный массив расширенный на increment элементов
            T[] tmp = (T[]) new Object[elements.length + increment];
            // Переносим старые элементы в новый массив.
            // Использовать copyOf не хочу, поскольку все реализую сам.
            for (int i = 0; i < elements.length; i++) {
                tmp[i] = elements[i];
            }
            // Добавляем новый элемент в новый массив
            tmp[count - 1] = item;
            // Переходим на работу с новым массивом.
            elements = tmp;
        } else {
          elements[count - 1] = item;
        }
    }

    public int size() {
        return count;
    }

    public void clear() {
        // Создаем массив с increment пулом пустых элементов
        elements = (T[]) new Object[increment];
        incrementCount = 1;
        count = 0;
    }

    public void remove(int index) {
        // Проверяем существование указанного индекса
        checkRange(index);
        // Сдвигаем влево на одну позицию все элементы массива, начиная с index + 1
        for (int i = index; i < count; i++) {
            if (i == count - 1) {
                elements[i] = null;
            } else {
                elements[i] = elements[i + 1];
            }
        }
        // Декрементируем счетчик элементов массива.
        count--;
    }

    public void remove(T item) {
        // Находим равный элемент в массиве и удаляем его по индексу.
        for (int i = 0; i < count; i++) {
            if ((elements[i] != null) && (elements[i].equals(item))) {
                remove(i);
                break;
            }
        }
    }
}

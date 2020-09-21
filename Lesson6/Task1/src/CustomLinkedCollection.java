public class CustomLinkedCollection<T> {

    // Класс звена массива (с двунаправленной ссылкой)
    private class Node {
        // Ссылка на следующее звено массива.
        private Node nextNode;
        // Ссылка на предыдущее звено массива.
        private Node prevNode;
        // Ссылка на объект типа T
        private final T object;

        public Node(T object) {
            this.object = object;
            nextNode = null;
            prevNode = null;
        }
    }

    // Количество элементов коллекции.
    private int count;
    // Ссылка на первый элемент коллекции.
    private Node firstNode;
    // Ссылка на последний элемент коллекции.
    private Node lastNode;

    public CustomLinkedCollection() {
        count = 0;
        firstNode = null;
        lastNode = null;
    }

    public void add (T item) {
        // Инкрементим счетчик количества объектов
        count++;
        // Для первого добавленного элемента lastNode = firstNode
        if (firstNode == null) {
            firstNode = new Node(item);
            lastNode = firstNode;
        } else {
            Node tmp = new Node(item);
            tmp.prevNode = lastNode;
            lastNode.nextNode = tmp;
            lastNode = tmp;
        }
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        String str;
        if (count == 0) {
            str = "[]";
        } else {
            str = "[";
            Node currentNode = firstNode;
            // Проходим по всей цепоччке элементов
            for (; ; ) {
                if (currentNode.object != null) {
                    str += currentNode.object.toString() + ";";
                }
                currentNode = currentNode.nextNode;
                // Выходим когда достигли последнего элемента
                if (currentNode == null) {
                    break;
                }
            }
            str += "]";
        }
        return str;
    }

    private void checkRange(int index) {
        // Проверка на выход индекса за пределы списка.
        if ((index > count - 1) || (index < 0)) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы коллекции");
        }
    }

    public T get(int index) {
        checkRange(index);

        int indx = 0;
        Node currentNode = firstNode;
        // Идем по списку
        for (; ; ) {
            if (indx == index) {
                // Получаем объект при достижении нужного индекса и выходим.
                return currentNode.object;
            } else {
                indx++;
                currentNode = currentNode.nextNode;
            }
        }
    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        count = 0;
    }

    public void remove(int index) {
        // Проверяем существование указанного индекса
        checkRange(index);

        int indx = 0;
        Node currentNode = firstNode;
        // Идем по списку в поисках нужного индекса.
        for (; ; ) {
            if (indx == index) {
                // Исключаем элемент из цеопчки
                if (currentNode == firstNode) {
                    firstNode = currentNode.nextNode;
                    firstNode.prevNode = null;
                } else if (currentNode == lastNode) {
                   lastNode = currentNode.prevNode;
                   lastNode.nextNode = null;
                } else {
                    currentNode.prevNode.nextNode = currentNode.nextNode;
                    currentNode.nextNode.prevNode = currentNode.prevNode;
                }

                count--;
                break;
            } else {
                indx++;
                currentNode = currentNode.nextNode;
            }
        }
    }

    public void remove(T item) {
        // Если элементов нет, то выходим
        if (count == 0) {
            return;
        }
        Node currentNode = firstNode;
        // Идем по списку в поисках нужного объекта.
        for (; ; ) {
            // Если объект найден и равен item
            if ((currentNode.object != null) && (currentNode.object.equals(item))) {
                // Исключаем элемент из цеопчки
                if (currentNode == firstNode) {
                    firstNode = currentNode.nextNode;
                    firstNode.prevNode = null;
                } else if (currentNode == lastNode) {
                    lastNode = currentNode.prevNode;
                    lastNode.nextNode = null;
                } else {
                    currentNode.prevNode.nextNode = currentNode.nextNode;
                    currentNode.nextNode.prevNode = currentNode.prevNode;
                }

                count--;
                break;
            } else {
                // Переходим к следующему элементу.
                currentNode = currentNode.nextNode;
                // Выходим если прошли все элементы.
                if (currentNode == null) {
                    break;
                }
            }
        }
    }
}

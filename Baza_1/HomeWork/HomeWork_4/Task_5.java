package Baza_1.HomeWork.HomeWork_4;

public class Task_5 {
    public static void main(String[] args) {
        int[] arr = new int []{4,6,8,5,3,2,4,6,8,0,1,-2,-6,0,34};
        heapSort(arr,arr.length);

    }
    public static void buildTree(int[] tree, int sortLength, int i) {


        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < sortLength && tree[l] > tree[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < sortLength && tree[r] > tree[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i)
        {
            int swap = tree[i];
            tree[i] = tree[largest];
            tree[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            buildTree(tree, sortLength, largest);
        }


    }

    public static void heapSort(int[] sortArray, int sortLength) {

        // int n = sortArray.length;

        // Построение кучи (перегруппируем массив)
        for (int i = sortLength / 2 - 1; i >= 0; i--)
            buildTree(sortArray, sortLength, i);

        // Один за другим извлекаем элементы из кучи
        for (int i=sortLength-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            buildTree(sortArray,i,0);
        }

    }
}


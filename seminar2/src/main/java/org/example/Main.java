package org.example;

import java.util.Random;

public class Main {

    private static final Random rnd = new Random();

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,6,7,8,9};
//        ArrayUtils.printArray(arr);
        SortUtils.sort(arr);
        ArrayUtils.printArray(arr);

//        int[] testArr = new int[]{5,6,6,2,3,12,3,42,231,213,-23,-2,-35};
//        ArrayUtils.printArray(testArr);
//        SortUtils.quickSort(testArr);
//        ArrayUtils.printArray(testArr);
//        int sElem = 12;




    }

    static class ArrayUtils {
        /**
         * Подготовить массив случайных чисел
         *
         * @return
         */
        static int[] prepareArray() {
            int[] arr = new int[rnd.nextInt(15) + 5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(101) - 50;
            }
            return arr;
        }

        /**
         * Подготовить массив случайных чисел
         *
         * @param length кол-во элементов
         * @return
         */
        static int[] prepareArray(int length) {
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = rnd.nextInt(101) - 50;
            }
            return arr;
        }

        /**
         * Распечатать массив
         *
         * @param arr
         */
        static void printArray(int[] arr) {
            for (int e : arr) {
                System.out.printf("%d\t", e);
            }
            System.out.println();
        }
    }

    static class SortUtils {
        /**
         * Сортировка выбором
         *
         * @param arr
         */
        static void directSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                int save = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[save]) {
                        save = j;
                    }
                }
                if (save != i) {
                    int buf = arr[i];
                    arr[i] = arr[save];
                    arr[save] = buf;
                }
            }
        }

        static void quickSort(int[] arr) {
            quickSort(arr, 0, arr.length - 1);
        }

        private static void quickSort(int[] arr, int start, int end) {
            int left = start;
            int right = end;
            int middle = arr[(start + end) / 2];

            do {
                while (arr[left] < middle) {
                    left++;
                }

                while (arr[right] > middle) {
                    right--;
                }

                if (left <= right) {
                    if (left < right) {
                        int buf = arr[left];
                        arr[left] = arr[right];
                        arr[right] = buf;
                    }
                    left++;
                    right--;
                }
            }
            while (left <= right);
            if (left < end) {
                quickSort(arr, left, end);
            }
            if (start < right) {
                quickSort(arr, start, right);
            }
        }


        public static void sort(int[] array) {
            for (int i = array.length / 2 - 1; i >= 0; i--)
                heapify(array, array.length, i);
            for (int i = array.length - 1; i >= 0; i--) {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                heapify(array, i, 0);
            }
        }

        private static void heapify(int[] array, int heapSize, int rootIndex) {
            int largest = rootIndex;
            int leftChild = 2 * rootIndex + 1;
            int rightChild = 2 * rootIndex + 2;
            if (leftChild < heapSize && array[leftChild] > array[largest])
                largest = leftChild;
            if (rightChild < heapSize && array[rightChild] > array[largest])
                largest = rightChild;
            if (largest != rootIndex) {
                int temp = array[rootIndex];
                array[rootIndex] = array[largest];
                array[largest] = temp;
                heapify(array, heapSize, largest);
            }
        }



    }

    static class SearchUtils {

        static int binarySearch(int[] arr, int value) {
            return binarySearch(arr, value, 0, arr.length - 1);
        }

        static int binarySearch(int[] arr, int value, int left, int right) {
            if (right < left) {
                return -1;
            }
            int midd = (left + right) / 2;

            if (arr[midd] == value) {
                return midd;
            } else if (arr[midd] < value) {
                return binarySearch(arr, value, midd + 1, right);
            } else {
                return binarySearch(arr, value, left, midd - 1);
            }


        }
    }

}
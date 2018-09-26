package com.harrisonbrock;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = {20,-22,35,-15,7,65,1};

//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//        bubbleSort(numbers);
//        System.out.println("Sorted");
//        for (int number : numbers) {
//            System.out.println(number);
//        }

    }

    public static void bubbleSort(int[] array) {

        int lastIndex = array.length - 1;
        for (; lastIndex > 0; lastIndex--) {

            for (int index = 0; index < lastIndex; index++) {
                if (array[index] > array[index + 1]) {
                    swap(array, index, index+1);
                }
            }
        }
    }

    public static void swap(int[] array, int x, int y) {

        if (x == y) return;

        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 3, 2, 5, 7, 8};
        bubbleSort(array);

        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            for (int el: array) {
                writer.write(Integer.toString(el));
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


    }
        public static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // Меняем местами элементы
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
    }


}

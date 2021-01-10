
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array) {
        int smallestNum = array[0];
        for (int num: array) {
            if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return smallestNum;
    }
    
    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallestNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallestNum = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestNum) {
                smallestNum = table[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallestFrom);
        }
    }

}

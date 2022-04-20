package mod1;

public class simpleSorter {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};

        int[] sortedArray = new int[firstHalf.length + secondHalf.length];
        int first = 0;
        int second = 0;
        for (int i = 0; i < sortedArray.length; i++){
            
            if (firstHalf[first] > secondHalf[second] && second < secondHalf.length) {
                sortedArray[i] = secondHalf[second];
                second++;
            }
            if (firstHalf[first] < secondHalf[second] && first < secondHalf.length) {
                sortedArray[i] = firstHalf[first];
                first++;
            }
        }
        for (int j : sortedArray) {
            System.out.println(j);
        }
    }
}

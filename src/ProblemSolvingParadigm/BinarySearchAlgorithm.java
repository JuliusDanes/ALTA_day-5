package ProblemSolvingParadigm;

public class BinarySearchAlgorithm {

    public static int binarySearch(int[] data,int target){
        int arrLength = data.length;
        int leftPoint = 0;
        int rightPoint = arrLength - 1;

        for (var i = 0; i < arrLength; i++) {
            int middlePoint =(leftPoint + rightPoint) / 2;
            if (data[middlePoint] == target) {
                return middlePoint;
            } else if (data[middlePoint] < target) {
                leftPoint = middlePoint + 1;
            } else if (data[middlePoint] > target) {
                rightPoint = middlePoint + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] dataArray1 = new int[]{1, 1, 3, 5, 5, 6, 7};
        int[] dataArray2 = new int[]{1, 2, 3, 5, 6, 8, 10};
        System.out.println(binarySearch(dataArray1,3));
        System.out.println(binarySearch(dataArray2,5));
    }
}

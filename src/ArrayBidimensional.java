public class ArrayBidimensional {
    public static void main(String[] args) {

        int[][] myNumbers = {{1, 2, 3, 4}, {6, 7, 8, 9}};
        System.out.println(myNumbers[1][2]);
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}

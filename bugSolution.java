public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) { // Corrected loop condition
            array[i] = i * 2;
        }
        for (int value : array) {
            System.out.println(value);
        }
    }
}
public class UncommonBug {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <= array.length; i++) { // Bug: Off-by-one error
            array[i] = i * 2;
        }
        for (int value : array) {
            System.out.println(value);
        }
    }
}
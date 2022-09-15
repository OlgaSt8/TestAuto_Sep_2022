public class TwoSum {

    public static void main (String[] args) {

        int[] output = twoSum(new int[] {-12, 0, 2, 7, 11, 15},9);

        System.out.println("Output:");
        for (int j : output) {
            System.out.print(j+"\n");
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i1 = 0, i2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    i1 = i;
                    i2 = j;
                    break;
                }
            }
        }

        return new int[] {i1, i2};
    }
}
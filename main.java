public class main { new*
    public static void main(String[] args) {
        public static int[] filterEvenIndexOddValue(int[] array) {
            int count = 0;
            for (int i = 0; i < array.length; i += 2) {
                if (array[i] % 2 != 0) {
                    count++;
                }
            }

            int[] result = new int[count];
            int index = 0;
            for (int i = 0; i < array.length; i += 2) {
                if (array[i] % 2 != 0) {
                    result[index++] = array[i];
                }
            }

            return result;
        }
    }
}

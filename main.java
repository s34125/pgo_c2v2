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

        public static int findDominant(int[] array) {
            int n = array.length;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (array[j] == array[i]) {
                        count++;
                    }
                }
                if (count > n / 2) {
                    return array[i];
                }
            }
            return -1;
        }

        public static int[] rotateArray(int[] array, int positions) {
            int n = array.length;
            positions = positions % n; // Normalizacja pozycji, aby uniknąć pełnych rotacji
            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                result[(i + positions) % n] = array[i];
            }

            return result;
        }
    }
}

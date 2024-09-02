import java.util.Arrays;

public class RepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] list = {3, 7, 7, 8, 9, 10, 10, 4, 4, 4, 8, 2, 0, 0, 0, 1};
        int[] list2 = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                boolean isAlreadyAdded = false;
                boolean isRepeating = false;

                for (int j = 0; j < index; j++) {
                    if (list2[j] == list[i]) {
                        isAlreadyAdded = true;
                        break;
                    }
                }

                if (!isAlreadyAdded) {
                    for (int j = i + 1; j < list.length; j++) {
                        if (list[i] == list[j]) {
                            isRepeating = true;
                            break;
                        }
                    }

                    if (isRepeating) {
                        list2[index++] = list[i];
                    }
                }
            }
        }

        list2 = Arrays.copyOfRange(list2, 0, index);
        System.out.println("Tekrarlanan çift sayılar: " + Arrays.toString(list2));
    }
}
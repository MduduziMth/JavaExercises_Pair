package Com_MduCliveGift;
import java.util.Arrays;

public class CombineArray {
    public static void main(String[] args)
    {
        String array1[] = {"11","22","33","44"};
        String array2[] = {"1","2","3","4"};

        System.out.print(Arrays.toString(Combine(array1,array2)));
    }

    public static String[] Combine(String[] array1, String[] array2)
    {
        String[] newArray = new String[array1.length + array2.length];

        int i = 0;
        int a1 = 0;
        int a2 = 0;
        while (i < newArray.length) {

            if ((a1 < array1.length)) {
                newArray[i] = array1[a1];
                i++;
                a1++;
            }

            if ((a2 < array1.length)) {
                newArray[i] = array2[a2];
                i++;
                a2++;
            }
        }

        return newArray;

    }
}

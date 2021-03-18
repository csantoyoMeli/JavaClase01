package RadixSort;

import java.util.*;

public class Radixsort {

    public static void radixSort(int[] iArr) {
        // PROGRAMAR AQUÍ

        // get our String[] (step 1)
        String[] sArr = StringUtil.toStringArray(iArr);
        // Normalize our String[] (step 2)
        StringUtil.lNormalize(sArr, '0');
        // Sorting array
        int maxL = StringUtil.maxLength(sArr);
        // This cycle is to process every digit
        for (int a = 0; a < maxL; a++) {
            HashMap<String, ArrayList> hash = new HashMap<>();

            // Find all possible characters (step 3)
            // Is to know how many list we need and classify the values on hash map
            ArrayList<String> indexChar = new ArrayList<>();
            for (String s : sArr) {
                String[] characters = s.split("");
                String iChar = characters[(maxL - 1) - a];
                if (!indexChar.contains(iChar)) {
                    indexChar.add(iChar);
                }
            }
            // Sort list
            Collections.sort(indexChar);

            // Cycle to classify on digits groups using a hash map (step 4)
            for (String b : indexChar) {
                ArrayList<String> arrL = new ArrayList<>();
                for (String c : sArr) {
                    String[] characters = c.split("");
                    if (b.equals(characters[(maxL - 1) - a])) {
                        arrL.add(c);
                    }
                }
                Collections.sort(arrL); // Sort lists
                hash.put(b, arrL);
            }

            // Cycle to rebuild our String[] with changes (step 5)
            int index = 0;
            for (Map.Entry<String, ArrayList> e : hash.entrySet()) {
                ArrayList v = e.getValue();
                for (Object s : v) {
                    sArr[index] = s.toString();
                    index++;
                }
            }
        }
        // Code to get our array as an int[] and fix the values
        int aux[] = StringUtil.toIntArray(sArr);
        for (int i = 0; i < aux.length; i++) {
            iArr[i] = aux[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        //int arr[] = {3, 673, 106, 45, 2, 23};
        radixSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }
    }
}
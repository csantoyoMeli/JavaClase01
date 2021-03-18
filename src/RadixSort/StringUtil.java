package RadixSort;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String s = "";
        for (int i = 0; i < n; i++){
            s += c;
        }
        return s;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        return replicate(c, n) + s;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        String[] sArr = new String[arr.length];
        for (int i=0; i < arr.length; i++) {
            sArr[i] = String.valueOf(arr[i]);
        }
        return sArr;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        int[] iArr = new int[arr.length];
        for (int i=0; i < arr.length; i++) {
            iArr[i] = Integer.parseInt(arr[i]);
        }
        return iArr;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int maxDigits = 0;
        for (String s : arr) {
            if (maxDigits < s.length()) {
                maxDigits = s.length();
            }
        }
        return maxDigits;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {
        int maxL = maxLength(arr);
        for (int i = 0; i < arr.length; i++){
            arr[i] = lpad(arr[i], maxL - arr[i].length(), c);
        }
    }
}

package Programmers.Level3;

public class Caesar {
    String caesar(String s, int n) {
        String result = "";
        if (n == 0) return s;
        n = n % 26;
        int[] iArray = s.chars().toArray();
        for (int i = 0; i < iArray.length; i++) {
            if (iArray[i] >= 65 && iArray[i] <= 90 || iArray[i] >= 97 && iArray[i] <= 122)
                iArray[i] += n;

            if ((iArray[i] > 90 && iArray[i] - n <= 90) || (iArray[i] > 122 && iArray[i] - n <= 122))
                iArray[i] = iArray[i] - 26;

            result += (char) iArray[i];
        }
        return result;
    }
}

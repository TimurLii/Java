package Baza_1.HomeWork.Homewor_1;

import java.util.ArrayList;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        String srt = "aaaaabbbcccddd";
        System.out.println(getStr(srt));
        reduce(srt);

    }

    public static String getStr(String str) {
        StringBuilder sb = new StringBuilder();
        String[] res = str.split("");
        List<String> temp = new ArrayList<String>();
        int count = 1;
        for (int i = 0; i < res.length - 1; i++) {
            if (i == 0) {
                temp.add(res[i]);
            } else {
                if (res[i].equals(res[i - 1])) {
                    temp.add(res[i]);
                } else {
                    sb.append(res[i - 1] + temp.size());
                    temp.clear();
                    temp.add(res[i]);
                }
            }
            if (i == res.length - 1) {
                sb.append(temp.get(0) + temp.size());
            }
        }

        return sb.toString();
    }

    public static void reduce(String arg) {
        int count = 1;
        String[] arr = arg.split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result.append(arr[i]);
                continue;
            }
            if (arr[i].equals(arr[i - 1])) {
                count++;
            } else if (!(arr[i].equals(arr[i - 1])) && count != 1) {
                result.append(count).append(arr[i]);
                count = 1;
            } else {
                result.append(arr[i]);
            }
        }
        if (count != 1) {
            result.append(count);
        }
        System.out.println(result);
    }
}

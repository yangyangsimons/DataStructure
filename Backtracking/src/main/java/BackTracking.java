import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTracking {
    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(restoreIpAddresses(s));

    }
    public static List<String> restoreIpAddresses(String s) {
        // create answer list and check input;
        List<String> answer = new ArrayList<>();

        if (s == null || s.length() < 4 || s.length() > 12) {
            return answer;
        }

        List<String> list = new ArrayList<>();

        helper(answer, list, s, 0);
        return answer;
    }

    private static void helper(List<String> answer, List<String> list, String s, int pos) {
        // recursion terminate condition;
        if (list.size() == 4 && pos == s.length()) {
            StringBuffer sb = new StringBuffer();
            String ip = sb.append(list.get(0)).append(".")
                    .append(list.get(1)).append(".")
                    .append(list.get(2)).append(".")
                    .append(list.get(3)).toString();
            answer.add(ip);
        }

        for (int i = pos; i < s.length() && i < pos + 3; i ++) {
            String ipPart = s.substring(pos, i + 1);
            if (isValid(ipPart)) {
                list.add(ipPart);
                helper(answer, list, s, i + 1);
                list.remove(list.size() - 1);
            }
        }

    }
    private static boolean isValid(String ipPart) {
        if (ipPart.charAt(0) == '0') {
            return ipPart.equals("0");
        }
        return Integer.valueOf(ipPart) <= 255;
    }
}

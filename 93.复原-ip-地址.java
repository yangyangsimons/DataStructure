/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        // create answer List;
        List<String> answer = new ArrayList<>();
        
        // check input;
        if (s == null || s.length() < 4 || s.length() > 12) {
            return answer;
        }

        // single solution list;
        List<String> list = new ArrayList<>();
        helper(answer, list, s, 0);
        
        return answer;
    }

    private void helper(List<String> answer, List<String> list, String s, int pos) {
        // recursion terminate condition and solution accept condition;
        if (list.size() == 4 && pos == s.length()) {
            StringBuffer sb = new StringBuffer();
            for (String subs : list) {
                sb.append(subs);
                sb.append('.');
            }
            //delete the last '.'
            sb.deleteCharAt(sb.length() - 1);
            String ip = sb.toString();
            answer.add(ip);
            return;
        }

        for (int i = pos; i < s.length() && i < pos + 3; i ++) {
            String subIp = s.substring(pos, i + 1);
            if (isValid(subIp)) {
                list.add(subIp);
                helper(answer, list, s, i + 1);
                // backtrack;
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isValid(String subIp) {
        if (subIp.charAt(0) == '0') {
            return subIp.equals("0");
        }
        return Integer.valueOf(subIp) <= 255;
    }
}
// @lc code=end


import java.util.*;

class Solution {
    String[] map = {"", "", "abc", "def", "ghi", "jkl",
                    "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        backtrack(digits, 0, "", ans);
        return ans;
    }

    void backtrack(String digits, int i, String s, List<String> ans) {
        if (i == digits.length()) {
            ans.add(s);
            return;
        }

        String letters = map[digits.charAt(i) - '0'];

        for (char c : letters.toCharArray())
            backtrack(digits, i + 1, s + c, ans);
    }
}
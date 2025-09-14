class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;

        // 1. reverse entire string
        reverse(ch, 0, n - 1);

        // 2. reverse each word
        reverseWords(ch, n);

        // 3. clean up spaces
        return cleanSpace(ch, n);
    }

    // reverse a portion of the char array
    private void reverse(char[] ch, int left, int right) {
        while (left < right) {
            char temp = ch[left];
            ch[left++] = ch[right];
            ch[right--] = temp;
        }
    }

    // reverse each word
    private void reverseWords(char[] ch, int n) {
        int start = 0, end = 0;
        while (start < n) {
            while (start<end || start < n && ch[start] == ' ') {start++;}   // skip spaces
            while (end<start || end < n && ch[end] != ' '){end++;}        // find word end
            reverse(ch, start, end - 1);                    // reverse word
        }
    }

    // remove extra spaces
    private String cleanSpace(char[] ch, int n) {
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && ch[j] == ' ') j++;             // skip spaces
            while (j < n && ch[j] != ' ') ch[i++] = ch[j++]; // keep word
            while (j < n && ch[j] == ' ') j++;             // skip spaces
            if (j < n) ch[i++] = ' ';                      // keep one space
        }
        return new String(ch, 0, i);
    }
}

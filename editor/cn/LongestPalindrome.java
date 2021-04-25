//给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。 
//
// 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。 
//
// 注意: 
//假设字符串的长度不会超过 1010。 
//
// 示例 1: 
//
// 
//输入:
//"abccccdd"
//
//输出:
//7
//
//解释:
//我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
// 
// Related Topics 哈希表 
// 👍 289 👎 0

import java.util.HashSet;

public class LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new LongestPalindrome().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0){
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        char[] array = s.toCharArray();
        int count=0;
        for(int i=0;i<array.length;i++){
            if(set.contains(array[i])){
                count++;
                set.remove(array[i]);
            }else {
                set.add(array[i]);
            }
        }
        return set.isEmpty()? count*2:count*2+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
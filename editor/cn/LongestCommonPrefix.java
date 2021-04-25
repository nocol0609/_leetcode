//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 0 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 1579 👎 0

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs!=null){
            for (int i=0;i<strs.length;i++){
                if(strs[i]==null || strs[i].length()==0){
                    return "";
                }
            }
        }else {
            return "";
        }
        Arrays.sort(strs);
        int len=strs.length;

        //自然排序，从小到大字符串长度
        int m=strs[0].length();
        int n=strs[len-1].length();
        int num=Math.min(m,n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num;i++){
            if(strs[0].charAt(i)==strs[len-1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//package leetcode.array;
//
//import java.util.Arrays;
//
///**
// * @author ：liuxp
// * @date ：Created in 2021/4/25 19:56
// * @description ：
// *  * 编写一个函数来查找字符串数组中的最长公共前缀。
// *  *
// *  * 如果不存在公共前缀，返回空字符串""。
// *  *
// *  *
// *  * 示例 1：
// *  *
// *  * 输入：strs = ["flower","flow","flight"]
// *  * 输出："fl"
// *  * 示例 2：
// *  *
// *  * 输入：strs = ["dog","racecar","car"]
// *  * 输出：""
// *  * 解释：输入不存在公共前缀。
// */
//public class _14 {
//
//    public static void main(String[] args) {
//        String[] strs =new String[]{"flower","flow","flight"};
//
//        String s = longestCommonPrefix(strs);
//        System.out.println(">>>>"+s);
//    }
//
//    private static String longestCommonPrefix(String[] strs) {
//        if(strs!=null){
//            for (int i=0;i<strs.length;i++){
//                if(strs[i]==null || strs[i].length()==0){
//                    return "";
//                }
//            }
//        }else {
//            return "";
//        }
//        Arrays.sort(strs);
//        int len=strs.length;
//
//        //自然排序，从小到大字符串长度
//        int m=strs[0].length();
//        int n=strs[len-1].length();
//        int num=Math.min(m,n);
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<num;i++){
//            if(strs[0].charAt(i)==strs[len-1].charAt(i)){
//                sb.append(strs[0].charAt(i));
//            }else {
//                break;
//            }
//        }
//        return sb.toString();
//    }
//}

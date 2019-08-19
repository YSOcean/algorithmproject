package com.ys.algorithmproject.leetcode.demo.defaultapi;

/**
 * 组件名称：algorithmproject
 * 组件日期：Created in 2019/4/24 15:51
 * 修改历史：
 * 1：2019/4/24 15:51创建文件
 *
 * @author shuaiyu
 */
public class DefaultApiImpl implements DefaultApi{

    @Override
    public void test1() {

    }

    public static void main(String[] args) {
        System.out.println(cnToUnicode("chí"));
        System.out.println(cnToUnicode("néng"));

    }

    /**
     * 将拼音字符转换为unicode字符编码进行比较
     *
     * @param cn
     * @return
     */
    public static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += "\\u" + Integer.toString(chars[i], 16);
        }
        return returnStr;
    }


}

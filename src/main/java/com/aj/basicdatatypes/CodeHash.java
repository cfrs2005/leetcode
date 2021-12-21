package com.aj.basicdatatypes;

/**
 * @author zhangqingyue
 * @date 2021/1/21
 */
public class CodeHash {


    public static void main(String[] args) {
        String phone = "8069109125";
        System.out.println(phone);
        int phoneHash = phone.hashCode();
        System.out.println(phoneHash);
        System.out.println(phoneHash % 1000);
        int sub = Integer.parseInt((phoneHash + "").substring((phoneHash + "").length() - 3));
        System.out.println(sub);
        System.out.println(sub % 1000);

    }
}

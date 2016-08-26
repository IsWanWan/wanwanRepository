package com.my.controller;

/**
 * Created by wanwan on 16/8/25.
 */
public class Test {
    public static void main(String[] args) {
        int []index=new int[]{77,89,32,87,73,70,69};
        String str="";
        for(int i=0;i<index.length;i++){
            str=str+(char)index[i];
        }
        System.out.println("绝对是你想要的:"+str);
    }

//
//        String[] str = {"I", "M", "F", "Y", "W", "E", " "};
//        int[] index = new int[]{1, 3, 6, 4, 0, 2, 5};
//        String result = "";
//        for (int i : index) {
//            result += str[i];
//        }
//        System.out.println("绝对是你想要的:" + result);
//    }
    }

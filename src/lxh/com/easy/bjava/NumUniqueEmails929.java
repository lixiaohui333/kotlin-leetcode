package lxh.com.easy.bjava;

import java.util.HashSet;

public class NumUniqueEmails929 {

    public static void main(String[] args) {

        int i = numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});
        System.out.println("i:" + i);
    }

    public static int numUniqueEmails(String[] emails) {

        HashSet<String> allSet = new HashSet<>();

        StringBuilder startSb;
        StringBuilder endSb;

        for (String temp :
                emails) {

            int length = temp.length() - 1;
            int index = 0;
            startSb = new StringBuilder();
            endSb = new StringBuilder();

            while (index < length) {


                char startChar = temp.charAt(index);
                char endChar = temp.charAt(length);
                if (startChar != '+' && startChar != '@') {
                    startSb.append(startChar);
                }
                if (startChar != '@') {
                    index++;
                }
                if (endChar != '@') {
                    endSb.append(endChar);
                }

            }
            allSet.add(startSb.append(endSb.toString()).toString());
        }

        return allSet.size();
    }
//    public static int numUniqueEmails(String[] emails) {
//
//        HashSet<String> allSet = new HashSet<>();
//
//        String s = null;
//        for (String temp :
//                emails) {
//            String[] split = temp.split("@");
//            if (split.length == 2) {
//                s = split[0];
//                s = s.replace(".", "");
//
//                if(s.indexOf("+")>0){
//                    s = s.substring(0,s.indexOf("+"));
//                }
////                if (split1.length == 2) s = split1[0];
//            } else {
//                continue;
//            }
//            allSet.add(s+split[1]);
//        }
//
//        return allSet.size();
//    }
}

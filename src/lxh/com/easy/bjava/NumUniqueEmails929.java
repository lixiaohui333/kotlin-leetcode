package lxh.com.easy.bjava;

import java.util.HashSet;

public class NumUniqueEmails929 {

    public static void main(String[] args) {

        int i = numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});
        System.out.println("i:" + i);
    }

    public static int numUniqueEmails(String[] emails) {

        HashSet<String> allSet = new HashSet<>();

        String s = null;
        for (String temp :
                emails) {
            String[] split = temp.split("@");
            if (split.length == 2) {
                s = split[0];
                s = s.replace(".", "");
                String[] split1 = s.split(",");
                if (split1.length == 2) s = split1[0];
            } else {
                continue;
            }
            allSet.add(s);
        }

        return allSet.size();
    }
}

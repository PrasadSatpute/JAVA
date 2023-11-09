package com.example.Pan.and.Aadhar.details.Service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    public String checkPancode(String pancode) {
        if (pancode != null && pancode.matches("[A-Z]{3}[P]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}")) {
            return "It is an individual pancode";
        } else {
            return "Please enter individual pancode";
        }
    }


    public double calculatePercentageMatched(String str1, String str2) {
        String formattedName1 = str1.trim().toLowerCase();
        String formattedName2 = str2.trim().toLowerCase();

        if (formattedName1.equals(formattedName2)) {
            return 100.0;
        }
        int maxLength = Math.max(formattedName1.length(), formattedName2.length());
        int minLength = Math.min(formattedName1.length(), formattedName2.length());

        int matchingChars = 0;
        for (int i = 0; i < minLength; i++) {
            if (formattedName1.charAt(i) == formattedName2.charAt(i)) {
                matchingChars++;
            }
        }
        return (double) matchingChars / maxLength * 100;
    }}



//        int i = getLongerWordLength(str1, str2);
//        int j = getUnmatchedCharacterCount(str1, str2);
//        System.out.println(i);
//        System.out.println(j);
//        return ((100 / i) - j) * 100;
//
//    }

//
//    private static int getUnmatchedCharacterCount(String word1, String word2) {
//        int length1 = word1.length();
//        int length2 = word2.length();
//        int minLength = Math.min(length1, length2);
//        int count = 0;
//        int i;
//        for (i = 0; i < minLength; i++) {
//            if (word1.charAt(i) != word2.charAt(i)) {
//                break;
//            }
//            count++;
//        }
//        if (i == minLength && length1 != length2) {
//            count += Math.abs(length1 - length2);
//        }
//        return count;
//    }
//
//
//    private static int getLongerWordLength(String word1, String word2) {
//        return Math.max(word1.length(), word2.length());
//    }
//}
//        int i=str1.length();
//        int j=str2.length();

//        int maxLength = Math.max(str1.length(), str2.length());
//        int minLength = Math.min(str1.length(), str2.length());
//
//        int matchingChars = 0;
//        for (int i = 0; i < minLength; i++) {
//            if (str1.charAt(i) == str2.charAt(i)) {
//                matchingChars++;
//            }
//        }
//
//        return (double) matchingChars / maxLength * 100;
//    }


//        int maxLength = Math.max(str1.length(), str2.length());
//        int matchingChars = 0;
//
//        for (int i = 0; i < maxLength; i++) {
//            if (Character.toUpperCase(str1.charAt(i)) == Character.toUpperCase(str2.charAt(i))) {
//                matchingChars++;
//            }
//        }
//
//        return (double) matchingChars / maxLength * 100;



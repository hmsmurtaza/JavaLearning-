package com.hmsmurtaza.lambda1;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        int comparisonResult = stringComparator.compare("Hello", "world");
        System.out.println(comparisonResult);

        // lambda expression
        Comparator<String> stringComparatorLambda =
                (str1,  str2) -> str1.compareTo(str2);
        // (String str1, String str2) -> {
        //  return str1.compareTo(str2);};
        int lambdaComparisonResult = stringComparatorLambda.compare("hello", "world");
        System.out.println(lambdaComparisonResult);
    }
}

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class HackerRankClass {

    public static void main(String[] args) {
        HackerRankClass obj = new HackerRankClass();
        //obj.multiplesOf3And5Below1000();
        //obj.sumOfEvenFibonaciNumbers();
        //obj.primeFactors(600851475143L);
       /* System.out.println(obj.timeConversion("07:05:45AM"));
        System.out.println(obj.timeConversion("12:05:45AM"));
        System.out.println(obj.timeConversion("12:05:45PM"));
        System.out.println(obj.timeConversion("11:05:45PM"));*/
        //obj.arrayManipulation(5, new int[][]{{1, 2, 100}, {2, 5, 100}, {3, 4, 100}});
        /*List<List<Integer>> queryList = new ArrayList<>();
        List<Integer> query1 = new ArrayList<>();
        query1.add(1);
        query1.add(0);
        query1.add(5);
        List<Integer> query2 = new ArrayList<>();
        query2.add(1);
        query2.add(1);
        query2.add(7);
        List<Integer> query3 = new ArrayList<>();
        query3.add(1);
        query3.add(0);
        query3.add(3);
        List<Integer> query4 = new ArrayList<>();
        query4.add(2);
        query4.add(1);
        query4.add(0);
        List<Integer> query5 = new ArrayList<>();
        query5.add(2);
        query5.add(1);
        query5.add(1);
        queryList.add(query1);
        queryList.add(query2);
        queryList.add(query3);
        queryList.add(query4);
        queryList.add(query5);
        obj.dynamicArray(2, queryList);*/
        //System.out.println(obj.substrCount(7, "abcbaba"));
        //System.out.println(obj.isSpecialPalindrome("aabaa".toCharArray(),0,5));
        //System.out.println(obj.isSpecialPalindrome("abcbaba".toCharArray(),0,)));
        /*System.out.println(obj.isSpecialPalindrome("aadaa".toCharArray(),0,5));
        System.out.println(obj.isSpecialPalindrome("aaaa".toCharArray(),0,4));
        System.out.println(obj.isSpecialPalindrome("adaa".toCharArray(),0,4));
        System.out.println(obj.isSpecialPalindrome("bcba".toCharArray(),0,4));*/
        //obj.substrCount(7, "abcbaba");
        /*obj.substrCount(7, "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa" +
                "ababbbbaaaaaaabbbababbababbbbaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbabababaaaaaaaaaaaaaabbbbaaaaa"


        );*/
        //obj.isValid("abcdefghhgfedecba");
        // obj.isValid("aaaabbcc");
        //obj.makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        //obj.minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
        /*int sum = obj.hourglassSum(new int[][]{{-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}});
        System.out.println(sum);*/
        // obj.minimumBribes(new int[]{2,1,5,3,4});
        //System.out.println(Arrays.toString(obj.rotLeft(new int[]{1, 2, 3, 4, 5}, 4)));
        //System.out.println(Arrays.toString(obj.rotLeftReducingTimeComplexity(new int[]{1, 2, 3, 4, 5}, 4)));
    }

    private int[] rotLeft(int[] a, int d) {
        int n = a.length;
        if (n == d) {
            /*for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }*/
            return a;
        } else {
            int[] rotArray = new int[n];
            //Instead of having if else for total elements, i have  split into two loops
            for (int i = 0; i < d; i++) {
                rotArray[i + n - d] = a[i];
            }
            for (int i = d; i < n; i++) {
                rotArray[i - d] = a[i];
            }

            return rotArray;
            /*for(int i=0;i<n;i++){
                System.out.print(rotArray[i]+" ");
            }*/
        }
    }

    /*private int[] rotLeftReducingTimeComplexity(int[] a, int d) {//Cant be done with single for loop
        int size = a.length;
        if (size == d) {
            return a;
        } else {
            int index = Math.abs(size - d);
            for (int i = 0; i < size; i++) {
                a[index+i] = a[i];
            }
            return a;
        }

    }*/

    //Half done
    private void minimumBribes(int[] q) {//2,5,1,3,4
        int minSwaps = 0;
        boolean isChaotic = false;
        for (int i = 0; i < q.length; i++) {
            //System.out.print("else");
            int queuePosition = i + 1;
            int swapCount = q[i] - queuePosition + i;
            if (swapCount > 0) {
                for (int j = i; j < swapCount; j++) {
                    int temp = q[j];
                    q[j] = q[j + 1];
                    q[j + 1] = temp;
                    minSwaps++;
                }
            }
        }
        System.out.println("After Swaps:" + Arrays.toString(q));
        for (int i = 0; i < q.length; i++) {
            int queuePosition = i + 1;
            if ((q[i] - queuePosition) < -2 || (q[i] - queuePosition) > 2) {//More than two places
                System.out.println("Too chaotic");
                isChaotic = true;
                break;
            }
        }

        if (!isChaotic) {
            System.out.println(minSwaps);
        }

    }

    private int hourglassSum(int[][] arr) {
        ArrayList<Integer> glassSum = new ArrayList<>();
        for (int i = 0; i + 2 < 6; i++) {
            for (int j = 0; j + 2 < 6; j++) {
                int sum1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                glassSum.add(sum1);
            }
        }
        Collections.sort(glassSum);
        return glassSum.get(glassSum.size() - 1);
    }

    //https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
    private int makeAnagram(String a, String b) {
        StringBuilder sbA = new StringBuilder(a);
        StringBuilder sbB = new StringBuilder(b);
        int deleteCount = 0;
        for (int i = sbA.length() - 1; i >= 0; i--) {
            String str = Character.toString(sbA.charAt(i));
            if (!sbB.toString().contains(str)) {
                sbA.deleteCharAt(i);
                deleteCount++;
            } else {
                sbB.deleteCharAt(sbB.toString().indexOf(str));
            }
        }
        //System.out.println("a:"+ sbA.toString()+", deleteCount:"+deleteCount);
        //System.out.println(deleteCount + b.length() - sbA.length());
        return deleteCount + b.length() - sbA.length();
    }

    //https://www.hackerrank.com/challenges/alternating-characters/problem
    private int alternatingCharacters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int deleteCount = 0;
        for (int i = 0; i + 1 < sb.length(); i++) {
            if (sb.codePointAt(i) == sb.codePointAt(i + 1)) {
                sb.deleteCharAt(i);
                i--;
                deleteCount++;
            }
        }
        return deleteCount;
    }

    //https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
    private String isValid(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (!frequency.containsKey(character)) {
                frequency.put(character, 1);
            } else {
                frequency.put(character, frequency.get(character) + 1);
            }
        }
        ArrayList<Integer> values = new ArrayList<>(frequency.values());
        Set<Integer> noDuplicates = new HashSet<>(frequency.values());
        System.out.println(frequency.toString());
        System.out.println(values.toString());
        System.out.println(noDuplicates.toString());
        int noDupesSize = noDuplicates.size();
        if (noDupesSize > 2) {
            return "NO";
        } else if (noDupesSize == 1) {
            return "YES";
        } else {
            /*ArrayList<Integer> indexNoDupes = new ArrayList<>(noDuplicates);
            int diff = Math.abs(indexNoDupes.get(0) - indexNoDupes.get(1));
            if(diff>2){
                return "NO";
            }else{
                return "YES";
            }*/
            int frequency1 = 0;
            int frequency2 = 0;
            int frequency1Count = 0;
            int frequency2Count = 0;
            for (int j = 0; j < values.size(); j++) {
                if (frequency1 == 0) {
                    frequency1 = values.get(j);
                    frequency1Count += frequency1;
                } else if (frequency1 == values.get(j)) {
                    frequency1Count++;
                } else if (frequency2 == 0) {
                    frequency2 = values.get(j);
                    frequency2Count += frequency2;
                } else {
                    frequency2Count += frequency2;
                }
            }
            System.out.println("frequency1Count:" + frequency1Count + ",frequency2Count:" + frequency2Count);
            int diff = Math.abs(frequency1Count - frequency2Count);
            if (diff == 1) {
                return "YES";
            } else {
                return "NO";
            }
            /*if (frequency1Count == 1 || frequency2Count == 1) {
             *//*if (diff == 1) {*//*
                return "YES";
                *//*} else {
                    return "NO";
                }*//*
            } else {
                return "NO";
            }*/

        }

    }

    /*private long substrCount(int n, String s) {
        long subStrCount = n;//for individual
        for (int j = 2; j <= n; j++) {
            for (int i = 0; i + j <= n; i++) {
                if (isSpecialPalindrome(s.substring(i, i + j))) {
                    //System.out.println(s.substring(i, i + j));
                    subStrCount++;
                }
            }
        }
       // System.out.println("substrcount:" + subStrCount);
        return subStrCount;
    }*/

    /*private boolean isSpecialPalindrome(String s) {
        int firstCodePoint = s.codePointAt(0);
        boolean isEven = s.length() % 2 == 0;
        int oddMiddleIndex = (s.length() - 1) / 2;
        int equalCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isEven) {
                if (firstCodePoint == s.codePointAt(i)) {
                    equalCount++;
                } else {
                    return false;
                }
            } else {//odd
                if (i != oddMiddleIndex && firstCodePoint == s.codePointAt(i)) {
                    equalCount++;
                } else if (i == oddMiddleIndex) {

                } else {
                    return false;
                }
            }
        }

        if (isEven) {
            return equalCount == s.length();
        } else {
            return equalCount == s.length() - 1;
        }
    }*/


    private long substrCount(int n, String s) {
        n = s.length();
        char[] charArray = s.toCharArray();
        long startTime = System.nanoTime();
        //StringBuilder sb = new StringBuilder(s);
        long subStrCount = n;//for individual
        //int [] asciiCodes = new int[n];

        for (int j = 2; j <= n; j++) {
            for (int i = 0; i + j <= n; i++) {
                /*for (int p = i; p < i + j; p++) {
                    System.out.print(charArray[p]);
                }
                System.out.print(" ");*/
                if (isSpecialPalindrome(charArray, i, i + j)) {
                    //System.out.println(s.substring(i, i + j));
                    subStrCount++;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("execution_time:" + TimeUnit.NANOSECONDS.toSeconds(endTime - startTime));
        return subStrCount;
    }

    private boolean isSpecialPalindrome(char[] s, int firstPosition, int endPosition) {
        int firstCodePoint = s[firstPosition];
        int length = endPosition - firstPosition;
        boolean isEven = length % 2 == 0;
        int oddMiddleIndex = (length) / 2 + firstPosition;
        int equalCount = 0;


        //System.out.print(firstCodePoint);

        for (int i = firstPosition; i < endPosition; i++) {
            // System.out.print(s[i]);
            if (isEven) {
                if (firstCodePoint == s[i]) {
                    equalCount++;
                } else {
                    return false;
                }
            } else {//odd
                if (i != oddMiddleIndex && firstCodePoint == s[i]) {
                    equalCount++;
                } else if (i == oddMiddleIndex) {

                } else {
                    return false;
                }
            }
        }
        /*System.out.println();
        System.out.print("firstPosition:" + firstPosition);
        System.out.print(",endPosition:" + endPosition);
        System.out.print(",length:" + length);
        System.out.print(",iseven:" + isEven);
        System.out.print(",equalCount:" + equalCount);
        System.out.print(",oddMiddleIndex:" + oddMiddleIndex);
        System.out.println();*/
        if (isEven) {
            return equalCount == length;
        } else {
            return equalCount == length - 1;
        }
    }

    //https://www.hackerrank.com/challenges/sparse-arrays/problem
    private int[] matchingStrings(String[] strings, String[] queries) {
        int[] count = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (queries[i].equals(strings[j])) {
                    count[i] = count[i] + 1;
                }
            }
        }
        return count;
    }

    //https://www.hackerrank.com/challenges/crush/problem
    //x1,x2,x3,___xi sequence
    //y1,y3,y3____yi prefix sum
    //yi=yi-1+xi
    private long arrayManipulation(int n, int[][] queries) {
        long[] finalArray = new long[n];
        for (int i = 0; i < queries.length; i++) {
            int startIndex = queries[i][0] - 1;
            int endIndex = queries[i][1];
            int numberToBeAdded = queries[i][2];
            /*for (int j = startIndex; j < endIndex; j++) {
                finalArray[j] = finalArray[j] + numberToBeAdded;
            }*/
            finalArray[startIndex] += numberToBeAdded;
            if (endIndex < n) {
                finalArray[endIndex] -= numberToBeAdded;
            }
        }
        //System.out.println(Arrays.toString(finalArray));
        long temp = 0;
        long max = 0;
        //Prefix sum
        for (int i = 0; i < n; i++) {
            temp += finalArray[i];
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(Arrays.toString(finalArray));

        /*long largestValue = finalArray[0];

        for (int i = 1; i < n; i++) {//Sort
            if (largestValue < finalArray[i]) {
                largestValue = finalArray[i];
            }
        }*/
        return max;
    }

    //https://www.hackerrank.com/challenges/dynamic-array/problem
    private List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> lastAnswerList = new ArrayList<>();
        List<List<Integer>> seqList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<Integer>());
        }
        int lastAnswer = 0;
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> query = queries.get(i);
            int x = query.get(1);
            int y = query.get(2);
            int index = (x ^ lastAnswer) % n;
            if (query.get(0) == 1) {
                seqList.get(index).add(y);
            } else {// Type 2 query
                int childIndex = y % seqList.get(index).size();
                lastAnswer = seqList.get(index).get(childIndex);
                lastAnswerList.add(lastAnswer);
            }
        }
        //System.out.println(Arrays.toString(seqList.toArray()));
        //System.out.println(Arrays.toString(lastAnswerList.toArray()));
        return lastAnswerList;
    }

    //https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
    /*private SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode previousNode = null;
        SinglyLinkedListNode currentReverseHead = null;
        while (currentNode != null) {
            currentReverseHead = new SinglyLinkedListNode(currentNode.data);
            currentReverseHead.next = previousNode;
            previousNode = currentReverseHead;
            currentNode = currentNode.next;
        }
        return currentReverseHead;

    }*/

    //https://www.hackerrank.com/challenges/time-conversion/problem
    private String timeConversion(String s) {
        String[] format = s.split(":");//07:05:45PM
        int hour = Integer.parseInt(format[0]);
        StringBuilder builder = new StringBuilder();
        if (format[2].contains("PM")) {
            //String.format("%02d",Integer.parseInt(format[0]));
            if (hour >= 1 && hour <= 11) {
                hour += 12;
            }
            format[2] = format[2].replace("PM", "");
            return builder.append(new DecimalFormat("00").format(hour))
                    .append(":").append(format[1]).append(":").append(format[2]).toString();
            //return new DecimalFormat("00").format(hour) + ":" + format[1] + ":" + format[2];

        } else if (format[2].contains("AM")) {
            format[2] = format[2].replace("AM", "");
            if (hour == 12) {
                return "00:" + format[1] + ":" + format[2];
            } else {
                return format[0] + ":" + format[1] + ":" + format[2];
            }

        }
        return "error";
    }
}

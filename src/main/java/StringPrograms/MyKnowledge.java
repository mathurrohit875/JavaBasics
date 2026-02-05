package StringPrograms;

import java.util.*;

public class MyKnowledge {

  public static void main(String[] args) {
    /*remove the duplicate characters from the string.*/
    String str = "hello";
    String r = "";
    char c = ' ';
    for (int i = 0; i < str.length(); i++) {
      c = str.charAt(i);
      boolean found = false;
      for (int j = 0; j < i; j++) {
        if (str.charAt(i) == str.charAt(j)) {
          found = true;
          break;
        }
      }
      if (!found) {
        r += c;
      }
    }

    /*reverse string*/
    System.out.println("repeated char: " + r);
    String st = "Word";
    String s = "";
    char a;
    for (int k = 0; k < st.length(); k++) {
      a = st.charAt(k);
      s = a + s;
    }
    System.out.println("reverse: " + s);

    /*reverse number array*/
    int[] arr = {1, 2, 3};
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[arr.length - 1 - i];
      System.out.println("reverse array: " + newArr[i]);
    }

    /*duplicate number in array*/
    int[] orrArr = {1, 2, 1, 12, 3, 2};
    for (int i = 0; i < orrArr.length - 1; i++) {
      for (int j = (i + 1); j < orrArr.length; j++) {
        if (orrArr[i] == orrArr[j]) {
          System.out.println("repeated array number: " + orrArr[i]);
        }
      }
    }

    /*highest number in array*/
    int[] arrHigh = {100, 2, 3, 25, 12, 15, 4};
    int highest = arrHigh[0];
    for (int i = 0; i < arrHigh.length; i++) {
      if (arrHigh[i] > highest) {
        highest = arrHigh[i];
      }
    }
    System.out.println("highest number: " + highest);

    /*power of 2*/
    int num = 16;
    while (num % 2 == 0) {
      num = num / 2;
    }
    if (num == 1) {
      System.out.println("power of 2");
    } else {
      System.out.println("not power of 2");
    }

    //program to find missing number from list
    int[] arrMis = {1, 2, 3, 4, 6, 8, 10};
    int start = 1;
    int end = 10;
    int count = 1;
    HashSet<Integer> set = new HashSet<>();
    for (int nu : arrMis) {
      set.add(nu);
    }
    for (int i = start; i <= end; i++) {
      if (!set.contains(i)) {
        System.out.println("missing number: " + i);
      }

    }

/*remove duplicate from a list*/
    List<String> list= Arrays.asList("Java","sel","Java");
    HashSet<String> hs=new HashSet<>(list);
    System.out.println(hs);
    List<String> rec=new ArrayList<>(hs);
    System.out.println(rec);

    /*Remove duplicate character from string*/
    String str1="helllcoooodi";
    String result="";
    HashSet<Character> hs1=new HashSet<>();
    for(char c1: str1.toCharArray()){
      if(!hs1.contains(c1)){
        hs1.add(c1);
        result+=c1;
      }

  }
    System.out.println("result: "+result);

/*remove duplicate from array using hashset*/
    int[] rem={1,2,1,2,31,2,1,1};
    HashSet<Integer> hsint=new HashSet<>();

    for(int i:rem)
    {
      hsint.add(i);
    }
    System.out.println(hsint);
//frequency of each element in array
    int[] fre={1,2,1,23,4,1,2,23,1};
    HashMap<Integer,Integer> du=new HashMap<>();
    for(int nn:fre){
      du.put(nn,du.getOrDefault(nn,0)+1);
    }
    for(int keyy: du.keySet()){
      System.out.println("num: "+keyy+" freq: "+du.get(keyy));
    }

    //second highest number in array
    int[] arrhi = {1, 2, 3, 4};
    int max;
    for (int i = 0; i < arrhi.length; i++) {
      for (int j = (i + 1); j < arrhi.length; j++) {
        if (arrhi[i] < arrhi[j]) {
          max = arrhi[i];
          arrhi[i] = arrhi[j];
          arrhi[j] = max;
        }
      }
    }
    System.out.println("second  highest: " + arrhi[1]);
    int[] a1 = {10, 20, 30, 50, 60, 70};
    int key = 90;
    System.out.println(key + " is found at index:  " + linearSearch(a1, key));
  }

  public static int linearSearch(int[] abc, int key) {
    for (int i = 0; i < abc.length; i++) {
      if (abc[i] == key) {
        return i;
      }
    }
    return -1;
}
}




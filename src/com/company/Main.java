package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//      Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
//      Метод натыйжаны жаңы set катары кайтарышы керек. Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
//      Мисалы: [1, 2, 3} жана {0, 1, 2]
//      Жооп: [0, 3]
//      public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(19);
        set1.add(4);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(7);
        set2.add(3);
        set2.add(5);

        System.out.println("set1: ");
        set1.forEach(System.out::println);
        System.out.println();

        System.out.println("set2: ");
        set2.forEach(System.out::println);
        System.out.println();

        symmetricDifference(set1,set2);
    }

    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set = new HashSet<>(set2);
        set2.removeAll(set1);
        set1.removeAll(set2);

        set.addAll(set1);

        System.out.println("result after sorting: ");
        set.forEach(System.out::println);
        return set;
    }

        /*LinkedList<Integer> list = new LinkedList<>();
        int counter = 0;
        for (int i = 0; i < 20; i++) {
            int random = new Random().nextInt(20);
            list.add(random);
            counter += random;
            System.out.print(random + ", ");
        }
        System.out.println("\nsum: "+ counter);

        Set<Integer> nums = new HashSet<>(list);
        nums.addAll(list);
        long sum = nums.stream().mapToInt(x -> x).sum();
        nums.forEach(System.out::print);
        System.out.println(sum); */


//        Set<Student> hashSet = new HashSet<>();
//        hashSet.add(new Student("masha",23));
//        hashSet.add(new Student("masa",2));
//        hashSet.add(new Student("masa",3));
//        hashSet.add(new Student("msha",25));
//
//        hashSet.forEach(System.out::println);
}

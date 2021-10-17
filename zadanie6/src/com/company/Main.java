package com.company;

import java.util.*;

public class Main {

    static Student[] merge(Student[] arr1, Student[] arr2) {
        Set<Student> set = new HashSet<>();
        set.addAll(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));
        return set.toArray(new Student[]{});
    }

    public static void InsertionSort(Student[] iDNumber) {
        for (int left = 0; left < iDNumber.length; left++) {
            Student value = iDNumber[left];

            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getMark() < iDNumber[i].getMark()) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    break;
                }
            }
            iDNumber[i + 1] = value;
        }
    }

    public static void main(String[] args) {
        Student sasha = new Student(3,"Sasha", "89034684745", 5);
        Student lena = new Student(4,"Lena", "89993243733", 3);
        Student katya = new Student(1,"Katya", "89093738165", 2);
        Student vanya = new Student(2,"Vanya", "89672626722", 4);

        Student[] iDNumeber = new Student[] {sasha, lena, katya, vanya};
        InsertionSort(iDNumeber);
        System.out.println(Arrays.toString(iDNumeber));

        System.out.println("\nCOMPARATOR\n");
        Student ira = new Student(6,"Ira", "89104268586", 2);
        Student vera = new Student(8,"Vera", "89164264566", 4);
        Student vadim = new Student(7,"Vadim", "89109267312", 5);
        Student misha = new Student(5,"Misha", "89194062516", 3);
        Student[] comparator_sort = new Student[] {ira, vera, vadim, misha};
        Arrays.sort(comparator_sort, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(comparator_sort));

        System.out.println("\nBOTH MASSIVE\n");
        Student[] merge_arrays = merge(iDNumeber, comparator_sort);
        InsertionSort(merge_arrays);
        System.out.println(Arrays.toString(merge_arrays));
    }
}


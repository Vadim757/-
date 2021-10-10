package com.company;

import java.util.Scanner;

public class Practice5 {
    /*
    1. Треугольная последовательность
    Дана монотонная последовательность, в которой каждое натуральное число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,…
    По данному натуральному n выведите первые n членов этой последовательности. Попробуйте обойтись только одним циклом for.
    */
    public static String TriangularSequence(int n) {
        int sum = 0;
        int j = 0;
        if (n == 1) {
            System.out.print(1);
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.print(TriangularSequence(--n) + " " + j);
        }
        return "";
    }

    /*
    2. От 1 до n
    Дано натуральное число n. Выведите все числа от 1 до n.
    */
    public static String ONEtoN(int n) {
        if (n == 1) {
            return "1";
        }
        return ONEtoN(n - 1) + " " + n;
    }

    /*
    3. От A до B
    Даны два целых числа A и В (каждое в отдельной строке).
    Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
    */
    public static String AtoB(int A, int B) {
        if(A > B) {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + AtoB(A - 1, B);
        } else {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + AtoB(A + 1, B);
        }
    }

    /*
    4. Заданная сумма цифр
    Даны натуральные числа k и s. Определите, сколько существует k-значных натуральных чисел, сумма цифр которых равна d.
    Запись натурального числа не может начинаться с цифры 0.
    В этой задаче можно использовать цикл для перебора всех цифр, стоящих на какой-либо позиции.
    */
    public static int SpecifiedSumOfDigits(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += SpecifiedSumOfDigits(len + 1, sum + i, k, s);
        }
        return res;
    }

    /*
    5. Сумма цифр числа
    Дано натуральное число N. Вычислите сумму его цифр.
    При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
    */
    public static int SumOfDigitsOfaNumber(int N) {
        if (N < 10) {
            return N;
        }
        else {
            return N % 10 + SumOfDigitsOfaNumber(N / 10);
        }
    }

    /*
    6. Проверка числа на простоту
    Дано натуральное число n>1. Проверьте, является ли оно простым.
    Программа должна вывести слово YES, если число простое и NO, если число составное.
    Алгоритм должен иметь сложность O(logn).

    Указание.
    Понятно, что задача сама по себе нерекурсивна, т.к. проверка числа n на простоту никак не сводится к проверке на простоту меньших чисел.
    Поэтому нужно сделать еще один параметр рекурсии: делитель числа, и именно по этому параметру и делать рекурсию.
    */
    public static boolean CheckingANumberForSimplicity(int n, int i) {
        if (n > 1) {
            return false;
        } else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return CheckingANumberForSimplicity(n, i + 1);
        } else {
            return true;
        }
    }

    /*
    7. Разложение на множители
    Дано натуральное число n>1.
    Выведите все простые множители этого числа в порядке неубывания с учетом кратности.
    Алгоритм должен иметь сложность O(logn)
     */
    public static void Factorization(int n, int k){
        if (k > n / 2) {
            System.out.print(n);
            return;
        }
        if (n % k == 0) {
            System.out.print(k);
            Factorization(n / k, k);
        } else {
            Factorization(n, ++k);
        }
    }

    /*
    8. Палиндром
    Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом. Выведите YES или NO.
    При решении этой задачи нельзя пользоваться циклами, в решениях на питоне нельзя использовать срезы с шагом, отличным от 1.
     */
    public static String Polindrom(String s){
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return Polindrom(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    /*
    9. Без двух нулей
    Даны числа a и b. Определите, сколько существует последовательностей из a нулей и b единиц, в которых никакие два нуля не стоят рядом.
     */
    public static int WithoutTwoZeros(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return WithoutTwoZeros(a, b - 1) + WithoutTwoZeros(a - 1, b - 1);
    }

    /*
    10. Разворот числа
    Дано число n, десятичная запись которого не содержит нулей.
    Получите число, записанное теми же цифрами, но в противоположном порядке.
    При решении этой задачи нельзя использовать циклы, строки, списки, массивы, разрешается только рекурсия и целочисленная арифметика.
    Фунция должна возвращать целое число, являющееся результатом работы программы, выводить число по одной цифре нельзя.
    */
    private static int NumberReversal(int num, int rev){
        if(num==0) return rev;
        return NumberReversal(num/10, 10*rev + num%10);
    }

    /*
    11. Количество единиц
    Дана последовательность натуральных чисел (одно число в строке), завершающаяся двумя числами 0 подряд.
    Определите, сколько раз в этой последовательности встречается число 1.
    Числа, идущие после двух нулей, необходимо игнорировать.
    В этой задаче нельзя использовать глобальные переменные и параметры, передаваемые в функцию.
    Функция получает данные, считывая их с клавиатуры, а не получая их в виде параметров.
     */
    public static int NumberOfUnits() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return NumberOfUnits() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return NumberOfUnits() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return NumberOfUnits() + n + m;
            } else {
                return n + m;
            }
        }
    }

    /*
    12. Вывести нечетные числа последовательности
    Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
    Выведите все нечетные числа из этой последовательности, сохраняя их порядок.
    В этой задаче нельзя использовать глобальные переменные и передавать какиелибо параметры в рекурсивную функцию.
    Функция получает данные, считывая их с клавиатуры. Функция не возвращает значение, а сразу же выводит результат на экран.
    Основная программа должна состоять только из вызова этой функции.
     */
    public static void PrintOddNumbersOfaSequence() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                PrintOddNumbersOfaSequence();
            } else {
                PrintOddNumbersOfaSequence();
            }
        }
    }

    /*
    13. Вывести члены последовательности с нечетными номерами
    Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
    Выведите первое, третье, пятое и т.д. из введенных чисел. Завершающий ноль выводить не надо.
    В этой задаче нельзя использовать глобальные переменные и передавать какиелибо параметры в рекурсивную функцию.
    Функция получает данные, считывая их с клавиатуры. Функция не возвращает значение, а сразу же выводит результат на экран.
    Основная программа должна состоять только из вызова этой функции.
     */
    public static void OddNumberedSequence() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                OddNumberedSequence();
            }
        }
    }

    /*
    14. Цифры числа слева направо
    Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
    При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
    Разрешена только рекурсия и целочисленная арифметика
     */
    public static int DigitsNumbersFromLeftToRight(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10 + " ");
            return DigitsNumbersFromLeftToRight(n / 10);
        }
    }

    /*
    15. Цифры числа справа налево
    Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами или новыми строками.
    При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
    Разрешена только рекурсия и целочисленная арифметика.
     */
    public static String DigitsNumbersFromRightToLeft(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return DigitsNumbersFromRightToLeft(n / 10) + " " + n % 10;
        }
    }

    /*
    16. Количество элементов, равных максимуму
    Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
    Определите, какое количество элементов этой последовательности, равны ее наибольшему элементу.
    В этой задаче нельзя использовать глобальные переменные.
    Функция получает данные, считывая их с клавиатуры, а не получая их в виде параметра.
    В программе на языке Python функция возвращает результат в виде кортежа из нескольких чисел и функция вообще не получает никаких параметров.
       В программе на языке C++ результат записывается в переменные, которые передаются в функцию по ссылке.
    Других параметров, кроме как используемых для возврата значения, функция не получает.
    Гарантируется, что последовательность содержит хотя бы одно число (кроме нуля)
    */
    public static void NumberOfElementsEqualToMaximum(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                NumberOfElementsEqualToMaximum(n, 1);
            } else if (n == max) {
                NumberOfElementsEqualToMaximum(max, ++count);
            } else {
                NumberOfElementsEqualToMaximum(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    /*
    17. Максимум последовательности
    Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
    Определите наибольшее значение числа в этой последовательности.
    В этой задаче нельзя использовать глобальные переменные и передавать какиелибо параметры в рекурсивную функцию.
    Функция получает данные, считывая их с клавиатуры. Функция возвращает единственное значение: максимум считанной последовательности.
    Гарантируется, что последовательность содержит хотя бы одно число (кроме нуля).
     */
    public static int MaximumConsistency() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return Math.max(n, MaximumConsistency());
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1.");
        System.out.println(TriangularSequence(10));
        System.out.println("Задание 2.");
        System.out.println(ONEtoN(10));
        System.out.println("Задание 3.");
        System.out.println(AtoB(20, 15));
        System.out.println(AtoB(10, 15));
        System.out.println("Задание 4.");
        System.out.println(SpecifiedSumOfDigits(0, 0, 3, 15));
        System.out.println("Задание 5.");
        System.out.println(SumOfDigitsOfaNumber(123));
        System.out.println("Задание 6.");
        System.out.println(CheckingANumberForSimplicity(18,2));
        System.out.println("Задание 7.");
        Factorization(150,2);
        System.out.println();
        System.out.println("Задание 8.");
        System.out.println(Polindrom("radar"));
        System.out.println("Задание 9.");
        System.out.println(WithoutTwoZeros(5, 8));
        System.out.println("Задание 10.");
        System.out.println(NumberReversal(158, 0));
        System.out.println("Задание 11.");
        System.out.println(NumberOfUnits());
        System.out.println("Задание 12.");
        PrintOddNumbersOfaSequence();
        System.out.println("Задание 13.");
        OddNumberedSequence();
        System.out.println("Задание 14.");
        System.out.println(DigitsNumbersFromLeftToRight(153));
        System.out.println("Задание 15.");
        System.out.println(DigitsNumbersFromRightToLeft(123));
        System.out.println("Задание 16.");
        NumberOfElementsEqualToMaximum(0, 0);
        System.out.println("Задание 17.");
        System.out.println(MaximumConsistency());
    }
}

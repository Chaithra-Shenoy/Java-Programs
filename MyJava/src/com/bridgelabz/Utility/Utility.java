package com.bridgelabz.Utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.datastructure.LinkedList;
import com.bridgelabz.datastructure.QueueUsingLinkedlist;

/*********************************************************************************************************
 * purpose: All Program Methods
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 ********************************************************************************************************/
/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Utility {
	/**
	 * @param number
	 * @return
	 */
	static Scanner sc1 = new Scanner(System.in);

	public static int scanner(int number) {
		number = sc1.nextInt();
		return number;
	}

	/**
	 * @param number
	 * @return
	 */
	public static double scanner(double number) {
		number = sc1.nextDouble();
		return number;
	}

	/**
	 * @param string
	 * @return
	 */
	public static String scanner(String string) {
		string = sc1.nextLine();
		return string;
	}

	/****************************************************************************************************/
	/**
	 * Array implementation methods
	 * 
	 * @param rows
	 * @param columns
	 * @return
	 */
	public static int[][] arrayInt(int rows, int columns) {
		int[][] array = new int[rows][columns];
		System.out.println("enter int array elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = sc1.nextInt();
			}
		}
		return array;
	}

	/**
	 * @param array
	 * @param rows
	 * @param columns
	 */
	public static void printArrayInt(int[][] array, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * @param rows
	 * @param columns
	 * @return
	 */
	public static double[][] arrayDouble(int rows, int columns) {
		double[][] array = new double[rows][columns];
		System.out.println("enter double array elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = sc1.nextDouble();
			}
		}
		return array;
	}

	/**
	 * @param array
	 * @param rows
	 * @param columns
	 */
	public static void printArrayDouble(double[][] array, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(" " + array[i][j] + " ");
			}

			System.out.println();
		}

	}

	/**
	 * @param rows
	 * @param columns
	 * @return
	 */
	public static boolean[][] arrayBoolean(int rows, int columns) {
		boolean[][] array = new boolean[rows][columns];
		System.out.println("enter boolean array elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = sc1.nextBoolean();
			}
		}
		return array;
	}

	/**
	 * @param array
	 * @param rows
	 * @param columns
	 */
	public static void printArrayBoolean(boolean[][] array, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}
	}

	/***************************************************************************************************/

	/**
	 * 
	 * String Permutation implementation
	 * 
	 * @param string
	 * @param start
	 * @param end
	 */
	public static String permutation(String string, int start, int end) {
		if (start == end)
			System.out.println(string);
		else {
			for (int i = start; i <= end; i++) {
				string = swap(string, start, i);
				permutation(string, start + 1, end);
				string = swap(string, start, i);
			}

		}
		return string;

	}

	/**
	 * @param string
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String string, int i, int j) {
		char[] ch = string.toCharArray();
		char temp;
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}

	/***************************************************************************************************/
	/**
	 * Sum of three interger value
	 * 
	 * @param array
	 * @param size
	 */
	public static void Print(int[] array, int size) {

		int count = 0;
		int sum = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = j + 1; k < size; k++) {
					if (array[i] + array[j] + array[k] == 0)
						count++;
					sum = array[i] + array[j] + array[k];
					System.out.println(array[i] + " + " + array[j] + " + " + array[k] + " = " + sum);
				}
			}
		}
		System.out.println("sum of three integer is Zero");
		System.out.println(+count);
	}

	/***************************************************************************************************/
	// stop watch implementation//
	/**
	 * @param s=start
	 *            time
	 * @param e=end
	 *            time
	 */
	public static void stopWatch(long startTime, long endTime) {
		startTime = System.nanoTime();
		System.out.println("Calculating time from" + startTime + "nano sec " + endTime + "micro sec");
		endTime = System.nanoTime();
		long total_time = endTime - startTime;
		System.out.println("Time measured is:" + " " + total_time + "nano sec");
	}

	/****************************************************************************************************/
	/**
	 * To find head and tail percentage
	 * 
	 * @param head
	 * @param tail
	 */
	public static void flipPercentage(double head, double tail, int flipnum) {
		int head_count = 0, tail_count = 0;
		for (int k = 0; k < flipnum; k++) {
			double random = Math.random();
			if (random < 0.5)
				tail_count++;
			else
				head_count++;
		}
		head = head_count / (double) flipnum * 100;
		tail = tail_count / (double) flipnum * 100;
		System.out.println(head_count);
		System.out.println(tail_count);
		System.out.println("Per of heads: " + head + "%");
		System.out.println("Per of tails: " + tail + "%");
	}

	/***************************************************************************************************/
	/**
	 * @param num
	 * @param ar
	 */
	public static void random(int num, int ar[]) {
		for (int i = 0; i < num; i++) {
			ar[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (ar[i] == ar[j]) {
					i--;
					break;
				}
			}
		}
	}

	/**
	 * @param arr
	 */
	public static void distinct(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean found = false;
			for (int j = 0; j < i; j++)

				if (arr[i] == arr[j]) {
					found = true;
					break;
				}
			if (!found)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
		;
	}

	/****************************************************************************************************/
	/**
	 * To find prime factor of a given number
	 * 
	 * @param num
	 */
	public static void primeFactor(int num) {
		while (num % 2 == 0) {
			System.out.println(2);
			num /= 2;
		}
		for (int i = 3; i * i <= num; i += 2) {
			while (num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
		if (num > 2)
			System.out.println(num);
	}

	/***************************************************************************************************/
	/**
	 * @param num
	 * @param stake
	 * @param goal
	 */
	public static void winPercentage(int num, int stake, int goal) {
		int bets = 0, wins = 0;
		for (int i = 0; i < num; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;
		}
		System.out.println("number of wins is" + wins);
		System.out.println("Percentage of game won" + " " + " " + (wins * 100 / num));
		// System.out.println("Percentage of game lost"+" "+" "+(100-c));
		System.out.println("Average bets:" + " " + bets / num);
	}

	/***************************************************************************************************/
	/**
	 * to find Nth Harmonic of given number
	 * 
	 * @param num
	 */
	public static void findHarmonic(int num) {
		double res = 0;
		if (num < 0)
			System.out.println("Invalid!!!!");
		for (double i = 1; i <= num; i++) {
			res = (1 / i) + res;
		}
		System.out.println("Nth harmonic value" + res);
	}

	/***************************************************************************************************/
	/**
	 * to find given year is leap year or not
	 * 
	 * @param year
	 */
	public static void findLeapYear(int year) {
		boolean flag = false;
		if (year < 1582) {
			System.out.println("the year should be grater than 1582");
		} else if (year % 400 == 0)
			flag = true;
		else if (year % 100 == 0)
			flag = false;
		else if (year % 4 == 0)
			flag = true;
		else
			flag = false;
		if (flag)
			System.out.println("Given year is leap year --" + year);
		else
			System.out.println("Given year is not leap year --" + year);
	}

	/****************************************************************************************************/
	/**
	 * @param base
	 * @param power
	 * @return
	 */
	public static int pow(int base, int power) {
		int result = 1;
		if (power == 0)
			return 1;
		else
			while (power > 0) {
				result = result * base;
				--power;
			}
		return result;
	}

	/***************************************************************************************************/
	/**
	 * To find square of a number
	 * 
	 * @param number
	 * @return
	 */
	public static double sqrt(double number) {
		double a = number * number;
		return a;
	}

	/***************************************************************************************************/
	/**
	 * @param temperature
	 * @param speed
	 */
	public static void findTemperature(double temperature, double speed) {
		if (temperature > 50 || speed < 3 || speed > 120) {
			System.out.println("Invalid data");
		} else {
			double a = Math.pow(speed, 0.16);
			double efftemperature = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * a;
			System.out.println("Effective temperature is" + efftemperature);
		}
	}

	/**************************************************************************************************/
	/**
	 * @param string1
	 * @param string2
	 * @return
	 */
	public static boolean isAnagram(String string1, String string2) {
		string1 = removeSpace(string1);
		string2 = removeSpace(string2);
		if (string1.length() != string2.length())
			return false;
		string1 = toLowerCase(string1);
		string2 = toLowerCase(string2);
		boolean b = check(string1, string2);
		return b;
	}

	/**
	 * @param string1
	 * @param string2
	 * @return
	 */
	private static boolean check(String string1, String string2) {
		char ch1[] = string1.toCharArray();
		char ch2[] = string2.toCharArray();
		ch1 = sort(ch1);
		ch2 = sort(ch2);
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i])
				return false;
		}
		return true;
	}

	/**
	 * @param ch
	 * @return
	 */
	private static char[] sort(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}

	/**
	 * @param string1
	 * @return
	 */
	private static String toLowerCase(String string1) {
		char ch[] = string1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 91)
				ch[i] = (char) (ch[i] + 32);
		}
		string1 = new String(ch);
		return string1;
	}

	/**
	 * @param string1
	 * @return
	 */
	private static String removeSpace(String string1) {
		char ch[] = string1.toCharArray();
		string1 = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ')
				string1 = string1 + ch[i];
		}
		return string1;
	}

	/**************************************************************************************************/
	/**
	 * to print prime numbers in the given range
	 * 
	 * @param start
	 * @param end
	 */
	public static void isPrime(int start, int end) {
		int flag = 0;
		for (int i = start; i <= end; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else
					flag = 1;
			}
			if (flag == 1)
				System.out.println(i);
		}
	}

	/***************************************************************************************************/

	/**
	 * to find whether the given number is prime or not
	 * 
	 * @param number
	 * @return
	 */
	public static boolean findPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * to check whether the given number is palindrome or not
	 * 
	 * @param number
	 */
	public static void isPalindrome(int number) {
		int temp = number, sum = 0;
		while (number > 0) {
			int res = number % 10;
			sum = sum * 10 + res;
			number = number / 10;
		}
		if (temp == sum) {
			System.out.println("Given number is palindrome" + " " + temp);
		}
	}

	/****************************************************************************************************/
	/**
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int week(int month, int day, int year) {
		int year0 = year - (14 - month) / 12;
		int x = year0 + year0 / 4 - year0 / 100 + year0 / 400;
		int month0 = month + 12 * ((14 - month) / 12) - 2;
		int day0 = (day + x + 31 * month0 / 12) % 7;
		return day0;
	}

	/***************************************************************************************************/
	/**
	 * To convert given celsius into fahrenheit
	 * 
	 * @param celvalue
	 */
	public static void celToFah(double celvalue) {
		double fahvalue = (celvalue * (double) (9 / 5)) + 32;
		System.out.println("Fahrenheit value is" + fahvalue);
	}

	/**
	 * To convert given fahrenheit to celsius
	 * 
	 * @param fahvalue
	 */
	public static void fahToCel(double fahvalue) {
		double celvalue = (fahvalue - 32) * (0.5556);
		System.out.println("Celsius value is" + celvalue);
	}

	/*************************************************************************************************/
	/*
	 * /** To search an element using binary search
	 * 
	 * @param searchelement
	 * 
	 * @param key
	 * 
	 * @return integer type
	 */
	/*
	 * public static int binarySearch(int[] inputArr, int key) { int start = 0; int
	 * end = inputArr.length - 1; while (start <= end) { int mid = (start + end) /
	 * 2; if (key == inputArr[mid]) { return mid; } if (key < inputArr[mid]) { end =
	 * mid - 1; } else { start = mid + 1; } } return -1; }
	 */

	/*
	 * /**
	 * 
	 * @param searchelement
	 * 
	 * @param key
	 * 
	 * @return string type
	 */
	/*
	 * public static int binarySearch(String[] names, String key) { int first = 0;
	 * int last = names.length;
	 * 
	 * while (first < last) { int mid = (first + last) / 2; if
	 * (key.compareTo(names[mid]) < 0) { last = mid; } else if
	 * (key.compareTo(names[mid]) > 0) { first = mid + 1; } else {
	 * System.out.println("value is found in loc" + mid); return mid; } }
	 * System.out.println("value is not present"); return -1; }
	 */

	/* Binary search using generics */
	/**
	 * @param names
	 * @param key
	 */
	public static <T extends Comparable<T>> void binarySearch(T[] names, T key) {
		int first = 0;
		int last = names.length;

		while (first < last) {
			int mid = (first + last) / 2;
			if (key.compareTo(names[(int) mid]) < 0) {
				last = mid;
			} else if (key.compareTo(names[(int) mid]) > 0) {
				first = mid + 1;
			} else {
				System.out.println("value is found in loc" + mid);
				return;
			}
		}
		System.out.println("value is not present");
		return;
	}
	/*
	 * /** To sort the given array using bubble sort
	 * 
	 * @param array
	 * 
	 * @return
	 */
	/*
	 * public static int[] bubbleSort(int[] array) { int temp = 0; for (int i = 0; i
	 * < array.length; i++) { for (int j = i; j < array.length; j++) { if (array[j]
	 * < array[i]) { temp = array[j]; array[j] = array[i]; array[i] = temp; } } }
	 * return array; }
	 */
	/*
	 * /**
	 * 
	 * @param array
	 * 
	 * @return
	 */
	/*
	 * public static String[] bubbleSort(String numbers[]) { String temp; for (int i
	 * = 0; i < numbers.length; i++) { for (int j = 1; j < (numbers.length - i);
	 * j++) { if (numbers[j - 1].compareTo(numbers[j]) > 0) { temp = numbers[j - 1];
	 * numbers[j - 1] = numbers[j]; numbers[j] = temp; } } } return numbers; }
	 */

	/**
	 * bubble sort using generics
	 * 
	 * @param numbers
	 * @return
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] numbers) {
		T temp;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < (numbers.length - i); j++) {
				if (numbers[j - 1].compareTo(numbers[j]) > 0) {
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;

	}

	/*
	 * /**
	 * 
	 * @param array
	 * 
	 * @return
	 */
	/*
	 * public static int[] insersionSort(int elements[]) { int temp; for (int i = 1;
	 * i < elements.length; i++) { for (int j = i; j > 0; j--) { if ((elements[j] -
	 * elements[j - 1]) < 0) { temp = elements[j]; elements[j] = elements[j - 1];
	 * elements[j - 1] = temp; } else break; } } return elements; }
	 * 
	 * public static String[] insersionSort(String[] array) { for (int i = 0; i <
	 * array.length; i++) { String key = array[i]; int j = i - 1; while (j >= 0) {
	 * if ((key.compareTo(array[j]) > 0)) { break; } array[j + 1] = array[j]; j--; }
	 * array[j + 1] = key; } return (array); }
	 */

	/**
	 * insersion sort using generics
	 * 
	 * @param array
	 * @return
	 */
	public static <T extends Comparable<T>> T[] insersionSort(T[] array) {
		for (int i = 0; i < array.length; i++) {
			T key = array[i];
			int j = i - 1;
			while (j >= 0) {
				if ((key.compareTo(array[j]) > 0)) {
					break;
				}
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
		return (array);
	}

	/**************************************************************************************************/
	/**
	 * @param principle
	 * @param year
	 * @param Rate
	 */
	public static void monthlyPay(double principle, double year, double Rate) {
		double n = 12 * year;
		double r = Rate / (12 * 100);
		double payment;
		payment = (principle * r) / (1 - Math.pow((1 + r), -n));
		System.out.println(payment);
	}

	/**************************************************************************************************/
	/**
	 * @param number
	 * @return
	 */
	public static String toBinary(int number) {
		String string = "";
		int power = 1;
		while (power <= number / 2)
			power *= 2;
		while (power > 0) {
			if (number < power)
				string += 0;
			else {
				string += 1;
				number -= power;
			}
			power /= 2;
		}
		return string;
	}

	/*****************************************************************************************************/
	/**
	 * To sort strings using merge sort
	 * 
	 * @param names
	 */
	public static void mergeSort(String[] names) {
		if (names.length > 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];
			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}
			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
			}
			mergeSort(left);
			mergeSort(right);
			merge(names, left, right);
		}
	}

	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}

	/*************************************************************************************************/
	/**
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public static boolean validDate(int day, int month, int year) {
		boolean b = true;
		if (((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) || (day > 31)
				|| (month == 2 && year % 100 == 0 && year % 400 != 0 && day > 28)
				|| (month == 2 && year % 400 == 0 && day > 29)
				|| (month == 2 && year % 100 != 0 && year % 4 != 0 && day > 28)
				|| (month == 2 && year % 100 != 0 && year % 4 == 0 && day > 29)) {
			b = false;
		} else {
			b = true;
		}
		return b;
	}

	/***************************************************************************************************/
	/**
	 * @param num
	 * @return
	 */
	public static boolean leap(int num) {
		if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0))// condition for leap year
			return true;
		else
			return false;
	}

	/****************************************************************************************************/
	/**
	 * @param deck
	 * @param RANK
	 * @param SUIT
	 * @return String[][]
	 */
	public static String[][] cardInitialize(String[][] deck, String[] RANK, String[] SUIT) {
		for (int i = 0; i < SUIT.length; i++) {
			for (int j = 0; j < RANK.length; j++) {
				deck[i][j] = SUIT[i] + "  - " + RANK[j] + "  ";
			}

		}
		return deck;
	}

	/**
	 * @param deck
	 * @param suitsize
	 * @param ranksize
	 * @return String[][]
	 */
	public static String[][] shuffleCards(String[][] deck, int suitsize, int ranksize) {
		for (int i = 0; i < suitsize; i++) {
			for (int j = 0; j < ranksize; j++) {
				int random = (int) (Math.random() * suitsize);
				int random1 = (int) (Math.random() * ranksize);
				String temp = deck[random][random1];
				deck[random][random1] = deck[i][j];
				deck[i][j] = temp;

			}
		}
		return deck;
	}

	/**
	 * @param deck
	 */
	public static void printCards(String[][] deck) {
		for (int i = 0; i < 4; i++) {
			System.out.println("** Person " + (i + 1) + " **");

			for (int j = 0; j < 9; j++) {
				System.out.println(deck[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*******************************************************************************************************/

	/**
	 * @param cards
	 * @param suitsize
	 * @param ranksize
	 * @return String[][]
	 * 
	 */

	public static String[][] shuffleCards(QueueUsingLinkedlist[] cards, int suitsize, int ranksize) {
		String[][] player = new String[suitsize][ranksize];
		int index = (int) (Math.random() * suitsize * ranksize);
		for (int i = 0; i < suitsize; i++) {
			for (int j = 0; j < ranksize; j++) {
				int index1 = (int) (Math.random() * suitsize * ranksize);
				if (!cards[index1].isEmpty()) {
					player[i][j] = (String) cards[index1].pop();

				} else
					j--;
			}
		}
		return player;
	}

	/**
	 * @param elements
	 */
	public static void sortPlayer(QueueUsingLinkedlist[] elements) {
		for (int i = 0; i < 4; i++) {
			System.out.println("** Person " + (i + 1) + " **");
			for (int j = 0; j < 9; j++) {
				System.out.println(elements[i].pop(0));
			}
			System.out.println();
		}

	}

	/**
	 * @param player
	 * @return QueueUsingLinkedlist[]
	 */
	public static QueueUsingLinkedlist[] distribute(String[][] player) {
		QueueUsingLinkedlist[] elements = new QueueUsingLinkedlist[52];
		for (int i = 0; i < 4; i++) {
			elements[i] = new QueueUsingLinkedlist();
			for (int j = 0; j < 9; j++) {
				elements[i].addSort(player[i][j]);
			}
		}
		return elements;

	}
}
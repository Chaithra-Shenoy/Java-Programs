
package com.bridgelabz.functional;

import java.util.Arrays;
/**
 * purpose Write a Program to play a Cross Game or Tic­Tac­Toe Game. Player 1 is
the Computer and the Player 2 is the user. Player 1 take Random Cell that is the
Column and Row.
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class CrossGame {
	static String[] board;
	static String turn;

	public static void main(String[] args) {
		int number = 0;
		System.out.println("please enter any number to start the game");
		number = Utility.scanner(number);
		board = new String[9];
		turn = "X";
		String winner = null;
		populateEmptyBoard();
		System.out.println("Welcome to A Player Tic Tac Toe.");
		System.out.println("--------------------------------");
		printBoard();
		System.out.println("COMPUTER will play first. Enter a slot number to place X in:");

		while (winner == null) {
			int numInput = 0;
			numInput = Utility.scanner(numInput);
			if (!(numInput > 0 && numInput <= 9)) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}

			if (board[numInput - 1].equals(String.valueOf(numInput))) {
				board[numInput - 1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				printBoard();
				winner = checkWinner();
			} else {
				System.out.println("Slot already taken; re-enter slot number:");
				continue;
			}
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing.");
		} else {
			System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
		}
	}

	// method to check the winner. It checks the lines
	static String checkWinner() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
				break;
			} else if (a == 8)
				return "draw";
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}

	// prints the board
	static void printBoard() {
		System.out.println("|-----------|");
		System.out.println("| " + board[0] + "  " + " " + board[1] + "   " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + "   " + board[4] + "   " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + "   " + board[7] + "   " + board[8] + " | ");
		System.out.println("|-----------|");
	}

	// method that takes values from 1 to 9 to print on board
	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}
	}
}
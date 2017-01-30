//*****************************************************************************/
//*****************************************************************************/
//
//
//      file: Schenck_AsciiArt.java
//      author: E. Schenck
//      class: CS 141 Intro to Programming 
//
//      assignment: Program 3
//      date last modified: 1/30/2017
//
//      purpose: Write a noninteractive program that reads in lines of text 
//		from a file then prints out the text with different transformations 
//		around the vertical, horizontal, and diagonal axis. The progrram will 
//		accomplish this by reading in the text as a rectangular blok of data
//		into a 2D array of characters (char[][]). The program will create 
//		only one 2D array and will not copy from one array to another.
//		The dimensions of the 2D array will be contained in the first line
//		of the input file, row first and then columns. 
//
//		After reading in the text from the file the program will "traverse" 
//		the rows and columns of the array (with nested for-loops) and print
//		out the array in the proper order to do the following transformations.
//
//		Original Text:
//		FILE
//		WITH
//		SOME
//		MORE
//		INFO
//
//		Transformations:
//		INFO
//		MORE
//		SOME
//		WITH
//		FILE
//
//		ELIF
//		HTIW
//		EMOS
//		EROM
//		OFNI
//
//		OEEHE
//		FRMTL
//		NOOII
//		IMSWF
//
//*****************************************************************************/
//*****************************************************************************/

import java.io.*;

import java.util.Scanner;

public class Schenck_AsciiArt
{

	public static void main(String[] args) throws IOException
	{
		
		// Declaring data types 
		String filename;
		String fileString = "";
		int counter = 0;
		int row, column;
		
		char[][] input;		// array of char to store asciiArt
		
		// String to hold file name 
		filename = "C://Users//Eric//Desktop//monalisa.txt";
		
		File file = new File(filename);
		Scanner fromFile = new Scanner(file);

		// gathers first two integers from file, which are row and column
		row = fromFile.nextInt();
		column = fromFile.nextInt();
		
		// saving info from file as one long string to access char easier
		while(fromFile.hasNext())
		{
			fileString += fromFile.nextLine();
		}
		
		// creating a 2D array of char
		input = new char[row][column];
		
		// for loop to handle data entry into array 	
		for(int r = 0; r < row; r++)
		{
			for(int c = 0; c < column; c++)			
			{
				input[r][c] = fileString.charAt(counter);
				counter++;
			}
		}
		
		// for loop to print out original Text 
		System.out.println("Original Text:");
		for(int r = 0; r < row; r++)
		{
			System.out.println();
			
			for(int c = 0; c < column; c++)
			{	
				System.out.print(input[r][c]);
			}
		}
		
		
		System.out.print("\n\nTransformations:\n\n");
		
		// for loop to print out first Transformation - Vertical 
		for(int r = row - 1; r > 0 ; r--)
		{
			System.out.println();
			for(int c = 0; c < column; c++)
			{
				System.out.print(input[r][c]);
			}
		}
		
		
		System.out.print("\n\n\n\n");
		
		// for loop to print out second Transformation - Horizontal
		for(int r = 0; r < row ; r++)
		{
			System.out.println();
			for(int c = column - 1 ; c > 0 ; c--)
			{
				System.out.print(input[r][c]);
			}
		}
		
		System.out.print("\n\n\n\n");
		
		// for loop to print out third Transformation - Diagonal
		for(int c = column - 1; c > 0; c--)
		{
			System.out.println();
			
			for(int r = row - 1; r > 0 ; r--)
			{
				System.out.print(input[r][c]);
			}
		}
		
		
	}
	
}


package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    //My only big criticism is the 2 scanners from the same place of input (only one is needed)

    private static ArrayList<String> bookTitles = new ArrayList<String>();
    private static Scanner bookInputScanner = new Scanner(System.in);
    private static Scanner addAnotherScanner = new Scanner(System.in);

    public static void main(String[] args) {

        try { //try|catch error check initiation
            boolean addNewBook = true;
            while (addNewBook == true) { //initiate a loop that continues until they want to stop adding books

                GetTitle();

                System.out.println("Would you like to add another book? Y/N");
                String addAnother = addAnotherScanner.next(); //assigns the answer for addAnother to the variable
                if (addAnother.equals("N")) {
                    addNewBook = false; //if they don't want to add another, end the loop.
                }

            }
            String titleList = bookTitles.toString();
            System.out.println(titleList);

            } catch(Exception e){
                System.out.println("An error has occurred!");//try|catch error check
                e.printStackTrace();
            }


        }
    public static void GetTitle() {

        try { //try|catch error check initiation

            System.out.println("Please add a book name");
            String bookInput = bookInputScanner.next(); //dumps the book title into the scanner
            bookTitles.add(bookInput); //dumps scanner contents into the array


        } catch (Exception e) {
            System.out.println("An error has occurred!");//try|catch error check
            e.printStackTrace();
        }

    }

}
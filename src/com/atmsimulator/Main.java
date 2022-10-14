package com.atmsimulator;

import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
int balance = 1000, amount = 100;
System.out.println("type withdraw to withdraw your money, or deposite to make a deposite: \n");
String command = scanner.next();
switch(command) {
case "deposite": balance += amount;
break;
case "withdraw": balance -= amount;
break;
default: System.out.println("unknown command");
break;
}
System.out.println("your balance used to be 1000, and now it is " + balance);
    }

}

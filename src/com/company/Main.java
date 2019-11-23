package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is our menu and prices just enter the number of packets bought");
        System.out.println("The price of milk is 44: ");
        Scanner input1= new Scanner(System.in);
        int milk =input1.nextInt();
        int tmilk= milk*44;
//accepts the number of packets of milk bought
        System.out.println("The price of honey is 162: ");
        Scanner input2= new Scanner(System.in);
        int honey =input2.nextInt();
        int thoney= honey*162;
//accepts the number of packets of honey bought
        System.out.println("The price of eggs is 357: ");
        Scanner input4= new Scanner(System.in);
        int eggs =input4.nextInt();
        int teggs= eggs*357;
//accepts the number of packets of eggs bought
        System.out.println("The price of Bread is 41: ");
        Scanner input5= new Scanner(System.in);
        int bread =input5.nextInt();
        int tbread= bread*41;
//accepts the number of breads bought
        System.out.println("The price of spinach is 42: ");
        Scanner input6= new Scanner(System.in);
        int spinach =input6.nextInt();
        int tspinach= spinach*42;
//accepts the number of spinachs bought
        System.out.println("The price of towel is 236: ");
        Scanner input7= new Scanner(System.in);
        int towel =input7.nextInt();
        int ttowel= towel*236;
//accepts the number of towels bought
        System.out.println("The price soda is 65: ");
        Scanner input8= new Scanner(System.in);
        int soda =input8.nextInt();
        int tsoda= soda*44;
//accepts the number of packets of milk bought
        int total1 =tmilk+thoney+teggs+tbread+tspinach+ttowel+tsoda;
        System.out.println("Customer should give " +total1);
//
        System.out.println("Enter amount Provided by customer: ");
        Scanner input9=new Scanner(System.in);
        int amount=input9.nextInt();
        //ensures the amount entered is equal to or more than the bill
        if (amount<total1){
            System.out.println("Not enough money couldn't complete transaction");

        }else {
            int change=amount-total1;

            int note1 = (change / 1000);
            int thousand = note1;

            int note2=change%1000;

            int five=note2 /500;
            int note3=note2%500;

            int hundred=note3/100;
            int note4=note3%100;

            int fifty=note4/50;
            int note5=note4%50;

            int twenty=note5/20;
            int note6=note5%20;

            int ten =note6/10;
            int note7= note6%10;

            int kobole =note7/5;
            int note8=note7%5;

            // outputs the number of notes in different denominations and the total change

            System.out.println(thousand +" thousand notes");
            System.out.println(five +" Five hundred notes");
            System.out.println(hundred +" one hundred notes");
            System.out.println(fifty +" fifty shilling notes");
            System.out.println(twenty +" twenty shilling notes");
            System.out.println(ten +" ten shiling notes");
            System.out.println(kobole +" five shiling notes");
            System.out.println(note8 +" one shilling notes");
            System.out.println("The total change should amount to " +change);
        }
    }
}

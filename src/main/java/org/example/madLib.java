/*
 *  UCF COP3330 Fall 2021 madLib Class file
 *  Copyright 2021 Celina Alzenor
 */
package org.example;

import java.util.Scanner;

public class madLib
{
    String noun;
    String verb;
    String adjective;
    String adverb;
    String friend;

    //constructor... gets user input
    public madLib()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        this.noun = scan.nextLine();

        System.out.print("Enter a verb: ");
        this.verb = scan.nextLine();

        System.out.print("Enter an adjective: ");
        this.adjective = scan.nextLine();

        System.out.print("Enter an adverb: ");
        this.adverb = scan.nextLine();

        System.out.print("Enter a name for your friend: ");
        this.friend = scan.nextLine();
    }

    //inserts user input into story
    public void storyTime()
    {
        System.out.println("You and "+this.friend+" are in the park and you see a mysterious figure in the lake. You both go towards it and it grabs "
                +this.friend+" and pulls them into the murky lake water. \nIn a panic, you dive into the water to go after "+this.friend+". " +
                "\n\nAll of a sudden, the mysterious figure appears and when you look closer it turns out to be a "+this.noun+"!. " +
                "The "+this.noun+" looks at you and you jump when you notice how "+this.adjective+" it is. \nYou demand that it hands over "+this.friend+" but" +
                " unfortunately it already ate them! Quickly, you "+this.adverb+" swim up to the surface and never went back to the park again!");
    }
}

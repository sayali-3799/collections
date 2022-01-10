package com.te.collection1;
import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Random;
	import java.util.Scanner;

	public class User {

		public void display(HashSet songList) {
			Iterator iterator = songList.iterator();
			for (Object x : songList) {
				System.out.println("* "+x);
			}

		}

		public static void main(String[] args) {
			int count=0;
			String song;
			Scanner sc = new Scanner(System.in);
			Multiplayer multiplayer = new Multiplayer();
			User user = new User();
			HashSet songList = new HashSet<String>();
			String option;
			songList.add("boom boom pow");
			songList.add("moon light");
			songList.add("great spirit");
			songList.add("angel from above");
			songList.add("masakali");
			songList.add("yaakinge");
			songList.add("old town road");																					
			songList.add("talking to the moon");
			songList.add("talking to the moon");
			ArrayList arraylist = new ArrayList(songList);
			do {
			System.out.println("Type the action that you want:\n->play\n->search\n->add\n->delete\n->display\n->exit");
			option = sc.next();
			switch (option) {
			case "search": {
				System.out.println("Enter the song that you want to search");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.search(arraylist, song);
				
				break;
				
			}
			case "play": {
				System.out.println("Enter the song that you want to play");
				sc.nextLine();
				song = sc.nextLine();
				
				multiplayer.Play(arraylist, song);
				
				break;

			}
			case "add": {
				System.out.println("enter the song that you want to add");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.addSong(songList, song);
				System.out.println("======Song List=====");
				user.display(songList);
			
				break;
				

			}
			case "delete": {
				System.out.println("Enter the song that you want to delete");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.delete(songList, song);
				System.out.println("======Song List======");
				user.display(songList);
				
				break;
				

			}
			case "display":{
				System.out.println("======Song List======");
				user.display(songList);
				System.out.println("=======================");

				break;
				
			}
			case "exit":{
				count++;
				break;
			}
				
			default:{	
				System.out.println("Please type the option listed below");
				main(null);
			}
				
			}
			}while(count==0);
			}

		}



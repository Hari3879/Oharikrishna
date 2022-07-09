package com.java.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheaterDAOImpl implements TheaterDAO {
	public static List<Theater> originaList = new ArrayList<Theater>();
	public static List<Theater> templist = new ArrayList<Theater>();

	static Scanner sc = new Scanner(System.in);
	Theater Theater = null;
	int n = 1;
	String msg = "";

	@Override
	public void AddTheater() {
		while (n == 1) {
			Theater = new Theater();
			System.out.println("enter theater id");
			Theater.setTheaterID(sc.nextInt());
			System.out.println("enetr thater name");
			Theater.setTheaterName(sc.next());
			System.out.println("enetr thater capacity");
			Theater.setTheaterCapacity(sc.nextInt());
			System.out.println("enetr thater type");
			Theater.setTheaterType(sc.next());
			System.out.println("enetr thater location");
			Theater.setTheaterLocation(sc.next());
			originaList.add(Theater);
			System.out.println("you want to add more thater enter 1");
			n = sc.nextInt();
		}
	}

	@Override
	public Theater viewTheater(int theaterID) {
		Theater = new Theater();
		for (Theater searchTheater : originaList) {
			if (searchTheater.getTheaterID() == theaterID) {
				Theater = searchTheater;
				break;
			}
		}
		return Theater;

	}

	@Override
	public void Updatetheater(int theaterID) {
		templist = new ArrayList<Theater>();
		for (Theater updateTheater : originaList) {
			if (updateTheater.getTheaterID() == theaterID) {
				System.out.println("1.theatername  2.theatercapacity 3.theatertype 4.theaterlocation ");
				int choice = sc.nextInt();
				switch(choice){
				case 1:
				System.out.println("change theatername");
				updateTheater.setTheaterName(sc.next());
				case 2:
					System.out.println("change theater capacity");
					updateTheater.setTheaterCapacity(sc.nextInt());
				case 3:
					System.out.println("chanage theater type");
					updateTheater.setTheaterType(sc.next());
				case 4:
					System.out.println("change the location");
					updateTheater.setTheaterLocation(sc.next());
				case 5:
					System.exit(0);
					break;		 
				}		
			}
			System.out.println("updated list of theater");
			templist.add(updateTheater);
		}
	}
	@Override
	public List<Theater> viewallTheater() {
		return originaList;
		

	}

	@Override
	public void deleteTheater() {
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub

	}

}

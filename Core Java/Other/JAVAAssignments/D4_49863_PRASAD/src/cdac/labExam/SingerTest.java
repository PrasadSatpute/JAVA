package cdac.labExam;

import java.util.ArrayList;
import java.util.Scanner;

import javax.management.relation.InvalidRelationIdException;

public class SingerTest {

	static Scanner sc = new Scanner(System.in);
	
	ArrayList<Singer> singers = new ArrayList<Singer>();
	
	void menuDriven() {
		System.out.println("1.Add Singer");
		System.out.println("2.Remove Singer");
		System.out.println("3.Modify Singer's rating");
		System.out.println("4.Search Singer by name");
		System.out.println("5.Sort Singer by name");
		System.out.println("6.Display All Singer");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			try {
			
				addSinger();
				
			}
			catch (Exception e) {
				System.out.println("Pleas Add Valid Rating");
			}
			
			break;
		case 2:
			removeSinger();	
			break;
		case 3:
			try {
				
				updateSingerRating();
				
			}
			catch (Exception e) {
				System.out.println("Pleas Add Valid Rating");
			}
			break;
		case 4:
			searchSinger();
			break;
		case 5:
			sortSingerByName();
			break;
		case 6:
			displayAllSinger();
			break;
			
		default:
			System.out.println("Invalid Case");
			break;
		}
	}
	
	void addSinger() throws InvalidRatingExeption {
		Singer singer = new Singer();
		System.out.println("Enter Singer Name : ");
		sc.nextLine();
		singer.name = sc.nextLine();
		System.out.println("Enter Gende M or F : ");
		singer.gender = sc.nextLine();
		System.out.println("Enter Age : ");
		singer.age = sc.nextInt();
		System.out.println("Enter Email_id : ");
		sc.nextLine();
		singer.email_id = sc.nextLine();
		System.out.println("Enetr Contact : ");
		singer.contact = sc.nextLine();
		System.out.println("Enetr Rating : ");
		singer.rating = sc.nextInt();
		if(singer.rating > 5) {
			throw new InvalidRatingExeption();
		}
		else {
			singers.add(singer);
		}
	}
	
	void removeSinger() {
		System.out.println("Enter Singer Name That You Want to Remove : ");
		String singerName = sc.nextLine();
		singers.removeIf(singer -> singer.name.contains(singerName));
	}
	
	void updateSingerRating() throws InvalidRatingExeption {
		System.out.println("Enter Singer Name that You Want to Upadate Rating :  ");
		String SingerName = sc.nextLine();
		System.out.println("Enter Rating : ");
		int rating = sc.nextInt();
		if(rating > 5) {
			throw new InvalidRatingExeption();
		}
		else
		{
			System.out.println("Enter Singer Name That You Want to Upadate Rating : ");
			String singerName = sc.nextLine();
			ArrayList<Singer> filterSinger = (ArrayList<Singer>) singers.stream().filter(singer -> singer.name.equals(singerName));
			if(filterSinger.size() > 0) {
				filterSinger.get(0).rating = rating;
			}
		}
	}
	
	void searchSinger() {
		
		System.out.println("Enter Singer Name That You Want to Search : ");
		String singerName = sc.nextLine();
		ArrayList<Singer> filterSinger = (ArrayList<Singer>) singers.stream().filter(singer -> singer.name.equals(singerName));
		for(Singer singer: filterSinger) {
			singer.toString();
		}
	}
	
	void sortSingerByName() {
		singers.sort((s1, s2) -> s1.name.compareTo(s2.name));
		for(Singer singer: singers) {
			singer.toString();
		}
	}
	
	void displayAllSinger() {
		for(Singer singer: singers) {
			singer.toString();
		}
	}
	
	public static void main(String[] args) {
		SingerTest st = new SingerTest();
		st.menuDriven();
	}

}

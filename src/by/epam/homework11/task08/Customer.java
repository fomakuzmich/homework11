package by.epam.homework11.task08;

import java.util.Arrays;

public class Customer implements Comparable<Customer>{
	
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private long card;
	private long account;
	
	private static int counterForId = 0;
		
	public Customer(String surname, String name, String patronymic, String adress, long card, long account) {
		this.id = ++counterForId;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.adress = adress;
		this.card = card;
		this.account = account;
	}
	public int getId() {
		return id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getCard() {
		return card;
	}
	public void setCard(int card) {
		this.card = card;
	}
	public long getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
	
	
	@Override
	public String toString() {
		return "id=" + id + ", " + surname + " " + name + " " + patronymic
				+ ", " + adress + ", card=" + card + ", account=" + account;
	}
	public static void getCustomersABC(Customer[] customers) {
		Arrays.sort(customers);
		for (Customer x : customers) {
			System.out.println(x.toString());
		}
	}
	
	public static void getCustomersFromCard(Customer[] customers, long x, long y) {
		for (Customer c : customers) {
			if (c.card >= x && c.card <= y) {
				System.out.println(c);
			}
		}
	}
	
	@Override
	public int compareTo(Customer c) {
		
		return this.surname.compareTo(c.getSurname());
	}
	

}

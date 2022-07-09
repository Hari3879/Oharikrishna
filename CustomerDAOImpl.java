package com.java.movie;

import java.util.Scanner;

class CustomerDAOImpl implements CustomerDAO {
	Scanner sc = new Scanner(System.in);
	Customer Customer = null;

	@Override

	public void name() {
		Customer = new Customer();
		// System.out.println("enetr name");
		Customer.setName(sc.next());

	}

	@Override
	public void age() {
		Customer = new Customer();
		// System.out.println("enetr age");
		Customer.setAge(sc.nextInt());

	}

	@Override
	public void mobileNum() {
		Customer = new Customer();
		// System.out.println("enetr mobile num");
		Customer.setMobileNum(sc.nextInt());

	}

	@Override
	public void ReqSeats() {
		Customer = new Customer();
		// System.out.println("enter required seats");
		Customer.setReqSeats(sc.nextInt());

	}

}

package service;

import datastr.MyBST;

public class MainService {

	public static void main(String[] args) {
		MyBST<Integer> bstForInt = new MyBST<Integer>();
		try
		{
			bstForInt.add(23);
			bstForInt.add(35);
			bstForInt.add(20);
			bstForInt.add(22);
			bstForInt.add(6);
			bstForInt.add(77);
			bstForInt.add(21);
			bstForInt.add(34);
			bstForInt.add(50);
			bstForInt.print();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}

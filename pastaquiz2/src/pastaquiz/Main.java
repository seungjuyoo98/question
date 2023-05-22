package pastaquiz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Pasta pasta = new Pasta("오우주");
		pasta.orderInfo();
		System.out.println();
		pasta.addNoodle();
		pasta.addGarlic();
		System.out.println();
		pasta.orderInfo();
		

	}

}

package pastaquiz2;

public class Pasta {
	
	private final String guest;
	private int price;
	private PastaOption pastaOption;
	boolean isNoodleAdded;
	boolean isGarlicAdded;


	Pasta(String guest, PastaOption pastaOption ){
		this.guest = guest;
		this.pastaOption = pastaOption;
		this.price = pastaOption.getprice();
	}

	public void orderInfo() {
		if(isNoodleAdded) {
			 System.out.println("면이 추가 되었습니다.(+1000원)");
		}
		if(isGarlicAdded) {
			 System.out.println("마늘이 추가 되었습니다.(+2000원)");
		}
		System.out.println("주문자: " + guest);
		System.out.println("파스타 가격: " + price);
	}

	public void addNoodle() {	   
		if(isNoodleAdded) {
		} else {
			price+=1000;
			isNoodleAdded= true;
		}
	}
	
	public void addGarlic() {	
		if(isGarlicAdded) {
		} else {
			price+=2000;
			isGarlicAdded= true;
		}
	}
}	

import java.util.Scanner;

public class CarExample {
	static class Car{ //중첩class
		
	}
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello"); //string, array, enum 빼고는 모두 "new"로 만들어야 한다
		                                   // new로 만드는데 제거는? jvm이 이 인스턴스를 참조(레퍼런스)하는 카운트를 하다가 카운트가 0인 넘을 찾아
		                                   // GC(가비지컬렉터)가 삭제한다
		Car c1 = null;
		Car c2 = new Car(); // 인스턴스화  힙에 만들고 그 참조 주소가 c2에 저장, 레퍼런스 카운터 "1"이 되어 삭제되지 않는다
		Car c3 = new Car();
		c2 = null;          // 레퍼런스 카운터가 0이 되므로 GC가 주기적으로 확인할 때 삭제된다
	}
	public static void main2(String[] args) {
		System.out.println("Hello OOP!");
		Math.random();
		Scanner scan = null;
		
		
	}

}

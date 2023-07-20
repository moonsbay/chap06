
public class AlphaExample {
	
	static class Alpha{
		int fg;     //30-37           //힙에 저장, 자동초기화 된다 로컬변수는 반드시 초기화 필요
		int bg;     //40-47           //상동
		char ch;    //A-Z           //상동
		
	    
		public Alpha() {
			fg = (int)(Math.random()*8+30);
			bg = (int)(Math.random()*8+40);
			ch = (char)(Math.random()*26 + 'A');
//			System.out.println("Alpha()...");
		}
		void show() {
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.print(ch);                   //println으로 하면 전혀 다른 결과
			System.out.print("\033[0m");
//			System.out.printf("[%d, %d, %c]\n", fg, bg, ch);
		}
		void hide() {
//			int num;                   자동초기화 안됨.. 로컬변수(임시변수임) 초기화 필요
//			System.out.println(num);
			
		}
	}
	
	static class A{
		
		   public A() {
			   // A(a) : a매개변수  A(3) : '3'은 아규먼트..(넘겨주는 값)
		   }
		   public A(int fg) {      // 오버로딩(중복정의) 매개변수의 개수 차이로 가능, 오버로딩은 생성자와 메소드만 가능
			   
		   }
		   public A(int fg, int bg) {  //오버로딩 가능 매개변수의 개수 차이로 가능
			   
		   }
           public A(long fg, int bg) {  //오버로딩 가능 매개변수의 타입 차이로 가능
			   
		   }
           public A(int bg, long fg) {  //오버로딩 가능 매개변수의 순서 차이로 가능
			   
		   }
		   
	}
	public static void main(String[] args) {
		A a = new A();                           //  class A에 생성자 정의 없어도 자바가 매개변수없는 A()기본생성자를 자동 생성해줘서 에러 없음 
		                                         //  지금은 클래스에 정의가 있으므로 자동생성해주지 않으므로 에러가 발생
		A a2 = new A(30);
	}
    public static void main3(String[] args) {
    	
    	for(int i=0; i<10; i++) {
    		for(int j=0; j<20; j++) {
    			Alpha a = new Alpha();
    			a.show();
    		}
    		System.out.println();
    	}
	
}
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Program Start");
		Alpha a1 = new Alpha();   //생성자
		Alpha a2 = new Alpha();
		a1.show();
		a2.show();
		
		System.out.printf("\033[0m");
//		System.out.println("Program End");
	}

}

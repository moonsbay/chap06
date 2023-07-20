
public class StaticMemberExample {
    static class Alpha{
    	static int count;    //스태틱필드(정적멤버) , Alpha가 로딩될 때 메소드영역에 코드와 함께 만들어진다 딱 한개만 생성 가능
    	                     //  Alpha class가 살아있는 한 소멸 안 됨, 자바에서는 이탤릭체로 static이라는 것을 표시해 줌
    	                     // 자동초기화 됨
    	int cnt;
    	int line;            // 인스턴스필드 (인스턴스멤버) 
    	int column;
    	int fg;
    	int bg;
    	char ch;
    	
    	static {                 //static블럭 매소드 영역에 Alpha class가 로딩 될 때 수행  Alpha class를 초기화할 수 있음
    	    System.out.println("#######################");
    	    System.out.println("Alpha...........");
    	    System.out.println("#######################");
    	    System.out.println(count);
//    	    System.out.println(line);       static{}이 수행될 때 line은 존재 안함
    	}
    	
    	
    	public Alpha() {
    		Alpha.count++;       //알파생략가능
    		this.cnt++;          //this생략가능
    	}
    	
    	void show() {
    		System.out.println(Alpha.count); 
    		System.out.println(this.bg);
    		
    		
    		int num = 10;     //로컬변수.. show()를 콜하면 생성되고 "}" 만나서 바로 소멸  스택에 생성
    		
    	}
    	void hide() {
    		
    	}
    	
    	static void clearScreen() {   //static 매소드
    		System.out.println("clear Screen");
 //   		System.out.println(this.bg);               static은 this사용불가 참조를 못함
    		System.out.println(count);
 //   		System.out.println(line);                 
    	}
    }
	public static void main(String[] args) {
	//	Alpha.count = 10;      // 바로 count사용가능
		Alpha.clearScreen();   // 바로 사용 가능.. 인스턴스 없어도 사용 가능
		
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();
		
		System.out.println(a1.cnt);
		System.out.println(a2.cnt);
		System.out.println(a3.cnt);
		System.out.println(Alpha.count);
		
		
	}

}

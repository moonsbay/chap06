
public class FinalExample {
	static class Alpha{
		final static double PI = 3.141592;   // static final로 순서가 바뀌어도 된다, 이것을 "상수"라고 한다
	    final int line;          //final(인스턴스) 필드는 반드시 초기화 해야한다. 여기서 아니면 생성자에서, 이것은 "final 필드"라고 위의 상수와 구별한다
		int column;
	
	public Alpha() {
		line = 10;
		column = 20;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a = new Alpha();
//		a.line = 20;
		a.column = 30;
		
//		Alpha.PI = 4.12;          final은 변경 불가
		System.out.println();
	}

}

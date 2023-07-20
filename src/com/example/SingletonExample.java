package com.example;

class Oracle{
	
	private static Oracle instance = new Oracle();
	private Oracle() {
		
	}
	
	public static Oracle getInstance() {
		return instance;       //상기 instance생성 명령이 static이어야만 된다
	}
}


public class SingletonExample {

	public static void main(String[] args) {
		
 //에러     Oracle o = new Oracle();    // 생성자가 private이므로 
		
		Oracle o1 = Oracle.getInstance();
		Oracle o2 = Oracle.getInstance();
		
		System.out.println(o1 == o2);    //true가 나왔다
	
	}

}

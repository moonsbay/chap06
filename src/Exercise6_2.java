public class Exercise6_2{

 static      class SutdaCard{
    	int vnum = (int)(Math.random()*9 + 1);
    	boolean isKwang;
    	SutdaCard(int num, boolean isKwang){
    		System.out.println(this.vnum);
            this.vnum = num - this.vnum; //(int)(Math.random()*9 + 1);   //this는 생성자 안에서만 사용가능 그것도 첫줄에서만 사용가능
 //   		num = this.num;
    		if(this.isKwang == true)
    			isKwang = this.isKwang;
    		else 
    			isKwang = false;
    		
    	}
    	void info(){
    		int i = vnum;
    		boolean bo = isKwang;
    		System.out.printf("%d, %b", i ,bo);
    	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card1 = new SutdaCard(3, false);
//		SutdaCard card2 = new SutdaCard();
//		System.out.println(card1.info());
//		System.out.println(card2.info());
		
		card1.info();
		
	}


}
	
/*	class Exercise6_2 {
		public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		}
		}
		class SutdaCard {
*/
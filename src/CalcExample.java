
public class CalcExample {
    static class Calc{
    	int n1;
    	int n2;
    public Calc(int n1, int n2) {
    		this.n1 = n1;
    		this.n2 = n2;
    	}
    
    int add() {                               //반드시 int를 리턴하는 리턴이 있어야 한다
    	return n1 + n2;
    }
    
    int add(int n3) {
    	return add() + n3;
    }
    
    int add(int n3, int n4) {
    	return add(n3) + n4;
    }
    
    int add(int ...nums) {                   
    	return 0;
    }
    
    int sum(int ...nums) {    // 가변 배개변수
    	
    	int sum = 0;
    	for(int n : nums)
    		sum += n;
    	return sum + n1 + n2;
    }
    
    void print() {
    	return;                               //void 리턴으로 구지 리턴 없어도 됨
    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calc c1 = new Calc(10,20);
        Calc c2 = new Calc(3,5);
        
        System.out.println(c1.add()+10);
        c2.sum(10, 5, 6, 9, 10);
        c2.sum(10, 5);
        c2.sum(10, 5, 6, 9 ,10 ,20 ,45 ,80);
        
        System.out.println(c2.sum(10,5,6,9,10));
        System.out.println(c2.sum(10,5));
        System.out.println(c2.sum(10,5,6,9,10,20,45,80));
        
        int[] nums = {1,2,3,4};
        System.out.println(c2.sum(nums));
        
	}
    
    
}

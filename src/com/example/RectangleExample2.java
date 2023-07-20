package com.example;

import util.Alpha;

import util.VT100;

public class RectangleExample2 {
        public static void main(String[] args) throws InterruptedException {
		
		VT100.clearScreen();
		char[][] full = new char[20][40];
//		full = null;
		boolean tf = false;
/*		for(;;) {
			int count = 1;
			Alpha a = new Alpha();
			a.show();
			for(int i=0; i<20 ; i++)
				for(int j=0; j<40; j++)
                  if(i==a.Rline()-1 && j==a.Cline()-1)
                	  full[i][j] = full[a.Rline()-1][a.Cline()-1];
			for(int i=0; i<20 ; i++)
				for(int j=0; j<40; j++)
					if(full[i][j] == 0)
						tf = true;
			VT100.reset();
			VT100.cursorMove(1,  42);
			System.out.printf("count = [%05d]", count);
			count += 1;
//			char[][] full = new char[20][40];
//			full = null;
//			Alpha a = new Alpha();
			full[a.Rline()][a.Cline()] = a.Cari();
			
//					else tf = false;
			if (tf == false)
				break;
		}*/
		
		for(int i=0; i<1000; i++){
		
			Alpha a = new Alpha();
			a.show();
			VT100.reset();
			VT100.cursorMove(1,  42);
			System.out.printf("count = [%05d]", i);
			
			Thread.sleep(5);
		}  
		
		VT100.reset();  
	}
}

package com;

public class Test {

	public static void main(String[] args) {
		int gj,mj,xj=0;
		for(gj=0;gj<=19;gj++){
			for(mj=0;mj<=33;mj++){
				xj=100-gj-mj;
				int p=xj%3;
				if(((gj*5+mj*3+xj/3)==100) && (p==0)){
					System.out.println("gj:"+gj+",mj:"+mj+",xj:"+xj);
				}
			}
		}
		
		for(int i=0;i<100;i++){
			if(i%3==1 && i%7==5 && i%5==0){
				System.out.println(i);
			}
		}
	}

}

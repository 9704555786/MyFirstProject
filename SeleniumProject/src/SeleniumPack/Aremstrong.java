package SeleniumPack;

public class Aremstrong {
	
		public static void main (String []args){

			int n = 153,c,r;int sum=0;
			 c=n;
			while(n>0){
				r=n%10;
				sum=(r*r*r)+sum;//153=(1*1*1)+(5*5*5)+(3*3*3)
				
				n=n/10;
		}
			if (c==sum)
			System.out.println(sum);
		}
		}





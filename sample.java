package types;

public class samole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,largest;
		a=10;
		b=7;
		largest=(a>b)?a:b;
		System.out.println("the lagest of "+a+"and is "+b+"is"+ largest);
		
		int f,s,c,largest1;
		f=10;
		s=12;
		c=5;
		largest1=(f>s && f>c)?f:(s>f && s>c)?s:c;
		System.out.println("the lagest of "+f+","+s+"and"+c+"is"+ largest1);
		
		
		int q,w,e,r,larg;
		q=3;
		w=5;
		e=8;
		r=7;
	      
		larg=(q>w && q>e && q>r)?q:(w>q && w>e && w>r)?w:(e>q && e>w && e>r)?e:r;
		System.out.println("the largest number is "+q+","+w+","+e+"and"+r+"is"+larg);


	}

}

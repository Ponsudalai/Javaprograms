package edu.com;

class Addtition{
	void add(int i,int j) {
		int s;
		s=i+j;
		System.out.println("sum of 2 int values "+i+" and "+j+" is="+s);
	}
	void add(short i,short j) {
		short s =0; 
			s=	(short)(i+j);
			System.out.println("sum of 2 short values "+i+" and "+j+" is="+s);
		}
	void add(float i,float j) {
		float s;
		s=i+j;
		System.out.println("sum of 2 float values "+i+" and "+j+" is="+s);
	}
	void add(double i,double j) {
		double s;
		s=i+j;
		System.out.println("sum of 2 double values "+i+" and "+j+" is="+s);
	}
	void add(byte i,byte j) {
		byte s =0;
		s=(byte)(i+j);
			System.out.println("sum of 2 byte values "+i+" and "+j+" is="+s);
		}
	void add(long i,long j) {
		long s =0;
		s=(long)(i+j);
			System.out.println("sum of 2 long values "+i+" and "+j+" is="+s);
		}	
}

public class AdditionMain {

	public static void main(String[] args) {
		Addtition ps=new Addtition();
		ps.add(4, 7);
		ps.add(34.5f, 45.3f);
		ps.add(123, 321);
		ps.add((short)9,(short) 4);
		ps.add((byte)34,(byte) 43);
		ps.add(4l, 4l);
	}

}

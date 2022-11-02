package edu.com;

class AreaFigure {
	
	void area (int l) {
		int s;
		s=l*l;
		System.out.println("The Area Of Sqare "+l+" Area Is="+s) ;
	    }
    void area(int l,int b) {
		int s;
		s=l*b;
		System.out.println("The Area Of Rectangulaer lenth="+l+" Breath Is "+b+ " Area  Is="+s) ;
		}
	void area(float r) {
			float s;
			s=3.14285f*r*r;
			System.out.println("The Area Of Circle Radiues="+r+" Area Is="+s) ;
		}

	
}
	
	
public class AreaMain {

	public static void main(String[] args) {
		
		AreaFigure ps=new AreaFigure();
		ps.area(4);
		ps.area(4, 5);
		ps.area(5f);
	}

}

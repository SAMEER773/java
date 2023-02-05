package ForLoopWithBreak;

public class pgm_15 {
	public static void main(String[] args) {
		

		
	int [] year={2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};
	 
	for(int i=1; i<year.length; i++) {
		
		if(year[i]%4==0) {
			System.out.println(year[i]);
			
			}
		
		if(i==8) {
			break;
		}
			
		}
		
	}

}



package Project1;

import java.util.ArrayList;

	public class Network                              //creating class Network
		{
		   int networkID;                            //declaring NetworkID of type Integer
		    
		   /*creating list of lines and stopareas*/
		    ArrayList<Line> lneID = new ArrayList<Line>();
		    ArrayList<StopArea> stpAr = new ArrayList<StopArea>();
		    
		    public Network( int nID)            //creating constructor Network
			{
				networkID = nID;         //reserve word 'this'used as local and instance variables have same name NetworkID
			}  
		    
		    /* creating methods and returning their values*/
		    public int getNetworkID()
		     {
		    	 return networkID;
		     }
		    
			 public ArrayList<Line> ln()
			 {
				return lneID;
				
			 }
			 
			 public ArrayList<StopArea> StpAre()
			 {
				 return stpAr;
			 }
	}


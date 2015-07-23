package Project1;

import java.util.ArrayList;

	public class Line                            //creating class Line
		{
		  int lineID;                            //declaring LineID of type Integer
		  int networkID;                         //declaring LineID of type Integer
			
	       ArrayList<Route>rte= new ArrayList<Route>(); //creating list of routes
			
		    public Line (int lneID, int netID )       //creating constructor Line
			{
				lineID = lneID;                  	//reserve word 'this' used,as local and instance variables have same name LineID
				networkID = netID ;           	   //reserve word 'this' used,as local and instance variables have same name LineID
			}
			
		   /* creating methods and returning their values*/
		    public int getLineID()         
			{
	        	return lineID;
			}
	        
	        public int getNetworkID()
	        {
	        	return networkID;
	        }
	        
	        public ArrayList<Route> getRouteID()
	        {
	        	return rte;
	        }
	         
	      
      }


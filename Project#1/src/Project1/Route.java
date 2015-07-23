package Project1;

import java.util.ArrayList;

		public class Route                                  //creating class Route
		       {
		         int routeID;                               //declaring RouteID of type integer
				 int networkID;                             //declaring NetworkID of type integer
				 int lineID;
				 
				 ArrayList <LinkOnRoute> lnkOnRoute = new ArrayList<LinkOnRoute>();
				 ArrayList <StopArOnRoute> stpArOnrt = new ArrayList<StopArOnRoute>();
				 
			    public Route(int nID, int lnID, int rtID)    //creating constructor Route
			    {
			    	routeID = rtID;                 //reserve word 'this' used,as local and instance variables have same name RouteID
			   	 	networkID = nID ;           	//reserve word 'this' used,as local and instance variables have same name NetworkID
			   	    lineID = lnID;
			    }
			    	
			    
					//creating methods to return their values
			        public int getNetworkID()
					{
					  return networkID;
					}
			        
			        public int getRouteID()
			        {
			          return routeID;
			        }
			        
			        public int  getLineID()
			        {
			          return lineID;
			        }
			        
			        public ArrayList<LinkOnRoute> getLinkOnRouteID()
			        {
			          return lnkOnRoute;
			        }
			        
			        public ArrayList<StopArOnRoute> getStparOnRt()
			        {
			           return stpArOnrt;
			        }
		            
			}

		

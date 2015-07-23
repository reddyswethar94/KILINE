package Project1;

		public class StopArOnRoute             //creating class StopOnLine
		{
			//declaring instances of the class
			int lineID;
			int networkID;
			int stopAreaID;
			int routeID;
			int stopointID;
	 
			//creating parameterized constructor
			public StopArOnRoute(int lineID,int networkID,int stopAreaID,
					int routeID,int stopointID)
			{
		    this.lineID = lineID;
			this.networkID = networkID;
			this.stopAreaID = stopAreaID;
			this.routeID = routeID;
			this.stopointID = stopointID;
			}
			
			 /* creating method and returning its value*/
			   public int getLineID()
				{
				return lineID;
				}
		        
		        public int getRouteID()
		        {
		         return routeID;
		        }
		       
		        public int getStopAreaID()
		        {
		         return stopAreaID ;
		        }
		        
		        public int getNetworkID()
				{
				return networkID;
				}
		        
		        public int getStopPointId()
		        {
					return stopointID;
		        	
		        }
		     }

	

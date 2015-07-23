package Project1;

		public class StopPoint   //creating class StopPoint
		{
				//declaring variables of type Integer
				int StopPointID;                                  
				int NetworkID;
				int StopAreaID;
				int PointID;
				
		
				//creating parameterized constructor
				public StopPoint(int StopPointID,int NetworkID, int StopAreaID,int PointID) 
				 {
				 //reserve word 'this' used,as local and instance variables have same name
				 this.StopPointID = StopPointID;
				 this.NetworkID = NetworkID;
				 this.StopAreaID = StopAreaID;
				 this.PointID = PointID;
				 }
		
				 /* creating method and returning its value*/
			    public int getStopPointID()
				{
				return StopPointID;
				}
		        
		        public int getPointID()
		        {
		         return PointID;
		        }
		       
		        public int getStopAreaID()
		        {
		         return StopAreaID ;
		        }
		        public int getNetworkID()
				{
				return NetworkID;
				} 
			
			}  

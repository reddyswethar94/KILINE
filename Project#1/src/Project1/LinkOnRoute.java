package Project1;

		public class LinkOnRoute            //creating class LinkOnRoute
				{
		    	   //declaring instances of the class of type integer
				    int linkID;
					int routeID;
					int lineID;
					int networkID;
				
					
				public LinkOnRoute(int linkID,      //creating parameterized constructor
						int routeID,int lineID,int networkID)
				{
			        this.linkID = linkID;
					this.lineID = lineID;
					this.routeID = routeID;
					this.networkID = networkID;
				}
			
	                //creating methods to return the values of the Arraylists
			       
				   public int getlineID()
			        {
			         return lineID;
			        }
			        public int getLinkID()
					{
					return linkID;
					}
			        
			        public int getRouteID()
			        {
			         return routeID;
			        }
			        public int getNetworkID()
					{
					return networkID;
					}
			     }

package Project1;

		public class PointOnLink {                                    //creating class PoinOnLink
				int PointID;                                          //declaring PointOnLinkID of integer type
				int LinkID;                                          //declaring LinkID of integer type
				
				public PointOnLink(int PointID,int LinkID)            //creating parameterized constructor
				{
				    //reserve word 'this' used,as local and instance variables have same name
					this.PointID = PointID;                     
					this.LinkID = LinkID;
				}
				
                   //creating methods to return the values of the Arraylists
			        public int getLinkID()
					{
					 return LinkID;
					}
			        
			        public int getPointID()
			        {
			          return PointID;
			        }
		}

				
		
		

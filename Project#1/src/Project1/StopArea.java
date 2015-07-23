package Project1;

		public class StopArea {                                //creating class StopArea
			 	int StopAreaID;                                //declaring StopAreaID of type Integer
			 	int NetworkID;                                 //declaring StopAreaID of type Integer
			 
			 	public StopArea(int StopAreaID,int NetworkID ) //creating parameterized constructor
			 	{
			 		this.StopAreaID = StopAreaID;              //reserve word 'this'used,as local and instance variables have same name StopAreaID
			 		this.NetworkID = NetworkID;                //reserve word 'this'used,as local and instance variables have same name NetworkID
			 	}
			 
			 	 /* creating method and returning its value*/
			 	public int getStopAreaID()
			 	{
			 		return StopAreaID;
			 	}
		        
			 	public int getNetworkID()
			 	{
			 		return NetworkID;
			 	}
		 }

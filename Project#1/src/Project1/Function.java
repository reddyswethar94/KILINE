package Project1;

import java.io.IOException;
import java.util.ArrayList;

/* creating a class to perform all functions
 * creating objects and calling methods from class Read
 */

public class Function    
{
	
    static ArrayList<Network> ntwrk = new ArrayList<Network>();
    
        public void getmaindata() throws IOException   
	{   /*initializing variables to count number of linesand routes*/
		int tot = 0;
		int tot1 =0;
		
		/* creating instances of type Network,Line and Route*/
		Network netObj = null;
		Line lneObj = null;
		Route RtObj = null;
		
        Read redObj = new Read();       //creating "redobj" object to call methods of class Read
		redObj.getNetdata();            //calling method getNetdata
		
		ntwrk= redObj.getNetworkID();
		
		redObj.getLinkOnRoutedata();    //calling method getLinkOnRoutedata
		redObj.getStopPointdata();      //calling method getStopPointdata
		
		/*calling method getLinedata
		 * counting number of lines in the network
		 */
		redObj.getLinedata();         
		
	    for(int i=0; i<redObj.ntwrkvrsnID.size();i++)
		{
			netObj = redObj.ntwrkvrsnID.get(i);
			tot1 = tot1 + netObj.lneID.size();
		}
		    System.out.println(" "+tot1);
		
	
	    /*calling method getRoutedata
		 * counting number of routes in the network
		 */
		
		redObj.getRoutedata();
		
		 for(int i=0; i<redObj.ntwrkvrsnID.size(); i++)
		 {
       		netObj = redObj.ntwrkvrsnID.get(i);
       		for(int j = 0 ; j < netObj.lneID.size(); j++)
       		{
        		lneObj = netObj.lneID.get(j);
        		tot = tot + lneObj.rte.size();
            }
		}
		 
		 System.out.println(" "+tot);
		
		
	    /* calling method getSarOnRtdata
		 * counting list of StopPoints with line and routeID =1
		 */
  
		 redObj.getSarOnRtdata();
		  
		  for(int i=0; i<redObj.ntwrkvrsnID.size(); i++)
			{
	       		netObj = redObj.ntwrkvrsnID.get(i);
	       		for(int j = 0 ; j < netObj.lneID.size(); j++)
	       		{
	       			lneObj = netObj.lneID.get(j);
	       			for(int k = 0; k < lneObj.rte.size(); k++)
	       			{
	       				RtObj = lneObj.rte.get(k);
	       				if((ntwrk.get(i).lneID.get(j).getLineID())==1);
	       				{
	       				if((ntwrk.get(i).lneID.get(j).rte.get(k).getRouteID()==1))
	       				  {
	       					for(int l=0;l<ntwrk.get(i).lneID.get(j).rte.get(k).stpArOnrt.size(); l++)
	       				    System.out.print(" "+ntwrk.get(i).lneID.get(j).rte.get(k).stpArOnrt.get(l).getStopPointId());
	       				     
	       				  }
	       			    }
	       			}
	             }
	        } 

		  
		  
       redObj.getStopPointdata();
		  
	    for(int i=0; i<redObj.ntwrkvrsnID.size(); i++)
			{
	       		netObj = redObj.ntwrkvrsnID.get(i);
	       		for(int j = 0 ; j < netObj.lneID.size(); j++)
	       		{
	       			lneObj = netObj.lneID.get(j);
	       			for(int k = 0; k < lneObj.rte.size(); k++)
	       			{
	       				RtObj = lneObj.rte.get(k);
	       				for(int l=0; l < RtObj.stpArOnrt.size(); l++)
	       				{
	       					if(((ntwrk.get(i).lneID.get(j).rte.get(k).stpArOnrt.get(l).getStopPointId())==3672))
	       					{
	       						//if((ntwrk.get(i).LneID.get(j).Rte.get(k).stpArOnrt.get(l).getStopPointId())==352)
	       					
	       				       System.out.println(" " +ntwrk.get(i).lneID.get(j).getLineID());
	       					   System.out.print(" " +ntwrk.get(i).lneID.get(j).rte.get(k).getRouteID());
	                        }
	       				}
	       			}
	            } 
		  } 
	 }

}

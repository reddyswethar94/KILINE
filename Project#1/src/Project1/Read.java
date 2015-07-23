package Project1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read
    {
	   /*creating list of network,link,point ans linkOnRoute*/
        ArrayList<Network> ntwrkvrsnID = new ArrayList<Network>();
		ArrayList<Link>lnkID = new ArrayList<Link>();
		ArrayList<Point>pntID = new ArrayList<Point>();
		ArrayList<LinkOnRoute>lkOnRt = new ArrayList<LinkOnRoute>();
		
		int i;
		
		public void getNetdata()throws IOException       //creating method getNetdata to read a file
	    {
		   	File file = new File("network_vrsn.dat");    //creating File instance to reference dat file in Java
		   	@SuppressWarnings("resource")
			Scanner input = new Scanner(file);           //Creating Scanner instance to read File in Java
	        
	        while (input.hasNextLine())                  //Reading each line of file using Scanner class
		   	{
		   		
		   		String lne = input.nextLine();
	   			String[] splts = lne.split("\\|");
	   			
	   		
				Network Net = new Network(Integer.parseInt(splts[0]));
	   		    ntwrkvrsnID.add(Net);
	   		 }   
	    }
		 
		 /* creating method to return its value*/
		   public ArrayList <Network> getNetworkID()
	        {
			  return ntwrkvrsnID;
		    } 
		
	
	   
		
		  
		/*creating method to retrieve data and include lines in network*/   
		     
	    public void getLinedata()throws IOException          //creating method getLinedata to read a file
		    {
			   	File file = new File("line.dat");            //creating File instance to reference dat file in Java
			   	Scanner input = new Scanner(file);           //Creating Scanner instance to read File in Java
		        
		        Network netObj = null;
		        
	         while (input.hasNextLine())                  //Reading each line of file using Scanner class
			   	{
			   		
			   		String lne = input.nextLine();
		   			String[] splts = lne.split("\\|");
		   			
		   			Line _lne = new Line(Integer.parseInt(splts[1]),
		   					             Integer.parseInt(splts[0]));
		   			
		   			/*including lines in network*/
		   			for(i=0; i<ntwrkvrsnID.size(); i++)
		   			{
		   				netObj = ntwrkvrsnID.get(i);
		   				if(netObj.getNetworkID() == _lne.getNetworkID())
		   				{
		   					netObj.lneID.add(_lne);
		   				} 
		   				
		   				
		   		      }
		   	      } 
	             
		    }   
	
	    

	    
	    
	    
		/*creating method to retreive data and include routes in lines*/


		public void getRoutedata()throws IOException         //creating method getroutedata to read a file
		     {
				File file = new File("route.dat");           //creating File instance to reference dat file in Java
		        Scanner input1 = new Scanner(file);           //Creating Scanner instance to read File in Java
			    
			    Network netObj = null;
			    Line lneObj =null;
			 
			    while (input1.hasNextLine())                  //Reading each line of file using Scanner class
			        {
				        //i++;
			            String lne = input1.nextLine();
			            String[] splts = lne.split("\\|");
			            
			            Route rute = new Route(Integer.parseInt(splts[0]),
			            					   Integer.parseInt(splts[1]),
			            					   Integer.parseInt(splts[2]));
			           
			            /* including routes in lines*/
			            for(i=0; i<ntwrkvrsnID.size(); i++)
			   			{
			            	netObj = ntwrkvrsnID.get(i);
			            	for(int j = 0 ; j < netObj.lneID.size(); j++)
			            	{
			            		lneObj = netObj.lneID.get(j);
			            		if(lneObj.getLineID() == rute.getLineID())
			            		{
			            			lneObj.rte.add(rute);
			            		}
			            		
			            	}
			   			}
			            
			         } 
			      }
	              
	       
 	 
		
		
      /*creating method to retreive data of Linkonroute*/

		public void getLinkOnRoutedata()throws IOException          //creating method getdata to read a file
	     {
		  File file = new File("lnk_On_rte.dat");            //creating File instance to reference dat file in Java
		  Scanner input = new Scanner(file);           //Creating Scanner instance to read File in Java
	    
	      while (input.hasNextLine())                  //Reading each line of file using Scanner class
	        {
		       // i++;
	            String lnk = input.nextLine();
	            String[] splts = lnk.split("\\|");
	            
	            LinkOnRoute lkOnRt = new LinkOnRoute (Integer.parseInt(splts[0]),
								  		              Integer.parseInt(splts[1]),
								  		              Integer.parseInt(splts[2]),
								  		              Integer.parseInt(splts[3]));
	         }
	    
	     }
		 /* creating method and returning its value*/
		 public ArrayList <LinkOnRoute> getLinkOnRouteID()
	        {
			  return lkOnRt;
		    } 
		 
		 
        /*creating method to retrieve data and include SarOnRt in routes*/
		 
		 public void getSarOnRtdata()throws IOException         //creating method getdata to read a file
	     {
			File file = new File("SarOnRt.dat");           //creating File instance to reference dat file in Java
	        Scanner input = new Scanner(file);           //Creating Scanner instance to read File in Java
		    //int count=0;
		    
		    Network netObj = null;
		    Line lneObj = null;
		    Route RtObj = null;
		 
		    while (input.hasNextLine())                  //Reading each line of file using Scanner class
		        {
			        //i++;
		            String lne = input.nextLine();
		            String[] splts = lne.split("\\|");
		            
		            StopArOnRoute SarRute = new StopArOnRoute(Integer.parseInt(splts[2]),
							            		              Integer.parseInt(splts[0]),
							            		              Integer.parseInt(splts[1]),
							            		              Integer.parseInt(splts[3]),
							            		              Integer.parseInt(splts[4]));
							           
		            /*include SarOnRt in routes*/
		            for(int i=0; i<ntwrkvrsnID.size(); i++)
		   			{
		            	netObj = ntwrkvrsnID.get(i);
		            	for(int j = 0 ; j < netObj.lneID.size(); j++)
		            	{
		            		lneObj = netObj.lneID.get(j);
		            		for(int k = 0 ; k < lneObj.rte.size(); k++)
		            		{
		            			RtObj = lneObj.rte.get(k);
		            		    if(RtObj.getRouteID() == SarRute.getRouteID())
		            		    {
		            		       RtObj.stpArOnrt.add(SarRute);
		            		    }
		                    }
		            		
		            	}
		   			}
		         } 
		      }
              
	 
	 
		 /*creating method to retreive data of StopPoint*/

			public void getStopPointdata()throws IOException         //creating method getdata to read a file
			{
			   File file = new File("stopoint.dat");           //creating File instance to reference dat file in Java
			   Scanner input = new Scanner(file);           //Creating Scanner instance to read File in Java
			  
			    while (input.hasNextLine())                  //Reading each line of file using Scanner class
			   {
			       
			       String lne = input.nextLine();
			       String[] splts = lne.split("\\|");
			       
			       StopPoint spobj= new StopPoint(Integer.parseInt(splts[0]),
			       		              Integer.parseInt(splts[1]),
			       		              Integer.parseInt(splts[2]),
			       		              Integer.parseInt(splts[2]));
			     }
			 } 
			
			
			
			
			
			 /*creating method to retreive data of Point*/
			public void getPointdata()throws IOException         //creating method getdata to read a file
			{
			   File file = new File("stopoint.dat");           //creating File instance to reference dat file in Java
			   Scanner input = new Scanner(file);           //Creating Scanner instance to read File in Java
			  
			    while (input.hasNextLine())                  //Reading each line of file using Scanner class
			   {
			       
			       String lne = input.nextLine();
			       String[] splts = lne.split("\\|");
			       
			       Point pntObj= new Point(Integer.parseInt(splts[0]),
			       		              Integer.parseInt(splts[1]),
			       		              Integer.parseInt(splts[2]));
			       		             
			     }
			 } 
			
			 /* creating method and returning its value*/
			public ArrayList<Point> getPointID()
			{
				return pntID;
			}
			      
		


			 /*creating method to retreive data of Link*/
		public void getLinkdata()throws IOException         //creating method getdata to read a file
		{
		   File file = new File("stopoint.dat");           //creating File instance to reference dat file in Java
		   Scanner input = new Scanner(file);           //Creating Scanner instance to read File in Java
		  
		    while (input.hasNextLine())                  //Reading each line of file using Scanner class
		   {
		       
		       String lne = input.nextLine();
		       String[] splts = lne.split("\\|");
		       
		       Point pntObj= new Point(Integer.parseInt(splts[0]),
		       		              Integer.parseInt(splts[1]),
		       		              Integer.parseInt(splts[2]));
		       		             
		     }
		 } 
		
		 /* creating method and returning its value*/
		public ArrayList<Link> getLinkID()
		{
			return lnkID;
		}
		      
    }




			         
			 
			     

		





package Project1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

	public class Link {                              //creating class Link
	
			int LinkID;                              //declaring LinkID of type integer
			int PntBegID;                            //declaring LineID of types integer
			int PntEndID;
			
			
			
			public Link(int LinkID,int PntBegID,int PntEndID){      //creating parameterized constructor
				this.LinkID = LinkID;                               //reserve word 'this' used,as local and instance variables have same name RouteID
				this.PntBegID = PntBegID;
				this.PntEndID = PntEndID;
			}
			
			   //creating methods to return the values of the Arraylists
		        public int getLinkID()
				{
				 return LinkID;
				}
		        
		        public int getPntBegID()
		        {
		         return PntBegID;
		        }
		        
		        public int getPntEndID()
		        {
		         return PntEndID;
		        }
		        
		        
		 }

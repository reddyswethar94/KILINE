package Project1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

		public class Point  {                      //creating class Point
				int PointID;                      //declaring PointID of Integer type
				int PointX;
				int PointY;
				public Point(int PointID,int PointX,int PointY)         //creating parameterized constructor
				{
					this.PointID = PointID;       //reserve word 'this' used,as local and instance variables have same name
				    this.PointX = PointX;
				    this.PointY = PointY;
				}
				
				 
			//creating methods to return the values of the Arraylists
				 	public int getPointID()
					{
					return PointID;
					} 
				 	
				 	public int getPointX()
					{
					return PointX;
					} 
				 	
				 	public int getPointY()
					{
					return PointY;
					} 
			     
				}
				
				
				
		

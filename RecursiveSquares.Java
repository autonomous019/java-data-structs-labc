//*************************************************************
//  RecursiveSquares.java       Author: Mike McCarron
//*************************************************************

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.net.*;

public class RecursiveSquares extends Applet 
{
	private final int APPLET_WIDTH = 400;
	private final int APPLET_HEIGHT = 400;


	
	//////////////////////init()////////////////////////////
	public void init()
	{
		
		setBackground (Color.black);
		setSize (APPLET_WIDTH, APPLET_HEIGHT);
		
		
	}
	
    //////////////////paint()///////////////////////////////////////////
	public void paint (Graphics page)
	{
		page.setColor (Color.green);
		
			draw(page, 100, 100, 200);
	}
	////////////////////////paintShip()////////////////////////////////
	public void draw (Graphics page, int x, int y, int size)
	{
	
		if(size <= 10) return;
            page.drawRect(x, y, size, size);
         
            /*
             * Yep, gotta take math, i'm lost. seems recursive but all messed up. 
            draw(page, x - size/2, y - size/2, size/2);    // lower left
            draw(page, x - size/2, y + size/2, size/2);    // upper left
            draw(page, x + size/2, y - size/2, size/2);    // lower right
            draw(page, x + size/2, y + size/2, size/2);    // upper right
           */
            
            draw(page, x - x/2, y - y/2, size/2);    // upper left
            draw(page, x - x/2, y + y + y/2, size/2);    // lower left
            draw(page, x + x + x/2, y + y + y/2, size/2);    // upper right
            draw(page, x + x + x/2, y - y/2, size/2);    // lower right
           
	}
	
} //end RecursiveSquares class

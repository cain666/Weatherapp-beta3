

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JComponent;

public class GetClothes extends JComponent {

	private BufferedImage background, character, upperbody,lowerbody,weather,hills,feet,head,backgroundcolor;
	
	public GetClothes () {
		//Hej, jag Šr en Utter.
	}
	
	@Override
	protected void paintComponent(Graphics screen) {
		
		// Background sky
		if (backgroundcolor !=null)
		screen.drawImage(backgroundcolor,0,0,null);
		
		// Weather
		if (weather !=null)	
			screen.drawImage(weather,0,0,null );
		
		// Hills
		if (hills !=null)	
			screen.drawImage(hills,0,0,null );
		
		// Figure
		if( character != null )
			screen.drawImage(character,0,0,null);
		
		
		// Lowerbody
				if (lowerbody !=null)	
					screen.drawImage(lowerbody,0,0,null );
		
		// upperbody
				if (upperbody !=null)	
					screen.drawImage(upperbody,0,0,null );		
		
		// Feet
				if (feet !=null)	
					screen.drawImage(feet,0,0,null );							
	}

	public void setUpperbody(String src){
		File img = new File(src);
		
		BufferedImage image = null;
		try {
			image = ImageIO.read(img);
			upperbody = image;
			repaint();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setWeather(String src){
		File img = new File(src);
		
		BufferedImage image = null;
		try {
			image = ImageIO.read(img);
			weather = image;
			repaint();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void setHills(String src){
		File img = new File(src);
		
		BufferedImage image = null;
		try {
			image = ImageIO.read(img);
			hills = image;
			repaint();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void setBackgroundcolor(String src){
			File img = new File(src);
			
			BufferedImage image = null;
			try {
				image = ImageIO.read(img);
				backgroundcolor = image;
				repaint();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		public void setCharacter(String src){
			File img = new File(src);
			
			BufferedImage image = null;
			try {
				image = ImageIO.read(img);
				character = image;
				repaint();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void setFeet(String src){
			File img = new File(src);
			
			BufferedImage image = null;
			try {
				image = ImageIO.read(img);
				feet = image;
				repaint();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void setLowerbody(String src){
			File img = new File(src);
			
			BufferedImage image = null;
			try {
				image = ImageIO.read(img);
				lowerbody = image;
				repaint();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}		
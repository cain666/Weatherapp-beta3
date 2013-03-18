

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.image.BufferedImage;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class ClothesGui extends JFrame {
	ParseXML myWeather = new ParseXML();
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClothesGui frame = new ClothesGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClothesGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel showCelcius = new JLabel(myWeather.getCelsius()+"¡C");
		showCelcius.setHorizontalAlignment(SwingConstants.CENTER);
		showCelcius.setBounds(0, 0, 394, 49);
		showCelcius.setForeground(new Color(255, 255, 255));
		showCelcius.setFont(new Font("Noteworthy", Font.BOLD, 34));
		contentPane.add(showCelcius);
		JLabel season = new JLabel(myWeather.getSeason());
		season.setBounds(142, 126, 61, 16);
		contentPane.add(season);
		//Setting pictures
	
		GetClothes upperbody_ = new GetClothes();
		upperbody_.setBounds(0, 0, 394, 600);
		contentPane.add(upperbody_);
		
	
		//Set Character:
		upperbody_.setCharacter("data//character.png");
		
		
		
		// Setting weather:
		if (myWeather.getClouds().contentEquals("Fair")){
		upperbody_.setWeather("data/weather/Fair.png");
		
		}	
		if (myWeather.getClouds().contentEquals("Cloudy")){
		upperbody_.setWeather("data/weather/Cloudy.png");
		}
		if (myWeather.getClouds().contentEquals("Heavy rain")){
		upperbody_.setWeather("data/weather/Heavy_rain.png");
		}
		if (myWeather.getClouds().contentEquals("Partly cloudy")){
		upperbody_.setWeather("data/weather/Partly_cloudy.png");
		}	
		if (myWeather.getClouds().contentEquals("Rain showers")){
		upperbody_.setWeather("data/weather/Rain_showers.png");
		}	
		if (myWeather.getClouds().contentEquals("Rain")){
		upperbody_.setWeather("data/weather/Rain.png");
		}	
		if (myWeather.getClouds().contentEquals("Sleet")){
		upperbody_.setWeather("data/weather/Sleet.png");
		}	
		if (myWeather.getClouds().contentEquals("Snow showers")){
		upperbody_.setWeather("data/weather/Snow_showers.png");
		}	
		if (myWeather.getClouds().contentEquals("Snow")){
		upperbody_.setWeather("data/weather/Snow.png");
		}	
	
		//Setting Hills:
		if (myWeather.getClouds().contentEquals("Rain") || (myWeather.getClouds().contentEquals("Heavy rain") || (myWeather.getClouds().contentEquals("Rain showers") || (myWeather.getClouds().contentEquals("Sleet"))))){
			upperbody_.setHills("data/hills/rain_hill.png");
			}	
		else if (myWeather.getClouds().contentEquals("Snow") || (myWeather.getClouds().contentEquals("Snow showers"))){
			upperbody_.setHills("data/hills/snow_hill.png");
			}	
		else
		{
			upperbody_.setHills("data/hills/fair_hill.png");
		}
		
	//Setting Background:
		if (myWeather.getClouds().contentEquals("Rain") || (myWeather.getClouds().contentEquals("Heavy rain") || (myWeather.getClouds().contentEquals("Rain showers") || (myWeather.getClouds().contentEquals("Sleet"))))){
			upperbody_.setBackgroundcolor("data/backgroundcolor/Rain_bg.png");
			}	
		else if (myWeather.getClouds().contentEquals("Snow") || (myWeather.getClouds().contentEquals("Snow showers"))){
			upperbody_.setBackgroundcolor("data/backgroundcolor/Snow_bg.png");
		}
			else
			{
				upperbody_.setBackgroundcolor("data/backgroundcolor/Fair_bg.png");	
			}
		
		// Setting feet:
		if (myWeather.getClouds().contentEquals("Fair") && (myWeather.getCelsiusInt()>=15)) 
		{
			upperbody_.setFeet("data/feet/Fair_feet.png");
		}
		if (myWeather.getClouds().contentEquals("Fair") && (myWeather.getCelsiusInt()<=15)) 
		{
			upperbody_.setFeet("data/feet/Cloudy_feet.png");
		}
		// Set upperbody
		
		if (myWeather.getClouds().contentEquals("Fair") && (myWeather.getCelsiusInt()<=15)) 
		{
			upperbody_.setUpperbody("data/upperbody/Cloudy_upperbody.png");
		}
		if (myWeather.getClouds().contentEquals("Snow") || (myWeather.getClouds().contentEquals("Snow showers"))) 
		{
			upperbody_.setUpperbody("data/upperbody/Snow_upperbody.png");
		}
	
		// set lowerbody
	
		
		if (myWeather.getClouds().contentEquals("Fair") || (myWeather.getClouds().contentEquals("Cloudy"))  && (myWeather.getCelsiusInt()<=15))
		{
			upperbody_.setLowerbody("data/lowerbody/Cloudy_lowerbody.png");
		}
		else if (myWeather.getClouds().contentEquals("Rain") || (myWeather.getClouds().contentEquals("Rain showers")) && (myWeather.getCelsiusInt()<=17))
				{
			//Rain-stubb.
				}
		else if (myWeather.getClouds().contentEquals("Rain") || (myWeather.getClouds().contentEquals("Rain showers")) && (myWeather.getCelsiusInt()>=18))
		{
			//Summerrain-stubb.
		}
	}
	}



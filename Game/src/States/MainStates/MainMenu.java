package States.MainStates;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import GameBasics.GameEngine;
import States.subStates.MiniGame;

import gfx.ImageLoader;

public class MainMenu extends State{
	
	private static final long serialVersionUID = 1L;

	public MainMenu (GameEngine gmrunnable) {
		init(gmrunnable);
	}
	
	@Override
	public void init(GameEngine gmrunnable) { //main menu does not need more than the init() method since it's only a selection panel

		new JPanel();
		setLayout(null);
		
		JButton btnInicio = new JButton();
		JButton btnOpciones = new JButton("Opciones");
		JButton salir = new JButton("salir");
		


		ImageIcon icon = new ImageIcon();
		icon.setImage(ImageLoader.loadImage("/textures/startButton.png").getScaledInstance(150, 70, Image.SCALE_DEFAULT));
		btnInicio.setIcon(icon);
	    btnInicio.setBounds(230, 70,150, 70);
	    salir.setBounds(230, 150,150, 70);
	    add(btnInicio);
	    add(salir);
	    validate();
	    btnInicio.addActionListener(new ActionListener(){
	            public void actionPerformed (ActionEvent e){
	            		System.out.println("state1");
	            		gmrunnable.changeState(new MiniGame(gmrunnable));
	            }
	        });
	    salir.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            		System.out.println("Adios");
            		gmrunnable.quit();
            }
        });
	    
		
}


	@Override
	public boolean isRenderable() {
		// TODO Auto-generated method stub
		return false;
	}

}

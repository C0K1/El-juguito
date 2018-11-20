package States.subStates;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GameBasics.GameEngine;
import States.MainStates.State;
import gfx.ImageLoader;

public class MiniGame extends State{

	private static final long serialVersionUID = 1L;

	public MiniGame (GameEngine gmrunnable) {
		init(gmrunnable);
	}
	
	@Override
	public void init(GameEngine gmrunnable) { //main menu does not need more than the init() method since it's only a selection panel

		new JPanel();
		setLayout(null);
		
		JButton btnInicio = new JButton();
		//JButton btnOpciones = new JButton("Opciones");
		JButton salir = new JButton("salir");
		ImageIcon icon = new ImageIcon();
		
	    setBounds(20, 20, 500, 300);
	    setForeground(Color.blue);

	    setVisible(true);
	    icon.setImage(ImageLoader.loadImage("/textures/startButton.png").getScaledInstance(150, 70, Image.SCALE_DEFAULT));
		btnInicio.setIcon(icon);
	    btnInicio.setBounds(50, 70,150, 70);
	    salir.setBounds(50, 150,150, 70);
	    add(btnInicio);
	    add(salir);
	    setOpaque(true);
	    validate();
	    btnInicio.addActionListener(new ActionListener(){
	            public void actionPerformed (ActionEvent e){
	            		System.out.println("state1");
	            		//gmrunnable.changeState(new MiniGameMapMenu(gmrunnable));
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
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
		g.fillRect(20, 20, 500, 300);
    }

	@Override
	public boolean isRenderable() {
		// TODO Auto-generated method stub
		return false;
	}

}
	

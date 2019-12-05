  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import javax.swing.JFrame;
/**       
 *
 * @author Mr. Herlangga
 */
public class GameWindow extends JFrame {
    
    public static final int SCREEN_WIDTH = 600;
	private GameScreen gameScreen;
	//private Menu menu;
	public GameWindow() {
		super("Java T-Rex game");
		setSize(SCREEN_WIDTH, 175);
		setLocation(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		gameScreen = new GameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}
	
	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}
	
	public static void main(String args[]) {
    		(new GameWindow()).startGame();
	}
    
}

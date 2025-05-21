import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

   static JFrame frame;

   public static void main(String[] args) {

	   showMainMenu();

   }

   public static void showMainMenu() {

    JFrame frame = new JFrame();
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button = new JButton("Play");
    
    button.setBackground(Color.RED);
    
    button.setOpaque(true);
    
    button.setBorderPainted(false);
    
    button.setBounds(300, 630, 200, 80);

    Color initialColor = Color.RED;

    button.addMouseListener(new MouseListener() {
        
    public void mouseEntered(MouseEvent e) {
        
        button.setBackground(Color.YELLOW);
    }

    public void mouseExited(MouseEvent e) {
        
        button.setBackground(initialColor);
    }
    public void mouseClicked(MouseEvent e) {}
    
    public void mousePressed(MouseEvent e) {}
    
    public void mouseReleased(MouseEvent e) {
        showGameScreen();
    }
    
        });

    button.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
            
        Timer timer = new Timer(100, null);
        
        final int[] count = {0};

        timer.addActionListener(new ActionListener() {
            
        public void actionPerformed(ActionEvent evt) {
            
            if (count[0] % 2 == 0) {
                
                button.setBackground(Color.RED);
                
            } 
            
            else {
                
                button.setBackground(Color.YELLOW);
                
            }
            
            count[0]++;

            if (count[0] >= 3) {
                
                button.setBackground(initialColor);
                
                ((Timer)evt.getSource()).stop();
                
            }
            
        }
        
                });
                
    timer.start();
    
        }
        
        });
        

    frame.add(button);
    
    frame.setSize(800, 800);
    
    frame.setLayout(null);
    
    frame.setVisible(true);

   }

   public static void showGameScreen() {
        for(int i  = 0; i < 5; i++){
            System.out.print(i);
        }
       

	   

   }

}

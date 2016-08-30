
package schoolmanagementsystem;


import java.net.UnknownHostException;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



/**
 *
 * @author Rakez
 */
public class Main {
    
    

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    
         new LoginActivity().setVisible(true);
  
    }
      
    
}

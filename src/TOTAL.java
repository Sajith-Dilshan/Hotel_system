
import com.mysql.jdbc.PreparedStatement;
import java.awt.Label;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sajith
 */
public class TOTAL {
    NewConnection newConnection = new NewConnection();
    
     

    
    //create fution to populate Total client
    public void fillTotalclient(JLabel qqq){
 
    PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT COUNT(*) FROM `clients`";

        try{
            
            ps = (PreparedStatement) newConnection.getConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
          
            
            while(rs.next())
            {
            
       
                int count = rs.getInt(1);
                qqq.setText(String.valueOf(count));
                    
               
            }
    
    
        
    }catch (SQLException e){
         
         JOptionPane.showMessageDialog(null,e);
        
        }    
   
}
    
    
    
    
    //create fution to populate Total rooms
    public void fillTotalRooms(JLabel qqq){
 
    PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT COUNT(*) FROM `rooms`";

        try{
            
            ps = (PreparedStatement) newConnection.getConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
          
            
            while(rs.next())
            {
            
       
                int count = rs.getInt(1);
                qqq.setText(String.valueOf(count));
                    
               // jLabelClientTotal.setText(int.valueOf(count));
            // System.out.println(count);
            }
    
    
        
    }catch (SQLException e){
         
         JOptionPane.showMessageDialog(null,e);
        
        }    
   
}

    
    //create fution to populate Total Reservation
    public void fillTotalReservations(JLabel qqq){
 
    PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT COUNT(*) FROM `reservations`";

        try{
            
            ps = (PreparedStatement) newConnection.getConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
          
            
            while(rs.next())
            {
            
       
                int count = rs.getInt(1);
                qqq.setText(String.valueOf(count));
                    
              
            }
    
    
        
    }catch (SQLException e){
         
         JOptionPane.showMessageDialog(null,e);
       
        }    
   
}
    
    

}

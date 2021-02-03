
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ROOMS {
    NewConnection newConnection = new NewConnection();
    
    
       //Funtion of populating clients in jtable
    
    public void fillRoomsdataJTable(JTable table){
    
    PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        
        
        
        try{
            
            ps = (PreparedStatement) newConnection.getConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        
            Object [] row;
            
            while(rs.next())
            {
             row = new Object[3];
             row [0] = rs.getInt(1);
             row [1] = rs.getString(2);
             row [2] = rs.getString(3);
             
             
             tableModel.addRow(row);
             
            }
            
            
            
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
        // return false;
        }
        
       
        
        
    
    
    }
    
    // fill the combo box
    
    public void fillRoomsType_combobox(JComboBox Combobox){
    
    PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        
        
        
        try{
            
            ps = (PreparedStatement) newConnection.getConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
           //DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        
            
            
            while(rs.next())
            {
            
             Combobox.addItem(rs.getInt(1));
             
            }
            
            
            
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
        // return false;
        }

    
    }
    
    
    
    //Funtion of adding Rooms
    public boolean addRooms(int number,int type,String phone) throws SQLException{
        
        
        
        PreparedStatement st;
        ResultSet rs;
        String addquery = "INSERT INTO `rooms`(`r_number`, `type`, `phone`, `reserved`) VALUES (?,?,?,?)";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(addquery);
            
           
            st.setInt(1, number);
            st.setInt(2, type);
            st.setString(3, phone);
           
            st.setString(4, "No");
            
           return (st.executeUpdate() > 0);
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
        
        
        
        
        
        
    
    
    }
    
    
    
    
    
    public boolean updaterooms(int number,int type,String phone,String isReserved) throws SQLException{
        
        
        
        PreparedStatement st;
      //  ResultSet rs;
        String addquery = "UPDATE `rooms` SET `type`=?,`phone`=?,`reserved`=? WHERE `r_number`=?";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(addquery);
            
           
            st.setInt(1, type);
            st.setString(2, phone);
            st.setString(3, isReserved);
            st.setInt(4, number);
            
            
                
               return (st.executeUpdate() > 0);     
                
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
        
        
    
    
    }
    
    
    
    
     //Funtion of deleting room
    
     public boolean removeRoom(int roomNumber){
     
     PreparedStatement st;
        ResultSet rs;
        String deletequery = "DELETE FROM `rooms` WHERE `r_number`=?";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(deletequery);
            
           
            
            st.setInt(1, roomNumber);
            
                
               return (st.executeUpdate() > 0);     
                
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
         
     }
     
     
     
     
     //Funtion of populating room in jtable
    
    public void fillRoomsDataJTable(JTable table){
    
    PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `rooms`";
        
        
        
        
        try{
            
            ps = (PreparedStatement) newConnection.getConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        
            Object [] row;
            
            while(rs.next())
            {
             row = new Object[4];
             row [0] = rs.getInt(1);
             row [1] = rs.getInt(2);
             row [2] = rs.getString(3);
             row [3] = rs.getString(4);
             
             
             tableModel.addRow(row);
             
            }
            
            
            
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
        // return false;
        }
    
    
    
    }  
    
    
    
    
    
    
    
 //create funtion to set a room to reserved or not   
  
    public boolean setRoomToreserved(int number,String isReserved) throws SQLException{
        
        
        
        PreparedStatement st;
        ResultSet rs;
        String addquery = "UPDATE `rooms` SET `reserved`=? WHERE `r_number`=?";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(addquery);
          
           
           
            st.setString(1, isReserved);
            st.setInt(2, number);
            
            
                
               return (st.executeUpdate() > 0);     
                
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
        
        
    
    
    }
    
    // create function to check if a room is already reserved
    
    
    public String isRoomReserved(int number)
    {
        
        
        
        PreparedStatement st;
        ResultSet rs;
        String addquery = "SELECT `reserved` FROM `rooms` WHERE `r_number`=?";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(addquery);
          
           
           
           
            st.setInt(1, number);
            
            rs = st.executeQuery();
                
               //return (st.executeUpdate() > 0);  
               
            if (rs.next())
            {
              return  rs.getString(1);
            }
            else{
            return "";
            }
                
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return "";
        }
        
        
    
    
    }
    
    
}

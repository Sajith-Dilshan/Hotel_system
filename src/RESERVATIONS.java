
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class RESERVATIONS {
    
    //alter TABLE reservations ADD CONSTRAINT fk_client_id FOREIGN KEY (client_id) REFERENCES clients(id) on DELETE CASCADE 
    //alter TABLE reservations ADD CONSTRAINT fk_room_number FOREIGN KEY (room_number) REFERENCES rooms (r_number) on DELETE CASCADE 
//alter TABLE rooms ADD CONSTRAINT fk_type_id FOREIGN KEY (type) REFERENCES type (id) on DELETE CASCADE
    
    NewConnection newConnection = new NewConnection();
    ROOMS room = new ROOMS();
    
     //Funtion of adding Reservation
    public boolean addReservation(int id,int client_id,int room_number,String dateIn,String dateOut) throws SQLException{
        
      
        try{
            
            
            
        PreparedStatement st;
        ResultSet rs;
        String addquery = "INSERT INTO `reservations`(`id`,`client_id`, `room_number`, `dateIn`, `dateOut`) VALUES (?,?,?,?,?)";
        st = (PreparedStatement) newConnection.getConnection().prepareStatement(addquery);
            
           st.setInt(1, id);
            st.setInt(2, client_id);
            st.setInt(3, room_number);
            st.setString(4, dateIn);
            st.setString(5, dateOut);
            
            
            if (room.isRoomReserved(room_number).equals("No"))
            {
                
                
                 if (st.executeUpdate() > 0)
                 {
                   room.setRoomToreserved(room_number, "Yes");
                   return true;
                 }
                 else{
                      return false;    
                 }
            
            
            }
            else{
            JOptionPane.showMessageDialog(null, "This room is already reserved ", "Room reserved", JOptionPane.WARNING_MESSAGE);
            return false;
            }
            
            
          
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
        
        
    
    
    }
    
    
    
    //Funtion of editing Reservation
    
    
    public boolean editReservation(int reservationId,int client_id,int room_number,String dateIn,String dateOut) throws SQLException{
        
        
        
        PreparedStatement st;
        ResultSet rs;
        String addquery = "UPDATE `reservations` SET `client_id`=?,`room_number`=?,`dateIn`=?,`dateOut`=? WHERE `id`=?";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(addquery);
            
           
            
            st.setInt(1, client_id);
            st.setInt(2, room_number);
            st.setString(3, dateIn);
            st.setString(4, dateOut);
            st.setInt(5, reservationId);
            
                
               return (st.executeUpdate() > 0);     
                
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
        
        
    
    }
    
    //Funtion of deleting Reservation
    
     public boolean removeReservation(int reservationId){
     
     PreparedStatement st;
        ResultSet rs;
        String deletequery = "DELETE FROM `reservations` WHERE `id`=?";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(deletequery);
            
           
            
            st.setInt(1, reservationId);
            //we need to get room number before deliting reservation
            int roomNumber = getRoomNumberFromReservation(reservationId) ;
            
          if (st.executeUpdate() > 0)
          {
             room.setRoomToreserved(roomNumber, "No");
             return true;
          }
          else{
             return false;    
          }     
                
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
         
     }
     
     
     //Funtion of populating clients in jtable
    
    public void fillReservationJTable(JTable table){
    
    PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `reservations`";
        
        
        
        
        try{
            
            ps = (PreparedStatement) newConnection.getConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        
            Object [] row;
            
            while(rs.next())
            {
             row = new Object[5];
             row [0] = rs.getInt(1);
             row [1] = rs.getInt(2);
             row [2] = rs.getInt(3);
             row [3] = rs.getString(4);
             row [4] = rs.getString(5);
             
             tableModel.addRow(row);
             
            }
            
            
            
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
        // return false;
        }
        
       
        
        
    
    
    }

    

    // crete funtion to get the room number from a reservation 

    public int getRoomNumberFromReservation (int reservationID)
    {
    PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT `room_number` FROM `reservations` WHERE `id`=? " ;
        
        
        
        
        try{
            
            ps = (PreparedStatement) newConnection.getConnection().prepareStatement(selectQuery);
            
            ps.setInt(1, reservationID);
            
            rs = ps.executeQuery();
            
            
            //return 0;
            
            if (rs.next())
            {
            return rs.getInt(1); //rs.getInt(0);
            }
            return 0;
              
            } catch (SQLException ex) {
                Logger.getLogger(ManageClientForm.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            }
    }
    
    
}
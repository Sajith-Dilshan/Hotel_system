
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CLIENTS {
    NewConnection newConnection = new NewConnection();
    
    //Funtion of adding clients
    public boolean addClient(int id,String fname,String lname,String Contact,String email) throws SQLException{
        
        
        
        PreparedStatement st;
        ResultSet rs;
        String addquery = "INSERT INTO `clients`(`id`, `first_name`, `last_name`, `contact_no`, `email`) VALUES (?,?,?,?,?)";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(addquery);
            
            st.setInt(1, id);
            st.setString(2, fname);
            st.setString(3, lname);
            st.setString(4, Contact);
            st.setString(5, email);
            
            
           return (st.executeUpdate() > 0);
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
        
        
    
    
    }
    
    
    
    //Funtion of editing clients
    
    
    public boolean editClient(int id,String fname,String lname,String Contact,String email) throws SQLException{
        
        
        
        PreparedStatement st;
        ResultSet rs;
        String addquery = "UPDATE `clients` SET `first_name`=?,`last_name`=?,`contact_no`=?,`email`=? WHERE `id`=?";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(addquery);
            
           
            st.setString(1, fname);
            st.setString(2, lname);
            st.setString(3, Contact);
            st.setString(4, email);
            st.setInt(5, id);
            
                
               return (st.executeUpdate() > 0);     
                
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
        
        
    
    
    }
    

  
    
    //Funtion of deleting clients
    
     public boolean removeClient(int id){
     
     PreparedStatement st;
        ResultSet rs;
        String deletequery = "DELETE FROM `clients` WHERE `id`=?";
        
        try{
            
            st = (PreparedStatement) newConnection.getConnection().prepareStatement(deletequery);
            
           
            
            st.setInt(1, id);
            
                
               return (st.executeUpdate() > 0);     
                
            
        
        }catch (SQLException e){
         //Logger.getLogger(CLIENTS.class.getName()).Log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,e);
         return false;
        }
         
     }
    
    
    
    //Funtion of populating clients in jtable
    
    public void fillclientsdataJTable(JTable table){
    
    PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `clients`";
        
        
        
        
        try{
            
            ps = (PreparedStatement) newConnection.getConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        
            Object [] row;
            
            while(rs.next())
            {
             row = new Object[5];
             row [0] = rs.getInt(1);
             row [1] = rs.getString(2);
             row [2] = rs.getString(3);
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
    
    
    
}

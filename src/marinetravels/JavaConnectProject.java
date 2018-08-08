package marinetravels;
import java.sql.*;
import javax.swing.*;
public class JavaConnectProject {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/marinetravels","root","varsha");
                     
    return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }

}
    public static void main(String[] args)
    {
        ConnecrDb();
    }
}

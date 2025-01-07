
package track_fitness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Databasecon {
    Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/track_fitness", "root", "");
        return con;
    }
     String insertData(data data) throws SQLException
    {
        Connection con = getConnection();
        Statement stm = con.createStatement();
        String query = "insert into data values('"+data.getTime()+"','"+data.getDate()+"','"+data.getWeight()+"','"+data.getBp()+"')";
        if(stm.executeUpdate(query)>0)
        {
            return("Add data Successfully");
        }
        else 
        {
            return("Faild");  
        }
    }
      ObservableList<data> getData() throws SQLException {
       ObservableList<data> d = FXCollections.observableArrayList();
        Connection con = getConnection();
        Statement st = con.createStatement();
        String query = "select * from data";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            String Time = rs.getString("Time");
            String Date = rs.getString("Date");
            String weight = rs.getString("weight");
            String blood_p = rs.getString("blood_p");
            data s = new data(Time, Date, weight, blood_p);
            d.add(s);
        }
        return d;
    }
}

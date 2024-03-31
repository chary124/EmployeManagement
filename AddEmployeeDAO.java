package test;
import java.sql.*;
public class AddEmployeeDAO {
 public int k=0;
 public int insert(EmployeeBean eb) {
 try {
Connection con = DBConnection.getCon();
PreparedStatement ps = con.prepareStatement
 ("insert into Employee59
values(?,?,?,?,?,?,?)");
ps.setString(1, eb.geteId());
ps.setString(2, eb.geteName());
ps.setString(3, eb.geteDesg());
Venkatesh Maipathii
 ps.setInt(4, eb.getbSal());
ps.setFloat(5, eb.getHra());
ps.setFloat(6, eb.getDa());
ps.setFloat(7, eb.getTotSal());
k = ps.executeUpdate();
}catch(Exception e) {e.printStackTrace();}
 return k;
 }
}
 

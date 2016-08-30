/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package schoolmanagementsystem;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import org.apache.derby.drda.NetworkServerControl;


/**
 *
 * @author RAKEZ
 */
public class JavaApplication1 {
    static NetworkServerControl server = null;
    static Statement stmt;
    static Connection conn ;
    String selectedID;
    String[] info;
    /**
     * @param args the command line arguments
     */
    public JavaApplication1(){
          // TODO code application logic here
       
conn = null;
         try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (Exception ex) {
            System.out.println("Failed"+ ex);
        }
       

    try {
    conn =
       DriverManager.getConnection("jdbc:derby://localhost:1527/PersonDB","bishal","bishal");

    stmt = conn.createStatement();
    
    

      

  
    } catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
}
    
    
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
   
    
       
    
     void updatedata(String sid,String cfname,String cmname,String clname,String cpfname,String cpmname,String cgender,String cdob,String ccontact1,String ccontact2,String ctaddress,String cpaddress,String cgrade,String csection,String ccaste,String cenroll, String cbus, String cbloodgroup, String crollno){
            int id=Integer.parseInt(sid);
            String fullname;
            if(cmname.equals("")){
              fullname = cfname+" "+clname;
            }else{
              fullname = cfname+" "+cmname+" "+clname;
            }
          String lfullname=fullname.toLowerCase();
            
        try{
            String qry = "UPDATE APP.STUDENTS_INFO SET FNAME = ?,MNAME = ?,LNAME = ?,PFNAME = ?,PMNAME = ?,DOB = ?,CASTE = ?,ENROLLEDFROM = ?,GRADE = ?,PADDRESS = ?,TADDRESS = ?,SECTION =?,HCONTACT = ?,PCONTACT = ?,GENDER = ?,BUS = ?,BLOODGROUP = ?,ROLLNO = ?,FULLNAME = ?,LFULLNAME = ? WHERE SID="+id;
            PreparedStatement st = conn.prepareStatement(qry);
                       
            st.setString(1, cfname);
            st.setString(2, cmname);
            st.setString(3, clname);
            st.setString(4, cpfname);
            st.setString(5, cpmname);
            st.setString(6, cdob);
            st.setString(7, ccaste);
            st.setString(8, cenroll);
            st.setString(9, cgrade);
            st.setString(10, cpaddress);
            st.setString(11, ctaddress);
            st.setString(12, csection);
            st.setString(13, ccontact1);
            st.setString(14, ccontact2);
            st.setString(15, cgender);
            st.setString(16, cbus);
            st.setString(17, cbloodgroup);
            st.setString(18, crollno);
            st.setString(19, fullname);
            st.setString(20, lfullname); 
            
            st.execute();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
     void updatedata(String sid,String cfname,String cmname,String clname,String cpfname,String cpmname,String cgender,String cdob,String ccontact1,String ccontact2,String ctaddress,String cpaddress,String cgrade,String csection,String ccaste,String cenroll,byte[] personImage, String cbus, String cbloodgroup, String crollno){
            int id=Integer.parseInt(sid);
            String fullname;
            if(cmname.equals("")){
              fullname = cfname+" "+clname;
            }else{
              fullname = cfname+" "+cmname+" "+clname;
            }
          String lfullname=fullname.toLowerCase();
            
        try{
            String qry = "UPDATE APP.STUDENTS_INFO SET FNAME = ?,MNAME = ?,LNAME = ?,PFNAME = ?,PMNAME = ?,DOB = ?,CASTE = ?,ENROLLEDFROM = ?,GRADE = ?,PADDRESS = ?,TADDRESS = ?,SECTION =?,HCONTACT = ?,PCONTACT = ?,GENDER = ?,BUS = ?,BLOODGROUP = ?,ROLLNO = ?,FULLNAME = ?,LFULLNAME = ?,IMAGE = ? WHERE SID="+id;
            PreparedStatement st = conn.prepareStatement(qry);
                       
            st.setString(1, cfname);
            st.setString(2, cmname);
            st.setString(3, clname);
            st.setString(4, cpfname);
            st.setString(5, cpmname);
            st.setString(6, cdob);
            st.setString(7, ccaste);
            st.setString(8, cenroll);
            st.setString(9, cgrade);
            st.setString(10, cpaddress);
            st.setString(11, ctaddress);
            st.setString(12, csection);
            st.setString(13, ccontact1);
            st.setString(14, ccontact2);
            st.setString(15, cgender);
            st.setString(16, cbus);
            st.setString(17, cbloodgroup);
            st.setString(18, crollno);
            st.setString(19, fullname);
            st.setString(20, lfullname); 
            st.setBytes(21, personImage);
            st.execute();
         
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void senddata(String cfname,String cmname,String clname,String cpfname,String cpmname,String cgender,String cdob,String ccontact1,String ccontact2,String ctaddress,String cpaddress,String cgrade,String csection,String ccaste,String cenroll,byte[] personImage, String cbus, String cbloodgroup, String crollno){
   //public void senddata(){
  
    try{
            
        //String qry = "INSERT INTO APP.TABLE1 values(" + name +",21
             
        
         String fullname;
          if(cmname.equals("")){
              fullname = cfname+" "+clname;
          }else{
              fullname = cfname+" "+cmname+" "+clname;
          }
          String lfullname=fullname.toLowerCase();
          
          
          //String qry = "INSERT INTO APP.STUDENTS_INFO(SID,FNAME,MNAME,LNAME,PFNAME,PMNAME,DOB,CASTE,HCONTACT,PCONTACT,ENROLLEDFROM,GRADE,PADDRESS,TADDRESS,SECTION) " +
            //     "VALUES (13,'"+cfname+"','"+cmname+"','"+clname+"','"+cpfname+"','"+cpmname+"','2052-12-12','"+ccaste+"',"+contact1+","+contact2+",'2052-11-10',"+grade+",'"+cpaddress+"','"+ctaddress+"','"+csection+"')";
        String qry = "INSERT INTO APP.STUDENTS_INFO(FNAME,MNAME,LNAME,PFNAME,PMNAME,DOB,CASTE,ENROLLEDFROM,GRADE,"
                + "PADDRESS,TADDRESS,IMAGE,SECTION,HCONTACT,PCONTACT,GENDER,BUS,BLOODGROUP,ROLLNO,FULLNAME,LFULLNAME) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";     
            
            PreparedStatement st = conn.prepareStatement(qry);
                       
            st.setString(1, cfname);
            st.setString(2, cmname);
            st.setString(3, clname);
            st.setString(4, cpfname);
            st.setString(5, cpmname);
            st.setString(6, cdob);
            st.setString(7, ccaste);
            st.setString(8, cenroll);
            st.setString(9, cgrade);
            st.setString(10, cpaddress);
            st.setString(11, ctaddress);
            st.setBytes(12, personImage);
            st.setString(13, csection);
            st.setString(14, ccontact1);
            st.setString(15, ccontact2);
            st.setString(16, cgender);
            st.setString(17, cbus);
            st.setString(18, cbloodgroup);
            st.setString(19, crollno);
            st.setString(20, fullname);
            st.setString(21, lfullname);
           
            
            
            //st.setBytes(14,personImage);
           //System.out.println(cfname+cmname+clname+cpfname+cpmname+cdob+ccaste+cenroll+
             //                cgrade+cpaddress+ctaddress+personImage+csection+ccontact1+ccontact2+cgender+cbus+cbloodgroup+crollno);
            
            
            
           st.execute();
            
        }
        catch(Exception e){
            
        }
        
    }

    ImageIcon getimage(String i) {
        int id = Integer.parseInt(i);
        byte[] imagedata;
        ImageIcon image = null;
        
        try{
             
         
            String sql = "SELECT IMAGE FROM APP.STUDENTS_INFO WHERE SID="+id;
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
        
         imagedata = rs.getBytes("IMAGE");
         image =new ImageIcon(imagedata);
         
         //Display values
        
       
         
      }
      rs.close();
        
      }catch(Exception e){
      } 
     
      return image;
    
}

        ImageIcon getimagestaff(String i) {
        int id = Integer.parseInt(i);
        byte[] imagedata;
        ImageIcon image = null;
        
        try{
             
         
            String sql = "SELECT IMAGE FROM APP.TEACHER_INFO WHERE SID="+id;
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
        
         imagedata = rs.getBytes("IMAGE");
         image =new ImageIcon(imagedata);
         
         //Display values
        
       
         
      }
      rs.close();
        
      }catch(Exception e){
      } 
     
      return image;
    
}
    public ResultSet returnResult(String text){
    try{
        
        ResultSet rs = stmt.executeQuery("Select SID,FULLNAME from App.students_info where lfullname like lower('"+text+"%')");
        
    return(rs);
            }catch(Exception e){
                System.out.println(e);
                
            
            return(null);
            }
    }
    public ResultSet returnResultstaff(String text){
    try{
        
        ResultSet rs = stmt.executeQuery("Select SID,FULLNAME from APP.TEACHER_INFO where lfullname like lower('"+text+"%')");
        
    return(rs);
            }catch(Exception e){
                System.out.println(e);
                
            
            return(null);
            }
    }
    
     public ResultSet returnResultTotal(){
    try{
        
        ResultSet rs = stmt.executeQuery("Select SID,FULLNAME from App.students_info");
        
    return(rs);
            }catch(Exception e){
                System.out.println(e);
                
            
            return(null);
            }
    }
    public ResultSet returnResultstaffTotal(){
    try{
        
        ResultSet rs = stmt.executeQuery("Select SID,FULLNAME from APP.TEACHER_INFO");
        
    return(rs);
            }catch(Exception e){
                System.out.println(e);
                
            
            return(null);
            }
    }
    public ResultSet returnResultclass(String grade){
    try{
        
        ResultSet rs = stmt.executeQuery("Select SID,FULLNAME from App.students_info where GRADE like '"+grade+"'");
        
    return(rs);
            }catch(Exception e){
                System.out.println(e);
                
            
            return(null);
            }
    }
    
    public ResultSet returnResultSection(String section){
    try{
        
        ResultSet rs = stmt.executeQuery("Select SID,FULLNAME from App.students_info where SECTION like '"+section+"'");
        
    return(rs);
            }catch(Exception e){
                System.out.println(e);
                
            
            return(null);
            }
    }
    
    public ResultSet returnResultSection(String section,String grade){
    try{
        
        ResultSet rs = stmt.executeQuery("Select SID,FULLNAME from App.students_info where GRADE like '"+grade+"' and SECTION like '"+section+"'");
        
    return(rs);
            }catch(Exception e){
                System.out.println(e);
                
            
            return(null);
            }
    }
  
    public String[] returndata(String selectedID){
    String info[]=new String[18];
        try{
        int ID=Integer.parseInt(selectedID);
        ResultSet rs = stmt.executeQuery("Select * from App.students_info where SID="+ID);
        while(rs.next()){
            info[0] = rs.getString("FNAME");
            info[1] = rs.getString("MNAME");
            info[2] = rs.getString("LNAME");
            info[3] = rs.getString("PFNAME");
            info[4] = rs.getString("PMNAME");
            info[5] = rs.getString("DOB");
            info[6] = rs.getString("CASTE");
            info[7] = rs.getString("ENROLLEDFROM");
            info[8] = rs.getString("PADDRESS");
            info[9] = rs.getString("TADDRESS");
            info[10] = rs.getString("SECTION");
            info[11] = rs.getString("HCONTACT");
            info[12] = rs.getString("PCONTACT");
            info[13] = rs.getString("GRADE");
            info[14] = rs.getString("GENDER");
            info[15] = rs.getString("BUS");
            info[16] = rs.getString("BLOODGROUP");
            info[17] = rs.getString("ROLLNO");
           
            
        }
        return(info);
    }catch(Exception e){
        System.out.println(e);
        return(null);
    }
        
    }
    public String[] returndatastaff(String selectedID){
    String info[]=new String[15];
        try{
        int ID=Integer.parseInt(selectedID);
        ResultSet rs = stmt.executeQuery("Select * from App.TEACHER_INFO where SID="+ID);
        while(rs.next()){
            info[0]  = rs.getString("FNAME");
            info[1]  = rs.getString("MNAME");
            info[2]  = rs.getString("LNAME");
            info[3]  = rs.getString("QAULIFICATION");
            info[4]  = rs.getString("SUBJECT");
            info[5]  = rs.getString("DOB");
            info[6]  = rs.getString("CASTE");
            info[7]  = rs.getString("ENROLLEDFROM");
            info[8]  = rs.getString("PADDRESS");
            info[9]  = rs.getString("TADDRESS");
            info[10] = rs.getString("TYPE");
            info[11] = rs.getString("CONTACT");
            info[12] = rs.getString("JOB");
            info[13] = rs.getString("SEX");
            info[14] = rs.getString("BLOODGROUP");
            
           
            
        }
        return(info);
    }catch(Exception e){
        System.out.println(e);
        return(null);
    }
        
    }
    

    void receivedata(String selID, String[] inf) {
        
        info=inf;
        selectedID=selID;
     
    }

     String[] getlastmonth(String selectedID) {
        String cleared[]=new String[2];
        int i;
        int id = Integer.parseInt(selectedID);
        
        String sql = "SELECT * FROM APP.STUDENTS_FEE WHERE SID="+id;
        try{
            ResultSet rs = stmt.executeQuery(sql);
            i=0;
            while(rs.next()){
                i++;
            cleared[0] = rs.getString("CLEARED");
            cleared[1] = rs.getString("BALANCE");
            
            }
            rs.close();
            //System.out.print("First: " + cleared);
            if(i==0){
              sql="INSERT INTO APP.STUDENTS_FEE (SID, BALANCE) VALUES("+id+", '0')";
              PreparedStatement st = conn.prepareStatement(sql);
              st.execute();
              cleared[0]="------";
              cleared[1]="0";
            
            }
            
      
            
        }catch(Exception e){
            System.out.println(e);
            
        }
        
        return cleared;
        
    }
     String[] getlastmonthstaff(String selectedID) {
        String cleared[]=new String[2];
        int i;
        int id = Integer.parseInt(selectedID);
        
        String sql = "SELECT * FROM APP.STAFF_SALARY WHERE SID="+id;
        try{
            ResultSet rs = stmt.executeQuery(sql);
            i=0;
            while(rs.next()){
                i++;
            cleared[0] = rs.getString("CLEARED");
            cleared[1] = rs.getString("BALANCE");
            
            }
            rs.close();
            //System.out.print("First: " + cleared);
            if(i==0){
              sql="INSERT INTO APP.STAFF_SALARY (SID, BALANCE) VALUES("+id+", '0')";
              PreparedStatement st = conn.prepareStatement(sql);
              st.execute();
              cleared[0]="------";
              cleared[1]="0";
            
            }
            
      
            
        }catch(Exception e){
            System.out.println(e);
            
        }
        
        return cleared;
        
    }

    void updatefee(String selectedID, String payment, int bal) {
        String balance = String.valueOf(bal);
         int id = Integer.parseInt(selectedID);
         System.out.println(id);
        String qry = "UPDATE APP.STUDENTS_FEE SET CLEARED='"+payment+"', BALANCE='"+balance+"' WHERE SID="+id;
        try{
        PreparedStatement st=conn.prepareStatement(qry);
        
            st.execute();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    void updatefeestaff(String selectedID, String payment, int bal) {
        String balance = String.valueOf(bal);
         int id = Integer.parseInt(selectedID);
         System.out.println(id);
        String qry = "UPDATE APP.STAFF_SALARY SET CLEARED='"+payment+"', BALANCE='"+balance+"' WHERE SID="+id;
        try{
        PreparedStatement st=conn.prepareStatement(qry);
        
            st.execute();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    void setstaffdata(String csubject, String cfname, String cmname, String clname, String cgender, String cdob, String ccontact, String ctaddress, String cpaddress, String ccaste, String cenroll, byte[] personImage, String cbloodgroup, String cpost, String cquali, String ctype) {
        try{
            
        //String qry = "INSERT INTO APP.TABLE1 values(" + name +",21
             
        
         String fullname;
          if(cmname.equals("")){
              fullname = cfname+" "+clname;
          }else{
              fullname = cfname+" "+cmname+" "+clname;
          }
          String lfullname=fullname.toLowerCase();
          
          
          //String qry = "INSERT INTO APP.STUDENTS_INFO(SID,FNAME,MNAME,LNAME,PFNAME,PMNAME,DOB,CASTE,HCONTACT,PCONTACT,ENROLLEDFROM,GRADE,PADDRESS,TADDRESS,SECTION) " +
            //     "VALUES (13,'"+cfname+"','"+cmname+"','"+clname+"','"+cpfname+"','"+cpmname+"','2052-12-12','"+ccaste+"',"+contact1+","+contact2+",'2052-11-10',"+grade+",'"+cpaddress+"','"+ctaddress+"','"+csection+"')";
        String qry = "INSERT INTO APP.TEACHER_INFO(FNAME,MNAME,LNAME,DOB,CASTE,ENROLLEDFROM,QAULIFICATION,"
                + "PADDRESS,TADDRESS,IMAGE,CONTACT,SEX,BLOODGROUP,SUBJECT,FULLNAME,LFULLNAME,TYPE,JOB) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";     
            
            PreparedStatement st = conn.prepareStatement(qry);
                       
            st.setString(1, cfname);
            st.setString(2, cmname);
            st.setString(3, clname);
            st.setString(4, cdob);
            st.setString(5, ccaste);
            st.setString(6, cenroll);
            st.setString(7, cquali);
            st.setString(8, cpaddress);
            st.setString(9, ctaddress);
            st.setBytes(10, personImage);
            st.setString(11, ccontact);
            st.setString(12, cgender);
            st.setString(13, cbloodgroup);
            st.setString(14, csubject);
            st.setString(15, fullname);
            st.setString(16, lfullname);
            st.setString(17, ctype);
            st.setString(18, cpost);
            
           
           st.execute();
            
        }
        catch(Exception e){
            
        }
    }

    void updatestaffdata(String sid,String csubject, String cfname, String cmname, String clname, String cgender, String cdob, String ccontact, String ctaddress, String cpaddress, String ccaste, String cenroll, String cbloodgroup, String cpost, String cquali, String ctype) {
        int id=Integer.parseInt(sid);
            String fullname;
            if(cmname.equals("")){
              fullname = cfname+" "+clname;
            }else{
              fullname = cfname+" "+cmname+" "+clname;
            }
          String lfullname=fullname.toLowerCase();
            
        try{
            String qry = "UPDATE APP.TEACHER_INFO SET FNAME = ?,MNAME = ?,LNAME = ?,QAULIFICATION = ?,SUBJECT = ?,DOB = ?,CASTE = ?,ENROLLEDFROM = ?,SEX = ?,PADDRESS = ?,TADDRESS = ?,TYPE =?,JOB = ?,CONTACT = ?,BLOODGROUP = ?,FULLNAME = ?,LFULLNAME = ? WHERE SID="+id;
            PreparedStatement st = conn.prepareStatement(qry);
                       
            st.setString(1, cfname);
            st.setString(2, cmname);
            st.setString(3, clname);
            st.setString(4, cquali);
            st.setString(5, csubject);
            st.setString(6, cdob);
            st.setString(7, ccaste);
            st.setString(8, cenroll);
            st.setString(9, cgender);
            st.setString(10, cpaddress);
            st.setString(11, ctaddress);
            st.setString(12, ctype);
            st.setString(13, cpost);
            st.setString(14, ccontact);
            st.setString(15, cbloodgroup);
            st.setString(16, fullname);
            st.setString(17, lfullname); 
            
            st.execute();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    void updatestaffdata(String sid, String csubject, String cfname, String cmname, String clname, String cgender, String cdob, String ccontact, String ctaddress, String cpaddress, String ccaste, String cenroll, byte[] personImage, String cbloodgroup, String cpost, String cquali, String ctype) {
       int id=Integer.parseInt(sid);
            String fullname;
            if(cmname.equals("")){
              fullname = cfname+" "+clname;
            }else{
              fullname = cfname+" "+cmname+" "+clname;
            }
          String lfullname=fullname.toLowerCase();
            
        try{
            String qry = "UPDATE APP.TEACHER_INFO SET FNAME = ?,MNAME = ?,LNAME = ?,QAULIFICATION = ?,SUBJECT = ?,DOB = ?,CASTE = ?,ENROLLEDFROM = ?,SEX = ?,PADDRESS = ?,TADDRESS = ?,TYPE =?,JOB = ?,CONTACT = ?,BLOODGROUP = ?,FULLNAME = ?,LFULLNAME = ?,IMAGE=? WHERE SID="+id;
            PreparedStatement st = conn.prepareStatement(qry);
                       
            st.setString(1, cfname);
            st.setString(2, cmname);
            st.setString(3, clname);
            st.setString(4, cquali);
            st.setString(5, csubject);
            st.setString(6, cdob);
            st.setString(7, ccaste);
            st.setString(8, cenroll);
            st.setString(9, cgender);
            st.setString(10, cpaddress);
            st.setString(11, ctaddress);
            st.setString(12, ctype);
            st.setString(13, cpost);
            st.setString(14, ccontact);
            st.setString(15, cbloodgroup);
            st.setString(16, fullname);
            st.setString(17, lfullname); 
            st.setBytes(18,personImage);
            
            st.execute();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    void deletestaff(String selectedID) {
        try{
            PreparedStatement st = conn.prepareStatement("DELETE FROM APP.TEACHER_INFO WHERE SID = ?");
            st.setString(1,selectedID);
            st.executeUpdate(); 
        }catch(Exception e){
            System.out.println(e);
        }
    }

    void deletestudent(String selectedID) {
        try{
            PreparedStatement st = conn.prepareStatement("DELETE FROM APP.STUDENTS_INFO WHERE SID = ?");
            st.setString(1,selectedID);
            st.executeUpdate(); 
        }catch(Exception e){
            System.out.println(e);
        }
    }

    

   
    
}
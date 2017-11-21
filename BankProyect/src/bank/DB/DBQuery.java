/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.DB;

import java.sql.*;


/**
 *
 * @author edgar.cambranes
 */
public class DBQuery {
    private Connection connection;
    private Statement query;
    private ResultSet resultset;
    
    
public ResultSet getCustomersAccountsInfo(String FN, String LN){
    String SQLquery ="SELECT C.idCustomer, FirstName, LastName from"
            + " accounts A, customers C  where "+
                     "FirstName=\'" +FN + "\' and "+
                     "LastName=\'" +LN + "\' and A.idCustomer = C.idCustomer ";
    
    System.out.println(SQLquery);
    try{
        connection = new DBConnection().getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        
    }
    catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    
    return resultset;
}
public static void main(String args[]){
       
    try{
        ResultSet  rs = new DBQuery().getCustomersAccountsInfo("jose", "alameda");
        String records ="";
        while(rs.next()){
        records += rs.getInt("idCustomer")+ "\t" +
                   rs.getString("FirstName") + "\t" +
                   rs.getString("LastName");
        }
        System.out.println(records);
    
    }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
       
}
    
}

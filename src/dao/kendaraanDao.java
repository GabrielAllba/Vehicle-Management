package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Kendaraan;

public class kendaraanDao {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertKendaraan(Kendaraan d){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO kendaraan(id, model, jenis, tahunPembuatan, noPlat, kapasitasPenumpang, dayaAngkut) "+ "VALUES ('" + d.getId()+"', '"+d.getModel()+"', '"+d.getJenis()+"', '"+d.getTahunPembuatan()+"','"+d.getNoPlat()+"', '"+d.getKapasitasPenumpang()+"', '"+d.getDayaAngkut()+"')";
        System.out.println("Adding kendaraan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " kendaraan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding kendaraan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Kendaraan> showKendaraan(){
        con = dbCon.makeConnection();
        String sql = "SELECT * FROM kendaraan";
        System.out.println("Mengambil data kendaraan...");
        
        List<Kendaraan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Kendaraan d = new Kendaraan(
                            rs.getString("id"),
                            rs.getString("model"),
                            rs.getString("jenis"),
                            rs.getInt("tahunPembuatan"),
                            rs.getString("noPlat"),
                            rs.getInt("kapasitasPenumpang"),
                            rs.getFloat("dayaAngkut")
                    );
                    list.add(d);
                }
                
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return list;
    }
    
    public Kendaraan searchKendaraan(String id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM kendaraan WHERE id = '"+id+"'";
        System.out.println("Searching kendaraan...");
        Kendaraan d = null;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs !=null){
                while(rs.next()){
                    d = new Kendaraan(
                            rs.getString("id"),
                            rs.getString("model"),
                            rs.getString("jenis"),
                            rs.getInt("tahunPembuatan"),
                            rs.getString("noPlat"),
                            rs.getInt("kapasitasPenumpang"),
                            rs.getFloat("dayaAngkut")
                    );
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return d;
    }
    
    public void updateKendaraan(Kendaraan d, String id){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE kendaraan SET model = '"+d.getModel()+"', "+ "jenis = '"+d.getJenis()+"', " + "tahunPembuatan = '"+d.getTahunPembuatan()+"', "+"noPlat = '"+d.getNoPlat()+"', "+"kapasitasPenumpang = '"+d.getKapasitasPenumpang()+"', "+"dayaAngkut = '"+d.getDayaAngkut()+"' "+"WHERE id = '"+id+"'";
        System.out.println(sql);
        System.out.println("Editing Kendaraan ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " Kendaraan "+id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing dosen...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteKendaraan(String id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM kendaraan WHERE id = '" + id + "'";
        
        System.out.println("Deleting kendaraan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " Kendaraan "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting kendaraan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}

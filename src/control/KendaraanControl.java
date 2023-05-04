package control;

import dao.kendaraanDao;
import java.util.List;
import model.Kendaraan;

public class KendaraanControl {
    private kendaraanDao dDao = new kendaraanDao();
    
    public void insertDataKendaraan(Kendaraan d){
        dDao.insertKendaraan(d);
    }
    public String showDataKendaraan(){
        List<Kendaraan> dataKendaraan = dDao.showKendaraan();
        String kendaraanString = "";
        for(int i=0; i<dataKendaraan.size(); i++){
            kendaraanString = kendaraanString + dataKendaraan.get(i).showData()+"\n";
        }
        return kendaraanString;
    }
    
    public Kendaraan searchKendaraan(String id){
        Kendaraan d = null;
        d = dDao.searchKendaraan(id);
        return d;
    }
    
    public void updateDataKendaraan(Kendaraan d, String id){
        dDao.updateKendaraan(d, id);
    }
    
    public void deleteDataKendaraan(String id){
        dDao.deleteKendaraan(id);
    }
}

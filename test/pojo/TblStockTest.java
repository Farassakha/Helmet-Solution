/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import DAO.DAOuser;
import pojo.TblStock;

/**
 *
 * @author faras sakha
 */
public class TblStockTest {
    
    public TblStockTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("///START TESTING///");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("///END TESTING///");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /*testGetAllRecords memiliki fungsi untuk mengetes berhasilnya atau tidak
    untuk menampilkan seluruh data stok dari database table. Cara mengujinya,
    kita bisa menggunakan expResult = 8 yang menandakan total dari semua stok.
    Setelah itu, kita merubah variable result menjadi Array, dan bandingkan array
    tersebut dengan expResult. Jika tes ini dijalankan dan tidak ada kendala seperti
    garis merah muncul, maka tes berhasil dijalankan.*/
    @Test
    public void testGetAllRecords() {
        System.out.println("Method Testing Get All Records");
        TblStock instance = new TblStock();
        int expResult = 8;
        List<TblStock> result = instance.getAllRecords();
        assertEquals(expResult, result.toArray().length);
    
    }

    /*testGetById memiliki fungsi untuk mencari stok barang yang kita inginkan
    dengan memasukkan id barang yang kita mau, Cara mengujinya adalah kita set
    IdBarang terlebih dahulu, kemudian membuat variable expResult dan setelah test
    dijalankan. Bisa dibandingkan test expResult dengan test result, jika tidak ada
    kendala dan data menunjukkan keberhasilan 100 persen, maka dapat dipastikan bahwa
    tes ini berjalan dengan sempurna.*/
    @Test
    public void testGetById() {
        System.out.println("Method Testing GetById/Search");
        TblStock instance = new TblStock();
        instance.setIdBarang(2);
        String expResult = "adminmenu.xhtml";
        String result = instance.getById();
        assertEquals(expResult, result);
        
    }

    /*testEdit memiliki fungsi untuk mengubah suatu stok pada database saat
    admin menekan tombol edit. Yang pertama, masukkan set mulai dari id sampai 
    jumlah stok yang ingin diubah dan membuat variable test expResult dan test
    result. Setelah itu bandingkan, jika hasil dari expResult dan result sama,
    maka test ini berhasil.*/
    @Test
    public void testEdit() {
        System.out.println("Method Testing Edit");
        
        TblStock instance = new TblStock();
        instance.setIdBarang(1);
        instance.setNamaHelm("KYT TTC");
        instance.setJenisHelm("Full Face");
        instance.setStockHelm("11");
        
        String expResult = "adminmenu.xhtml";
        String result = instance.edit();
        
        assertEquals(expResult, result);
       
    }

    /*testDelete memiliki fungsi untuk menghapus data stok pada database
    berdasarkan id yang telah dimasukkan saat admin menekan tombol delete. Pertama,
    kita masukkan id stok yang tersedia di database kemudian pilih, jika sudah maka
    kita bisa membuat variable test expResult dan test result. Ketika test ini dijalankan,
    bandingkan expResult dengan result. Jika hasilnya sama, maka tes ini berhasil dengan baik.*/
    @Test
    public void testDelete() {
        System.out.println("Method Testing Delete");
        
        TblStock instance = new TblStock();
        instance.setIdBarang(16);
        
        String expResult = "adminmenu.xhtml";
        String result = instance.delete();
       
        assertEquals(expResult, result);
        
    }
    
}

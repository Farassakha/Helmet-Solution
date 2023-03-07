/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.TblUser;

/**
 *
 * @author faras sakha
 */
public class TblUserTest {
    
    public TblUserTest() {
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

    /*testSave_user atau bisa dibilang test register befungsi untuk melakukan 
    pendaftaran akun ketika user menekan tombol register. Langkah pertama, mengisi
    set username dan password yang diinginkan kemudian membuat String expResult dan
    result. Lalu test dijalankan, jika expResult dan result sama maka test ini 
    berhasil dijalankan.*/
    @Test
    public void testSave_user() {
        System.out.println("Method Testing Save User/Register");
        
        TblUser instance = new TblUser();
        instance.setUsername("Sebastian");
        instance.setPassword("valeria");
        
        String expResult = "loginpage.xhtml";
        String result = instance.save_user();
        System.out.println("The expResult is :" + expResult);
        System.out.println("The result is :" + result);
        assertEquals(expResult, result);
    }

    /*testLogin_user befungsi untuk melakukan Login setelah user memasukkan username
    dan password dengan benar lalu menekan tombol login. Langkah pertama mengisi set 
    username dan password kemudian membuat test expResult dan result. Lalu test dijalankan,
    jika expResult dan result sama maka test ini berhasil dijalankan.*/
    @Test
    public void testLogin_user() {
        System.out.println("Method Testing Login User");
        
        TblUser instance = new TblUser();
        instance.setUsername("faras sakha");
        instance.setPassword("bluegem");
       
       // String expResult = "loginfailed.xhtml";
        String expResult = "homepage.xhtml";
        String result = instance.login_user();
        System.out.println("The expResult is :" +expResult);
        System.out.println("The result is :" + result);
        assertEquals(expResult, result);
        
    }

    
}

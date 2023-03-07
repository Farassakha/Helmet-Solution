/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.TblUser;
import DAO.DAOLogin;

/**
 *
 * @author faras sakha
 */
public class DAOLoginTest {
    
    public DAOLoginTest() {
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

    /*testLogin memiliki fungsi untuk mengetest ketika user mengetik nama dan password
    yang sesuai dengan yang ada di database akan masuk ke homepage.xhtml, caranya adalah
    membuat data yang ada di database kemudian membuat expResult. Jika hasil result sama dengan
    expResult maka bisa dibilang telah berhasil.*/
    @Test
    public void testLogin() {
        System.out.println("Method Testing Login");
        
        TblUser instance = new TblUser();
        instance.setUsername("faras sakha");
        instance.setPassword("bluegem");
        
        String expResult = "homepage.xhtml";
        String result = instance.login_user();
        System.out.println("The expResult is :" + expResult);
        System.out.println("The result is :" + result);
        assertEquals(expResult, result);

    }
    /*testAdd_User atau testRegister memiliki fungsi untuk mengetest ketika user
    mengetik nama dan password yang diinginkan lalu ketika user klik tombol register,
    nama dan password tadi akan tersimpan di database. Cara untuk testing ini yang pertama adalah,
    set username dan password terlebih dahulu kemudian jika hasilnya benar dan sesuai akan diarahkan
    ke loginpage.xhtml. Jika hasil expResult dan result sesuai maka akan dibilang berhasil.*/
    @Test
    public void testAdd_user() {
        System.out.println("Method Testing Register");
        
        TblUser user = new TblUser();
        user.setUsername("Razka Abyasa");
        user.setPassword("Indo123");
 
        DAOLogin instance = new DAOLogin();
        String expResult = "loginpage.xhtml";
        String result = instance.add_user(user);
        System.out.println("The expResult is :" + expResult);
        System.out.println("The result is :" + result);
        assertEquals(expResult, result);
    }
    
}

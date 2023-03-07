/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.TblStock;
import pojo.helmetsolution4Util;

/**
 *
 * @author faras sakha
 */
//menampilkan data ke tabel

public class DAOuser {
    
    public List <TblStock> retrieveTblStock()
    {
        List stud = new ArrayList();
        TblStock stud1 = new TblStock();
        Transaction trans = null;
        Session session = helmetsolution4Util.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblStock");
            stud = query.list();
            stud.add(stud1.getIdBarang());
            stud.add(stud1.getNamaHelm());
            stud.add(stud1.getJenisHelm());
            stud.add(stud1.getStockHelm());
            trans.commit();
        } catch (Exception e) {
            System.out.println("e");
        }
        return stud;
    }
//mencari data pada table
 
public List <TblStock> getbyID (String idS) 
{
    TblStock stk = new TblStock();
    List <TblStock> iStk = new ArrayList();
    Transaction trans = null;
    Session session = helmetsolution4Util.getSessionFactory().openSession();
    try {
        trans = session.beginTransaction();
        Query query = session.createQuery("from TblStock where id_barang=:id");
        query.setString("id", idS);
        stk = (TblStock) query.uniqueResult();
        iStk = query.list();
        trans.commit();
    } catch (Exception e) {
        System.out.println("e");
    }
    return iStk;
}  
//menghapus data pada table

public void deleteStock(Integer idS)
{
    Transaction trans = null;
    Session session = helmetsolution4Util.getSessionFactory().openSession();
    try {
        trans = session.beginTransaction();
        TblStock stk = (TblStock) session.load(TblStock.class, new Integer(idS));
        session.delete(stk);
        trans.commit();
    } catch (Exception e) {
        System.out.println("e");
    }
}
//meng-edit data pada table

public void editStock (TblStock stk)
{
    Transaction trans = null;
    Session session = helmetsolution4Util.getSessionFactory().openSession();
    try {
        trans = session.beginTransaction();
        session.update(stk);
        trans.commit();
    } catch (Exception e) {
        System.out.println("e");
    }
}      

}

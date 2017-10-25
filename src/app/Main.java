/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import beans.Cidade;
import org.hibernate.Session;
import persistencia.HibernateUtil;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        
        s.getTransaction().begin();
        
        Cidade cidade1 = new Cidade();
        cidade1.setNome("Maringa");
        cidade1.setUf("PR");
        
        Cidade cidade2 = new Cidade();
        cidade2.setNome("Sarandi");
        cidade2.setUf("PR");
        
        s.saveOrUpdate(cidade1);
        s.saveOrUpdate(cidade2);
        
        s.getTransaction().commit();
        
        s.close();
    }
}

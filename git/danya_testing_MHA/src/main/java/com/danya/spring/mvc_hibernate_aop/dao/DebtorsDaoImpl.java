package com.danya.spring.mvc_hibernate_aop.dao;

import com.danya.spring.mvc_hibernate_aop.entity.Debtors;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Queue;

@Repository
public class DebtorsDaoImpl implements DebtorsDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Debtors> getAllDebtors(int tmp) {

        Session session = sessionFactory.getCurrentSession(); // where debtor_val > 0
        Query<Debtors> queue;

        if (tmp > 100) {
            queue = session.createQuery("from Debtors", Debtors.class);
        }

        else {
            queue = session.createQuery("from Debtors where debtor_val > 0", Debtors.class);
        }

        List<Debtors> allDebtors = queue.getResultList();

        return allDebtors;
    }

    @Override
    public void saveDebtors(Debtors debtors) {
        Session session = sessionFactory.getCurrentSession();

        session.save(debtors);
    }

    @Override
    public void getDebtors(int id) {
        Session session = sessionFactory.getCurrentSession();

        Debtors debtors = session.get(Debtors.class, id);
        debtors.setDebtor_val(0);
        session.update(debtors);

        //return debtors;
    }

    //@Override
    //public void deleteDebtors(int id) {

//        Session session = sessionFactory.getCurrentSession();
//
//        Query<Debtors> query = session.createQuery("delete from Debtors " +
//                "where id =:debtorsId");
//        query.setParameter("debtorsId", id);
//        session.update();
//        query.executeUpdate();
        //}
}

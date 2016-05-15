/*    */ package com.calance.util;
/*    */ 
/*    */ import com.calance.entity.Member;
/*    */ import com.calance.helpers.Credentials;
/*    */ import java.util.List;
/*    */ import org.hibernate.Criteria;
/*    */ import org.hibernate.Session;
/*    */ import org.hibernate.SessionFactory;
/*    */ import org.hibernate.criterion.Restrictions;
/*    */ 
/*    */ public class AuthenticatorImpl
/*    */   implements IAuthenticator
/*    */ {
/*    */   public Member authenticate(Credentials credentials)
/*    */   {
/* 17 */     Session session = HibernateUtil.getSessionFactory().getCurrentSession();
/* 18 */     session.beginTransaction();
/*    */ 
/* 20 */     Criteria authenticateCriteria = session.createCriteria(Member.class);
/* 21 */     authenticateCriteria.add(Restrictions.eq("username", credentials.getUsername()))
/* 22 */       .add(Restrictions.eq("hashed_password", credentials.getPassword()));
/*    */ 
/* 24 */     List memberList = authenticateCriteria.list();
/*    */ 
/* 26 */     if (memberList.size() > 0) {
/* 27 */       return (Member)memberList.get(0);
/*    */     }
/* 29 */     return null;
/*    */   }
/*    */ }



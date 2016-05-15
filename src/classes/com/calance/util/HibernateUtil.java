/*    */ package com.calance.util;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import org.hibernate.SessionFactory;
/*    */ import org.hibernate.cfg.Configuration;
/*    */ 
/*    */ public class HibernateUtil
/*    */ {
/* 13 */   private static SessionFactory sessionFactory = null;
/*    */ 
/*    */   static
/*    */   {
/*    */     try {
/* 18 */       sessionFactory = new Configuration().configure().buildSessionFactory();
/*    */     } catch (Throwable ex) {
/* 20 */       System.err.println("Initial session factory creation failed" + ex);
/* 21 */       throw new ExceptionInInitializerError();
/*    */     }
/*    */   }
/*    */ 
/*    */   public static SessionFactory getSessionFactory() {
/* 26 */     return sessionFactory;
/*    */   }
/*    */ }


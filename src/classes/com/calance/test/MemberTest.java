/*    */ package com.calance.test;
/*    */ 
/*    */ import com.calance.entity.Member;
/*    */ import com.calance.util.HibernateUtil;
/*    */ import java.io.PrintStream;
/*    */ import java.util.List;
/*    */ import junit.framework.TestCase;
/*    */ import org.hibernate.Criteria;
/*    */ import org.hibernate.Session;
/*    */ import org.hibernate.SessionFactory;
/*    */ import org.hibernate.criterion.Restrictions;
/*    */ 
/*    */ public class MemberTest extends TestCase
/*    */ {
/* 16 */   Session session = null;
/*    */ 
/*    */   protected void setUp() throws Exception
/*    */   {
/* 20 */     this.session = HibernateUtil.getSessionFactory().getCurrentSession();
/*    */   }
/*    */ 
/*    */   public void testGetMemberDetails()
/*    */   {
/* 43 */     this.session.beginTransaction();
/* 44 */     Criteria criteria = this.session.createCriteria(Member.class);
/* 45 */     criteria.add(Restrictions.eq("username", "testUser"));
/* 46 */     List memberList = criteria.list();
/* 47 */     assertEquals(memberList.size(), 1);
/* 48 */     System.out.println(memberList.get(0));
/*    */   }
/*    */ }


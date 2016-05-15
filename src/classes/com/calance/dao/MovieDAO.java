/*    */ package com.calance.dao;
/*    */ 
/*    */ import com.calance.entity.Movie;
/*    */ import com.calance.util.HibernateUtil;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.hibernate.Query;
/*    */ import org.hibernate.Session;
/*    */ import org.hibernate.SessionFactory;
/*    */ 
/*    */ public class MovieDAO
/*    */ {
/*    */   private List<Movie> movieList;
/*    */ 
/*    */   public MovieDAO()
/*    */   {
/* 18 */     this.movieList = new ArrayList();
/*    */   }
/*    */ 
/*    */   public List<Movie> getAllMovies() {
/* 22 */     Session session = HibernateUtil.getSessionFactory().getCurrentSession();
/* 23 */     session.beginTransaction();
/*    */ 
/* 25 */     Query allMoviesQuery = session.createQuery("from com.calance.entity.Movie");
/* 26 */     this.movieList = allMoviesQuery.list();
/*    */ 
/* 28 */     return this.movieList;
/*    */   }
/*    */ }


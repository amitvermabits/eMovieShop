/*    */ package com.calance.test;
/*    */ 
/*    */ import com.calance.dao.MovieDAO;
/*    */ import com.calance.entity.DueDays;
/*    */ import com.calance.entity.Movie;
/*    */ import java.io.PrintStream;
import java.util.Iterator;
/*    */ import java.util.List;
import junit.framework.TestCase;
/*    */ 
/*    */ public class MovieDAOTest extends TestCase
/*    */ {
/*    */   protected void setUp()
/*    */     throws Exception
/*    */   {
/* 13 */     super.setUp();
/*    */   }
/*    */ 
/*    */   public void testGetAllMovies() {
/* 17 */     MovieDAO movieDao = new MovieDAO();
/* 18 */     List movies = movieDao.getAllMovies();
/* 19 */     assertNotNull(movies);
/* 20 */     if(movies != null){
	  Iterator itr = movies.iterator(); 
	  while(itr.hasNext()) {


/* 132 */       Movie movie = (Movie) itr.next();

/* 21 */       System.out.println(movie);
/* 22 */       assertNotNull(movie.getDueDays());
/* 23 */       System.out.println(movie.getDueDays().getDue_in_days());
/*    */     }
	  }
/*    */   }
/*    */ }


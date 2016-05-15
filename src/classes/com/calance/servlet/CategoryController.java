/*    */ package com.calance.servlet;
/*    */ 
/*    */ import com.calance.dao.MovieDAO;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ 
/*    */ public class CategoryController extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 33 */     super.doGet(request, response);
/*    */   }
/*    */ 
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 42 */     String category = request.getParameter("categories");
/*    */ 
/* 44 */     if ("movies".equalsIgnoreCase(category))
/*    */     {
/* 46 */       MovieDAO movieDAO = new MovieDAO();
/* 47 */       List movies = movieDAO.getAllMovies();
/* 48 */       request.getSession().setAttribute("collection", movies);
/*    */     }
/* 50 */     Forwarder.forward("/WEB-INF/jsp/member/memberHome.jsp", request, response);
/*    */   }
/*    */ }


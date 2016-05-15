/*    */ package com.calance.servlet;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import javax.servlet.RequestDispatcher;
/*    */ import javax.servlet.ServletContext;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ 
/*    */ public class Forwarder
/*    */ {
/*    */   public static void forward(String address, HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 14 */     RequestDispatcher dispatcher = request.getSession().getServletContext()
/* 15 */       .getRequestDispatcher(address);
/* 16 */     dispatcher.forward(request, response);
/*    */   }
/*    */ }


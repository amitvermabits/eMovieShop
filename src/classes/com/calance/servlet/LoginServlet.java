/*    */ package com.calance.servlet;
/*    */ 
/*    */ import com.calance.entity.Member;
/*    */ import com.calance.helpers.Credentials;
/*    */ import com.calance.util.AuthenticatorImpl;
/*    */ import com.calance.util.IAuthenticator;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
		 import javax.servlet.RequestDispatcher;
/*    */ 
/*    */ public class LoginServlet extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 35 */     super.doGet(request, response);
/*    */   }
/*    */ 
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 43 */     response.setContentType("text/html");
/* 44 */     PrintWriter out = response.getWriter();
/* 45 */     Credentials credentials = new Credentials();
/* 46 */     IAuthenticator authenticator = new AuthenticatorImpl();
/*    */ 
/* 48 */     credentials.setUsername(request.getParameter("username"));
/* 49 */     credentials.setPassword(request.getParameter("password"));
/*    */ 
/* 51 */     Member member = authenticator.authenticate(credentials);
/* 52 */     if (member != null)
/*    */     {
/* 55 */       request.getSession().setAttribute("user", member);

			   /*RequestDispatcher requestDispatcher ;
			   requestDispatcher  = request.getRequestDispatcher("/WEB-INF/jsp/member/memberHome.jsp" ) ;
			   requestDispatcher.forward( request, response ) ;*/
/* 56 */       Forwarder.forward("/WEB-INF/jsp/member/memberHome.jsp", request, response);
/*    */     }
/*    */     else
/*    */     {
/* 60 */       out.write("<font color=red><br>Invalid username/password</font></br>");
/*    */     }
/*    */   }
/*    */ }


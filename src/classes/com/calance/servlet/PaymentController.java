/*    */ package com.calance.servlet;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
		 import com.calance.entity.Member;
		 import java.io.PrintWriter;  
		 import javax.servlet.http.HttpSession;
/*    */ 
/*    */ public class PaymentController extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 28 */     //super.doGet(request, response);
			Member member = (Member)request.getSession().getAttribute("user");
			PrintWriter out = response.getWriter();
			if(member != null){
				out.println("<HTML> <HEAD> <TITLE>eMovieShop</TITLE> </HEAD> <BODY>");  
				out.println("Thanks "+member.getUsername()); 
				out.println("The Requested Items will be delivered in your address in 24 hours.");
				out.println("</BODY> </HTML>"); 
			}else{
				out.println("<HTML> <HEAD> <TITLE>eMovieShop</TITLE> </HEAD> <BODY>");  
				out.println("Please login again.. "); 
			}
	  
			out.close();
/*    */   }
/*    */ 
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/*    */   }
/*    */ }


package com.sathya.numbers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletNumber1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer startno=	Integer.parseInt(request.getParameter("startno"));
		Integer endno=	Integer.parseInt(request.getParameter("endno"));
		String action=request.getParameter("numbers");
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		switch(action)
		{
				case "even":  for(Integer i=startno;i<=endno;i++)
		              		  {
							    if(i%2==0)
							    {
							    	result.add(i);
							    }
					          }
				              break;						
				case "odd": 	for(Integer i=startno;i<=endno;i++)
							   {
							 	if(i%2!=0)
								{
									result.add(i);
								}
							  }
								break;
								
				case "prime": 	for(Integer i=startno;i<=endno;i++)
								{int fact=0;
									for(int j=2;j<i;j++)
									{
										if(i%j==0)
										{
											fact++;
											break;
										}
									}
									if(fact==0)
									{
										result.add(i);
									}
								}
								break;
								
				case "perfect":   for(Integer i=startno;i<=endno;i++)
								  {int sum=0;
									for(int j=1;j<=i/2;j++)
									{
										if(i%j==0)
										{
											sum +=j;
										}
									}
									if(sum==i)
									{
										result.add(i);
									}
								  }
								  break;
				case "strong":	for(Integer i=startno;i<=endno;i++)
								{int temp=i,sum=0;
									while(temp!=0)
									{
										int digit=temp%10;
										int fact=1;
										for(int j=1;j<=digit;j++)
										{
											fact *= j;
										}
										sum += fact;
										temp /= 10;
									}
									if(sum==i)
									{
										result.add(i);
									}
								}
								break;
								
				case "armstrong": for(Integer i=startno;i<=endno;i++)
								  {
										int temp1=i,temp2=i;
										int sum=0,count=0;
										while(temp1!=0)
										{
											temp1 /= 10;
											count++;
										}					
										
										while(temp2!=0)
										{
											int digit=temp2%10;
											 sum += (int)Math.pow(digit, count);
											temp2 /= 10;
										}		
										if(sum==i)
										{
											result.add(i);
										}	
								   }
									break;
									
								  
	
	}

		//render the response
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
	
		RequestDispatcher dispatcher=request.getRequestDispatcher("numbersgen.html");
		dispatcher.include(request, response);
		writer.println("result="+result);
		
	}	
}
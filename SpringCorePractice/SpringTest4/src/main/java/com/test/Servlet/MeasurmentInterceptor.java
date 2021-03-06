package com.test.Servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/*
public class MeasurmentInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("1234");
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		long startTime = (Long)request.getAttribute("startTime");
		request.removeAttribute("startTime");
		
		long endTime = System.currentTimeMillis();
		modelAndView.addObject("handlingTime",endTime-startTime);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}	

}
*/

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
@Configuration
public class MeasurmentInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		// TODO Auto-generated method stub
		
		return true;
	}

	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		
		long startTime = (Long)request.getAttribute("startTime");
		request.removeAttribute("startTime");
		
		long endTime = System.currentTimeMillis();
		modelAndView.addObject("handlingTime",endTime-startTime);
	}
}
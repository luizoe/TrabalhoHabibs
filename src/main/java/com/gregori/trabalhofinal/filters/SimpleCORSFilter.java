package com.gregori.trabalhofinal.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class SimpleCORSFilter implements Filter {

	public SimpleCORSFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init( FilterConfig filterConfig ) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter( ServletRequest req, ServletResponse res, FilterChain chain ) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse)res;
		response.setHeader( "Access-Control-Allow-Origin", "*" );
		response.setHeader( "Access-Control-Allow-Methods", "PATCH, POST, GET, PUT, OPTIONS, DELETE" );
		response.setHeader( "Access-Control-Max-Age", "3600" );
		response.setHeader( "Access-Control-Allow-Headers", "Location, Origin, X-Requested-With, Content-Type, Accept" );
		response.setHeader( "Access-Control-Expose-Headers", "*" );
		chain.doFilter( req, res );
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}

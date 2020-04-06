package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class UserLoginZuulFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext currentContext = RequestContext.getCurrentContext();
		HttpServletRequest request = currentContext.getRequest();
		String userId = request.getParameter("userId");
		if(StringUtils.isEmpty(userId)) {
			currentContext.setSendZuulResponse(false);
			currentContext.setResponseStatusCode(401);
			try {
				currentContext.getResponse().getWriter().write("userId is empty");
			} catch (IOException e) {
				e.printStackTrace();
			}
		 return null;
		}
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}

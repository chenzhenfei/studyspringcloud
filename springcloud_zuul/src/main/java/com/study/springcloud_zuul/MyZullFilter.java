package com.study.springcloud_zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


/**
 * Zuul 的过滤器
 */
@Component
public class MyZullFilter extends ZuulFilter {
    private static Logger log=Logger.getLogger(MyZullFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }


    /**
     * 过滤的逻辑类
     * @return
     */
    @Override
    public Object run() {
       /* RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("filter");
        String refer=request.getHeader("refer");
        if (accessToken != null) {
            return null;
        }

        log.warn("token is empty");
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
        try {
            ctx.getResponse().getWriter().write("token is empty");
        } catch (Exception e) {
        }*/
        return null;
    }
}

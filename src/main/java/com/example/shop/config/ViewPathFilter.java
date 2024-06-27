package com.example.shop.config;

import java.io.IOException;

import com.example.shop.util.TeamColor;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebFilter("/customers/*")
public class ViewPathFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 필터 초기화 작업
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // 요청 경로에 customer-management/ 경로 추가
    	HttpServletRequest httpRequest = (HttpServletRequest) request;
        String originalPath = httpRequest.getServletPath();
        log.debug(TeamColor.ANSI_RED+TeamColor.ANSI_CYAN_BACKGROUND+"originalPath : "+originalPath+TeamColor.RESET);
        chain.doFilter(request, response);
        
    }

    @Override
    public void destroy() {
        // 필터 종료 작업
    }
}

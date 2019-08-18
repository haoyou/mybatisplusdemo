package com.chy.mybatisplusdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * com.chy.mybatisplusdemo.controller.*.*(..))")
    public void weblog(){}

    @Before("weblog()")
    public void doBefore(JoinPoint joinPoint) throws UnknownHostException {
        //接收请求 记录参数
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("============request=================");
        logger.info("URL : "+ request.getRequestURL().toString());
        //记录请求到日志中 url httpmethod ip classmethod args
        logger.info("URI :  "+request.getRequestURI().toString());
        logger.info("http_method :  "+request.getMethod().toString());
        logger.info("ip :  "+request.getRemoteAddr());
        logger.info("class_method : "+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logger.info("args :  "+ Arrays.toString(joinPoint.getArgs()));
        logger.info("============END=================");
    }
    @AfterReturning(returning="response",pointcut="weblog()")
    public void doAfter(Object response){
        logger.info("============response=================");
        //处理完请求 返回内容
        logger.info("response : "+ response);
        logger.info("============END=================");
    }

}

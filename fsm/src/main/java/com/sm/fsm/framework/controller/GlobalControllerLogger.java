package com.sm.fsm.framework.controller;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Aspect
@Component
public class GlobalControllerLogger implements InitializingBean {

	private static final Logger LOG = LoggerFactory.getLogger(GlobalControllerLogger.class);
	
	@Before("execution(* com.sm.fsm.domain.*..controller.*.*(..)) && args(request,..)")
    public void before(JoinPoint joinPoint, HttpServletRequest request) {
    	
    	LOG.debug("[api][{}][{}?{}][{}]",
    			request.getMethod(),
    			request.getRequestURI(),
    			Optional.ofNullable(request.getQueryString()).orElse(""),
    			this.parseRequestBody(joinPoint));
    }
	
    public Object parseRequestBody(JoinPoint joinPoint) {
        Method controllerMethod = MethodSignature.class.cast(joinPoint.getSignature()).getMethod();
        Object[] methodParameterTypeAndValue = joinPoint.getArgs();
        return this.parseRequestBodyDto(controllerMethod, methodParameterTypeAndValue);
    }
    
    public Object parseRequestBodyDto(Method method, Object[] methodParameterTypeAndValue) {
        Parameter[] methodParameters = method.getParameters();
        for(int index = 0; index < methodParameters.length; index++) {
            if(isRequestBodyParameter(methodParameters[index])) {
                return methodParameterTypeAndValue[index];
            }
        }
        return null;
    }
    
    public boolean isRequestBodyParameter(Parameter methodParam) {
    	return methodParam.getDeclaredAnnotation(RequestBody.class) != null;
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		LOG.debug("[@configuration] has initialize...");
	}
}

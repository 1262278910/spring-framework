package com.reach.springTest.test.replaceMethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @auther pan_yhao
 * @date 2025/12/18 16:47
 */
public class TestMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("替换了原有方法=========================>");
		return null;
	}
}

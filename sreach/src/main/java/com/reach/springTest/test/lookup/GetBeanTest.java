package com.reach.springTest.test.lookup;

/**
 * TODO
 *
 * @auther pan_yhao
 * @date 2025/12/18 15:51
 */
public abstract class GetBeanTest {

	public void showMe(){
		getBean().showMe();
	}

	public abstract User getBean();
}

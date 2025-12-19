package com.reach.springTest;

import java.util.List;

/**
 * TODO
 *
 * @auther pan_yhao
 * @date 2025/5/27 20:30
 */
public class SimpleBean {

	//无参构造 写了有参构造后 想使用无参构造必须手动声明
	//如果没有有参构造 java 编译器会自动提供一个
	public SimpleBean(){
	}

	public SimpleBean(String name, Integer age, List<String> colors){
		this.name=name;
		this.age=age;
		this.colors=colors;
	}

	private String name = "reach666=============";

	private Integer age = 27;

	private List<String> colors;

	private List<Integer> nums;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public List<Integer> getNums() {
		return nums;
	}

	public void setNums(List<Integer> nums) {
		this.nums = nums;
	}
}

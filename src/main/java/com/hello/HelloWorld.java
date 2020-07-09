package com.hello;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelloWorld {

	private String message;
	private List countryList;
	private Set countrySet;
	private Map countryMap;
	private Properties countryProp;

	public HelloWorld() {
		System.out.println("1-Bean constructor called");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void init() {
		System.out.println("3-Bean init method called");
	}

	public void destroy() {
		System.out.println("5-Bean destroy method called");
	}

	public List getCountryList() {
		System.out.println("Country List " + countryList);
		return countryList;
	}

	public void setCountryList(List countryList) {
		this.countryList = countryList;
	}

	public Set getCountrySet() {
		System.out.println("Country Set " + countrySet);
		return countrySet;
	}

	public void setCountrySet(Set countrySet) {
		this.countrySet = countrySet;
	}

	public Map getCountryMap() {
		System.out.println("Country Map " + countryMap);
		return countryMap;
	}

	public void setCountryMap(Map countryMap) {
		this.countryMap = countryMap;
	}

	public Properties getCountryProp() {
		System.out.println("Country Prop " + countryProp);
		return countryProp;
	}

	public void setCountryProp(Properties countryProp) {
		this.countryProp = countryProp;
	}
	
	
}

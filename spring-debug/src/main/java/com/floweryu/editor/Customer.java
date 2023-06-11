package com.floweryu.editor;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Floweryu
 * @date 2023/6/11 15:47
 */
public class Customer {

	@Value("${customer.name}")
	private String name;

	@Value("${customer.address}")
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}

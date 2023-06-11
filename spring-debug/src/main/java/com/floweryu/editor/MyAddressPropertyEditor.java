package com.floweryu.editor;

import java.beans.PropertyEditorSupport;

/**
 * @author Floweryu
 * @date 2023/6/11 16:55
 */
public class MyAddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address as = new Address();
		as.setProvince(s[0]);
		as.setCity(s[1]);
		as.setTown(s[2]);
		this.setValue(as);
	}
}

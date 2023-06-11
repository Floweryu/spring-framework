package com.floweryu.editor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * 注册自定义属性编辑器
 * @author Floweryu
 * @date 2023/6/11 16:59
 */
public class MyAddressPropertyEditorRegistrar implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class, new MyAddressPropertyEditor());
	}
}

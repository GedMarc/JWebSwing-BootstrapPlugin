package com.jwebmp.plugins.bootstrap.forms.groups.sets;

import com.jwebmp.BaseTestClass;
import com.jwebmp.base.html.Span;
import com.jwebmp.plugins.bootstrap.forms.controls.BSFormTextInput;
import org.junit.jupiter.api.Test;

public class BSFormInputGroupTest
		extends BaseTestClass
{
	@Test
	public void getInputGroupAddons()
	{
		BSFormInputGroup inputGroup = new BSFormInputGroup(new BSFormTextInput());
		inputGroup.getInputGroupAddons()
		          .add(new Span("@"));

		System.out.println(inputGroup.toString(0));
	}

}

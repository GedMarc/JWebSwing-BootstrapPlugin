/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap.forms.groups.sets;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap.forms.BSFormLabel;
import com.jwebmp.plugins.bootstrap.forms.groups.BSComponentFormGroupOptions;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroup;

/**
 * A bootstrap formatted radio button
 *
 * @param <J>
 *
 * @author GedMarc
 * @since 18 Jan 2017
 */
public class BSFormCheckGroup<J extends BSFormCheckGroup<J>>
		extends BSFormGroup<J>
		implements BSFormSetChildren<IComponentHierarchyBase, J>
{


	/**
	 * Constructs a new instance of a group of items that denote a single radio button.
	 * <p>
	 * Place inside a BS Form Set
	 *
	 * @param label
	 * @param inputComponent
	 * @param helpText
	 * @param value
	 *
	 * @see BSFormSet
	 */
	public BSFormCheckGroup(BSFormLabel label, BSFormCheckInput inputComponent, String helpText, String value)
	{
		super(label, inputComponent, helpText);
		inputComponent.addAttribute("value", value);

	}

	/**
	 * Adds all the necessary items
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addClass(BSComponentFormGroupOptions.Form_Check);
			getLabel().addClass(BSComponentFormGroupOptions.Form_Check_Label);
			removeClass(BSComponentFormGroupOptions.Form_Group);

			getLabel().add(getInputComponent());
			getLabel().setRenderTextBeforeChildren(false);
			add(getLabel());
		}
		super.preConfigure();
	}
}

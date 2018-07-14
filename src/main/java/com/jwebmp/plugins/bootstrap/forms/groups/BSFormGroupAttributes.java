/*
 * Copyright (C) 2017 Marc Magon
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
package com.jwebmp.plugins.bootstrap.forms.groups;

import com.jwebmp.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.utilities.StaticStrings;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * @author GedMarc
 */
public enum BSFormGroupAttributes
		implements AttributeDefinitions
{
	Visibility;

	private boolean isKeyword;

	/**
	 * The component attributes
	 */
	BSFormGroupAttributes()
	{
	}

	/**
	 * If the attribute is a keyword
	 *
	 * @return
	 */
	@Override
	public boolean isKeyword()
	{
		return isKeyword;
	}

	/**
	 * Returns the attribute name replacing all underscores with dashes and all dollar signs to empty
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH)
		             .replace("$", "");
	}
}
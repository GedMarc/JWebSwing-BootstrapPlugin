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
package com.jwebmp.plugins.bootstrap.dropdown;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.utilities.StaticStrings;

/**
 * The Link Button for a drop down
 * <p>
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included Bootstrap dropdown JavaScript plugin. They’re
 * toggled by clicking,
 * not by hovering; this is an intentional design decision.
 *
 * @author GedMarc
 * @since 13 Jan 2017
 */
public class BSDropDownLink
		extends Link
		implements BSDropDownChildren
{


	/**
	 * Constructs a new bootstrap drop down link item
	 */
	public BSDropDownLink()
	{
		addAttribute(LinkAttributes.HRef, StaticStrings.STRING_HASH);
		addAttribute(LinkAttributes.Data_Toggle, "dropdown");
		addAttribute(GlobalAttributes.Aria_HasPopup, "true");
		addAttribute(GlobalAttributes.Aria_Expanded, "false");
		addClass(BSComponentDropDownOptions.Dropdown_Toggle);
	}
}

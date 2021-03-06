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
package com.jwebmp.plugins.bootstrap.collapse;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;

/**
 * Collapse
 * <p>
 * The Bootstrap collapse plugin allows you to toggle content on your pages with a few classes thanks to some helpful JavaScript.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Collapse",
		description = "The Bootstrap collapse plugin allows you to toggle content on your pages with a few classes thanks to some helpful JavaScript.",
		url = "https://v4-alpha.getbootstrap.com/components/collapse/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSCollapse
{
	private static final String Collapse = "collapse";


	BSCollapse()
	{
	}

	/**
	 * Apply a collapse to given components
	 *
	 * @param linkController
	 * @param display
	 * @param hideOnStart
	 */
	public static void link(Link linkController, ComponentHierarchyBase display, boolean hideOnStart)
	{
		if (display != null)
		{
			display.addClass(Collapse);
			if (!hideOnStart)
			{

				display.addClass(BSDefaultOptions.Show);

			}
			linkController.addAttribute("aria-controls", display.getID());
			linkController.addAttribute(LinkAttributes.Data_Target.toString(), display.getID(true));
		}

		linkController.addAttribute(LinkAttributes.Data_Toggle, Collapse);
		linkController.addAttribute(GlobalAttributes.Aria_Expanded, Boolean.toString(!hideOnStart));

	}

	/**
	 * Apply a collapse to given components
	 *
	 * @param buttonController
	 * @param display
	 * @param hideOnStart
	 */
	public static void link(Button buttonController, ComponentHierarchyBase display, boolean hideOnStart)
	{
		if (display != null)
		{
			display.addClass(Collapse);
			if (!hideOnStart)
			{
				display.addClass("in");
			}

			buttonController.addAttribute("aria-controls", display.getID());
			buttonController.addAttribute("data-target", display.getID(true));
		}

		buttonController.addAttribute("data-toggle", Collapse);
		buttonController.addAttribute("aria-expanded", Boolean.toString(!hideOnStart));
	}
}

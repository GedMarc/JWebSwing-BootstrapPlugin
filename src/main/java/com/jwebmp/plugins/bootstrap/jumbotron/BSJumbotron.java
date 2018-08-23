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
package com.jwebmp.plugins.bootstrap.jumbotron;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Jumbotron
 * <p>
 * A lightweight, flexible component that can optionally extend the entire viewport to showcase key marketing messages on your site.
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 18 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Jumbotron",
		description = "A lightweight, flexible component that can optionally extend the entire viewport to showcase key marketing messages on your site.",
		url = "https://v4-alpha.getbootstrap.com/components/jumbotron/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSJumbotron<J extends BSJumbotron<J>>
		extends Div<IComponentHierarchyBase, BSJumbotronAttributes, GlobalFeatures, GlobalEvents, J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new instance
	 * <p>
	 */
	public BSJumbotron()
	{
		this((String) null);
	}

	/**
	 * Constructs a new instance
	 *
	 * @param text
	 */
	public BSJumbotron(String text)
	{
		super(text);
		addClass(BSComponentJumbotronOptions.Jumbotron);

	}

	/**
	 * Constructs a new instance
	 *
	 * @param jumbotronType
	 */
	public BSJumbotron(BSComponentJumbotronOptions... jumbotronType)
	{
		this((String) null);
		for (BSComponentJumbotronOptions bSComponentJumbotronOptions : jumbotronType)
		{
			addClass(bSComponentJumbotronOptions);
		}
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 79 * hash + (getID().hashCode());
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		return super.equals(obj);
	}

}

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
package com.jwebmp.plugins.bootstrap.carousel;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

/**
 * Contains each carousel slide
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCarouselItem
		extends Div<IComponentHierarchyBase, NoAttributes, GlobalFeatures, GlobalEvents, BSCarouselItem>
{


	/**
	 * Contains each carousel slide
	 */
	public BSCarouselItem()
	{
		addClass(BSComponentCarouselOptions.Carousel_Item);
	}

	/**
	 * Optional captions
	 * <p>
	 * Add captions to your slides easily with the .carousel-caption element within any .carousel-item. Place just about any optional HTML within there and it will be automatically
	 * aligned and
	 * formatted.
	 *
	 * @param caption
	 *
	 * @return
	 */
	public BSCarouselItem addCaption(BSCarouselCaption caption)
	{
		super.add(caption);
		return this;
	}
}

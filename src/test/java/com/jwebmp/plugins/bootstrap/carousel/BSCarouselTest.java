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

import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.plugins.bootstrap.carousel.events.BSCarouselSlidEvent;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSCarouselTest

{

	public BSCarouselTest()
	{
	}

	@Test
	public void testSomeMethod()
	{

		BSCarousel car = new BSCarousel();
		BSCarouselItem ci = new BSCarouselItem();
		ci.addCaption(new BSCarouselCaption("Caption"));
		car.getSlides()
		   .add(ci);

		car.setAnimateOnLoad(true);

		System.out.println(car.toString(true));
	}

	@Test
	public void testOnDemand()
	{
		BSCarousel car = new BSCarousel();
		BSCarouselItem ci = new BSCarouselItem();
		ci.addCaption(new BSCarouselCaption("Caption"));
		car.getSlides()
		   .add(ci);

		car.addEvent(new BSCarouselSlidEvent(car)
		{
			@Override
			public void onSlid(AjaxCall call, AjaxResponse response)
			{
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}

		});
	}

}

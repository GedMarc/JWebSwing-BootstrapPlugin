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
package za.co.mmagon.jwebswing.plugins.bootstrap.cards.parts;

import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCardChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSComponentCardOptions;

/**
 * Image overlays
 * <p>
 * Turn an image into a card background and overlay your card’s text. Depending on the image, you may or may not need .card-inverse (see below).
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardImageOverlay<J extends BSCardImageOverlay<J>> extends BSCardBody<J>
		implements BSCardChildren
{

	private static final long serialVersionUID = 1L;

	/**
	 * Image overlays
	 * <p>
	 * Turn an image into a card background and overlay your card’s text. Depending on the image, you may or may not need .card-inverse (see below).
	 */
	public BSCardImageOverlay()
	{
		this(null);
	}

	/**
	 * Image overlays
	 * <p>
	 * Turn an image into a card background and overlay your card’s text. Depending on the image, you may or may not need .card-inverse (see below).
	 *
	 * @param text
	 */
	public BSCardImageOverlay(String text)
	{
		add(text, true);
		removeClass(BSComponentCardOptions.Card_Body);
		addClass(BSComponentCardOptions.Card_Img_Overlay);
	}

}
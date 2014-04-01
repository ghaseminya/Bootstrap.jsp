/*
 * Copyright (c) 2014 Darren Scott - All Rights Reserved
 * 
 * This program is distributed under LGPL Version 2.1 in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY.
 */
package org.bootstrapjsp.tags.core.misc;

import org.bootstrapjsp.dialect.Html;
import org.bootstrapjsp.tags.Component;
import org.tldgen.annotations.BodyContent;
import org.tldgen.annotations.Tag;

@Tag(name="buttontoolbar",bodyContent=BodyContent.SCRIPTLESS,dynamicAttributes=true)
public class ButtonToolbar extends Component {

	public ButtonToolbar() {
		super(Html.DIV_ELEMENT);
		super.setAttribute(Html.CLASS_ATTRIBUTE, "btn-toolbar");
		super.setAttribute(Html.ROLE_ATTRIBUTE, "toolbar");
	}
}
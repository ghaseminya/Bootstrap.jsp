/*
 * Copyright (c) 2014 Darren Scott - All Rights Reserved
 * 
 * This program is distributed under LGPL Version 2.1 in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY.
 */
package org.bootstrapjsp.tags.core.modal;

import org.bootstrapjsp.dialect.Html;
import org.bootstrapjsp.tags.Component;
import org.tldgen.annotations.BodyContent;
import org.tldgen.annotations.Tag;

@Tag(name="modalcontent",bodyContent=BodyContent.SCRIPTLESS,dynamicAttributes=true)
public class ModalContent extends Component {

	public ModalContent() {
		super(Html.DIV_ELEMENT);
		super.setAttribute(Html.CLASS_ATTRIBUTE, "modal-content");
	}
	
}
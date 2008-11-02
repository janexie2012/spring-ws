package com.marvelution.samples.spring.ws.annotated.action.endpoint.with.attachments;

import javax.activation.DataHandler;

public class ImageLibraryImpl implements ImageLibrary {

	public String addImage(String imageFileName, DataHandler image) {
		return "Added Image [" + imageFileName + "] from File [" + image.getContentType() + "]";
	}
	
}

package com.marvelution.samples.spring.ws.annotated.action.endpoint.with.attachments;

import javax.activation.DataHandler;

public interface ImageLibrary {
	
	public String addImage(String imageFileName, DataHandler image);
	
}

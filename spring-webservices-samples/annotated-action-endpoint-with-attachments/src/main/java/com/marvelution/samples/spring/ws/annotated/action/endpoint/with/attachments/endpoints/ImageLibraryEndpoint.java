package com.marvelution.samples.spring.ws.annotated.action.endpoint.with.attachments.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.soap.addressing.server.annotation.Action;

import com.marvelution.samples.schemas.imagelibraryserviceschema.AddImage;
import com.marvelution.samples.schemas.imagelibraryserviceschema.AddImageResponse;
import com.marvelution.samples.schemas.imagelibraryserviceschema.ObjectFactory;
import com.marvelution.samples.spring.ws.annotated.action.endpoint.with.attachments.ImageLibrary;

@Endpoint
public class ImageLibraryEndpoint {

	private final ImageLibrary imageLibrary;
	private final ObjectFactory factory;

	public ImageLibraryEndpoint(ImageLibrary imageLibrary, ObjectFactory factory) {
		this.imageLibrary = imageLibrary;
		this.factory = factory;
	}

	@Action("http://www.marvelution.com/samples/definitions/ImageLibraryService/AddImage")
	public AddImageResponse addImage(AddImage addImage) {
		AddImageResponse response = factory.createAddImageResponse();
		response.setResult(imageLibrary.addImage(addImage.getImageFileName(), addImage.getImage()));
		return response;
	}

}

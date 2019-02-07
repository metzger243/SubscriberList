package com.tts.SubscriberList.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tts.SubscriberList.models.Subscriber;

@Controller
public class SubscriberController {

	@GetMapping(value="/")
	public String index(Subscriber subscriber) {
		return "subscriber/index";
	}
}

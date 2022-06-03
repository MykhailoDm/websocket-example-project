package com.example.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ContentController {


	@MessageMapping("/message")
	@SendTo("/topic/contents")
	public ContentDTO sendContent(MessageDTO messageDTO) {
		return new ContentDTO("Message: " + HtmlUtils.htmlEscape(messageDTO.getMessage()) + "");
	}

}

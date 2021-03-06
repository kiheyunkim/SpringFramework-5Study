package com.Kiheyunkim.SpringChatbot.ChatMessage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Kiheyunkim.SpringChatbot.ChatMessage.Model.ChatAddMessage;
import com.Kiheyunkim.SpringChatbot.ChatMessage.Model.ChatMessage;
import com.Kiheyunkim.SpringChatbot.ChatMessage.Service.ChatMessageService;

@Controller
@RequestMapping(value = "/Message")
public class ChatMessageController {
	
	private ChatMessageService chatMessageService;
	
	@Lazy
	@Autowired
	public ChatMessageController(ChatMessageService chatMessageService){
		this.chatMessageService = chatMessageService;
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public @ResponseBody ChatMessage getMessage(ChatMessage chatMessage) {
		System.out.println(chatMessage.getMessage());
		ChatMessage answer = chatMessageService.getAnswer(chatMessage);
		
		return answer;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody ChatMessage addMessage(ChatAddMessage chatAddMessage) {
		ChatMessage answer =  chatMessageService.addAnswer(chatAddMessage);
		
		return answer;
	}
	
	@GetMapping(value = "/hi")
	public String defaultPage() {
		System.out.println("hi");
		return "home";
	}
}

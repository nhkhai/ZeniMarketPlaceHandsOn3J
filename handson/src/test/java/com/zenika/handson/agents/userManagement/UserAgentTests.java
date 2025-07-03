package com.zenika.handson.agents.userManagement;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.zenika.handson.services.PromptBeanService;

import static com.zenika.handson.constant.PromptContants.GENERAL_MARKET_PLACE_PROMPT;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserAgentTests {

	/*
	 * Import with @Autowired the ChatClient bean for the user agent
	 */
	@Autowired
	ChatClient userManagementChatClient;
	@Autowired
	PromptBeanService promptBeanService;

	private static final Logger logger = LoggerFactory.getLogger(UserAgentTests.class);

	@Test
	void getExistingUserById() {

		String userPrompt = GENERAL_MARKET_PLACE_PROMPT + this.promptBeanService.getBeanDefinitionDescription("userManagementChatClient");
		String response = userManagementChatClient.prompt()
				.system(userPrompt)
				.user("can you return the name and only the name of the user with id 1")
				.call()
				.content();
		logger.info(response);
		assertThat(response).isNotEmpty();
	}



}

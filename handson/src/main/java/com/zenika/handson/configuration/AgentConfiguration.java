package com.zenika.handson.configuration;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.PromptChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import static com.zenika.handson.constant.PromptContants.GENERAL_MARKET_PLACE_PROMPT;

@Configuration
public class AgentConfiguration {
    @Bean
    ChatClient sellerAgentChatClient(ChatClient.Builder chatClientBuilder) {
        /**
         * Create a ChatClient instance for the seller agent.
         * This client will be used to interact with the OpenAI API.
         */
        return chatClientBuilder.defaultSystem(GENERAL_MARKET_PLACE_PROMPT).build();
    }

    @Bean
    PromptChatMemoryAdvisor defaultChatMemoryAdvisor() {
        /**
         * Create a PromptChatMemoryAdvisor instance that will be used to store the conversation history.
         * This advisor will be used by the ChatClient to keep track of the conversation.
         */
        return PromptChatMemoryAdvisor.builder()
    }
}

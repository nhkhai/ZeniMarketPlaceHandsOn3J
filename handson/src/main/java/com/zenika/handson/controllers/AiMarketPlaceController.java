package com.zenika.handson.controllers;

import com.zenika.handson.services.AgentService;
import com.zenika.handson.services.PromptBeanService;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.web.bind.annotation.*;


import static com.zenika.handson.constant.PromptContants.GENERAL_MARKET_PLACE_PROMPT;

/**
 * Controller for handling AI marketplace related requests.
 * This controller provides endpoints to interact with the AI marketplace,
 * including agent routing and chat client management.
 */

@RestController
@RequestMapping("/api/marketplace")
public class AiMarketPlaceController {

    private final AgentService agentService;
    private final PromptBeanService promptBeanService;
    /**
     * Constructor for AiMarketPlaceController.
     *
     * @param agentService       Service to handle agent routing and chat client management.
     * @param promptBeanService  Service to handle bean definitions and descriptions.
     */
    public AiMarketPlaceController(AgentService agentService, PromptBeanService promptBeanService) {
        this.agentService = agentService;
        this.promptBeanService = promptBeanService;
    }

}

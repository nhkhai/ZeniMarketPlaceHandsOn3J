package com.zenika.mcp_server.config;

import com.zenika.mcp_server.model.OrderRequest;
import com.zenika.mcp_server.model.OrderResponse;
import com.zenika.mcp_server.model.ProductResponseList;
import com.zenika.mcp_server.model.UserResponse;
import com.zenika.mcp_server.service.StoreService;
import com.zenika.mcp_server.service.UserService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

/**
 * === WORKSHOP TASK ===
 *
 * Your task is to expose useful methods from `StoreService` as Tools for AI usage.
 *
 * 1. Inject the `StoreService` bean using constructor injection.
 * 2. Create public methods and annotate them with `@Tool`.
 *    - Define a clear `name` and `description` for each tool.
 *    - Delegate the method to the appropriate `StoreService` method.
 *
 * Tip: These tools will be called by an AI agent, so make sure their purpose is clear.
 */
@Component
public class StoreTools {

    private final StoreService storeService;
    private final UserService userService;

    public StoreTools(StoreService storeService, UserService userService) {
        this.storeService = storeService;
        this.userService = userService;
    }

    /**
     * === WORKSHOP TASK ===
     *
     * Expose a tool that lets the AI search for products by a free-text query.
     *
     * 1. Use the `@Tool` annotation with an appropriate name and description.
     * 2. Accept a `String query` parameter from the caller.
     * 3. Call `storeService.searchProducts(query)` and return the result.
     *
     * Tip: This is useful when the AI needs to recommend or find matching items.
     */


    /**
     * === WORKSHOP TASK ===
     *
     * Expose a tool to place an order for a product.
     *
     * 1. Annotate the method with `@Tool`.
     * 2. Accept an `OrderRequest` object as input.
     * 3. Call `storeService.placeOrder(orderRequest)` and return the result.
     *
     * Hint: This should only be used after the user confirms a purchase.
     */


    /**
     * === WORKSHOP TASK ===
     *
     * Expose a tool to check the status of an order.
     *
     * 1. Accept a `String orderId` parameter (e.g., 1,2,).
     * 2. Call `storeService.getOrderStatus(orderId)` and return the result if found.
     * 3. If no result is found, return a new `OrderResponse` indicating it's not found.
     *
     * Tip: This helps the AI inform users about their order progress.
     */


    /**
     * === WORKSHOP TASK ===
     *
     * Expose a tool to return all products available in the inventory.
     *
     * 1. Annotate the method with `@Tool`.
     * 2. Call `storeService.getAllItems()` and return the result.
     *
     * Tip: This can be useful when the user wants to browse the full catalog.
     */


    /**
     * === WORKSHOP TASK ===
     *
     * Expose a tool to retrieve a user's details using their ID.
     *
     * 1. Annotate the method with `@Tool`.
     * 2. Call `userService.validateUser(userId)` and return the result.
     *
     * Tip: This can be useful to validate the buyer before placing an order.
     */


}

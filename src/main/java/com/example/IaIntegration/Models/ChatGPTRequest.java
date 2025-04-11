package com.example.IaIntegration.Models;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGPTRequest {
    
    private String model = "gpt-3.5-turbo";
    private String prompt;
    private int temperature = 1;

    @SerializedName(value="max_tokens")
    private int maxTokens = 100;
}

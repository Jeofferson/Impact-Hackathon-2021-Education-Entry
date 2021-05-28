package com.jeoffersondelapena.impacthackathon2021educationentry.data.repository;

import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.Message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ChatbotMessageRepository {
    public static int index = 0;
    public static final int CHATBOT_REPLY_DELAY_MULTIPLIER = 10;

    private static List<String> chatbotMessagesString = new ArrayList<>(Arrays.asList(
            String.format("Hello, I'm %s! What can I help with you today?", AuthorRepository.chatbot.getName()),
            "Sure, how are you feeling?",
            "I see how painful and sad your situation is right now. How long have you been experiencing a lack of sleep?",
            "It seems that you have an anxiety that falls under insomnia. Go immediately to a psychologist to give you a proper medication."
    ));

    public static Message getNewChatbotMessage() {
        Message message = new Message(
                String.valueOf(index + 1),
                chatbotMessagesString.get(index),
                AuthorRepository.chatbot,
                new Date()
        );

        if (index >= (chatbotMessagesString.size() - 1)) {
            index = chatbotMessagesString.size() - 1;
        } else {
            index++;
        }

        return message;
    }
}

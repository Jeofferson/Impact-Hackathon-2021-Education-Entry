package com.jeoffersondelapena.impacthackathon2021educationentry.ui.checkmentalhealth;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.Message;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.repository.AuthorRepository;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.repository.ChatbotMessageRepository;
import com.stfalcon.chatkit.messages.MessageInput;
import com.stfalcon.chatkit.messages.MessagesList;
import com.stfalcon.chatkit.messages.MessagesListAdapter;

import java.util.Date;

public class CheckMentalHealth extends AppCompatActivity {
    private MessagesListAdapter<Message> adapter;

    private MessageInput input;
    private MessagesList messagesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_mental_health);

        input = findViewById(R.id.input);
        messagesList = findViewById(R.id.messagesList);

        adapter = new MessagesListAdapter<>(
                AuthorRepository.user.getId(),
                null
        );
        messagesList.setAdapter(adapter);

        input.setInputListener(input -> {
            adapter.addToStart(new Message(
                            AuthorRepository.user.getId(),
                            input.toString(),
                            AuthorRepository.user,
                            new Date()
                    ),
                    true
            );
            addNewChatbotMessageToAdapter();
            return true;
        });

        ChatbotMessageRepository.index = 0;
        addNewChatbotMessageToAdapter();
    }

    private void addNewChatbotMessageToAdapter() {
        Message message = ChatbotMessageRepository.getNewChatbotMessage();
        new Handler().postDelayed(
                () -> adapter.addToStart(message, true),
                message.getText().length() * ChatbotMessageRepository.CHATBOT_REPLY_DELAY_MULTIPLIER
        );
    }
}
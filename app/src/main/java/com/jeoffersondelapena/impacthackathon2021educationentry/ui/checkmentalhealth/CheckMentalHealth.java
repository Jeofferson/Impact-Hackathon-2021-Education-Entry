package com.jeoffersondelapena.impacthackathon2021educationentry.ui.checkmentalhealth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.Author;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.Message;
import com.stfalcon.chatkit.messages.MessageInput;
import com.stfalcon.chatkit.messages.MessagesList;
import com.stfalcon.chatkit.messages.MessagesListAdapter;

import java.util.Date;

public class CheckMentalHealth extends AppCompatActivity {
    private MessageInput input;
    private MessagesList messagesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_mental_health);

        input = findViewById(R.id.input);
        messagesList = findViewById(R.id.messagesList);

        MessagesListAdapter<Message> adapter = new MessagesListAdapter<>("user-123", null);
        messagesList.setAdapter(adapter);

        input.setInputListener(input -> {
            adapter.addToStart(
                    new Message(
                            "message-456",
                            input.toString(),
                            new Author(
                                    "user-123",
                                    "Jeofferson"
                            ),
                            new Date()
                    ),
                    true
            );
            return true;
        });

        adapter.addToStart(
                new Message(
                        "message-123",
                        "Hello!",
                        new Author(
                                "user-789",
                                "Chatbot"
                        ),
                        new Date()
                ),
                true
        );
    }
}
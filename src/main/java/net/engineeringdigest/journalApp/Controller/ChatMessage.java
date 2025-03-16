package net.engineeringdigest.journalApp.Controller;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
	
	private String content;
	private String sender;
	private MessageType type;
}

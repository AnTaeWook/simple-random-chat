package simple.random.chatting.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chatting")
public class ChattingController {

  @GetMapping
  public ResponseEntity<String> getTopic() {
    return ResponseEntity.ok("/topic/test");
  }

}

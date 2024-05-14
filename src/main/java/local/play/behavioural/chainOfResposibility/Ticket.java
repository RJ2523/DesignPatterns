package local.play.behavioural.chainOfResposibility;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Ticket {
    private String issue;
    private String severity;
    private boolean isResolved;
    private String customerName;
    private LocalDateTime creationTime;
    private String comments;
}

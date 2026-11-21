package ie.atu.sample.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record BookingResponse
        (@NotNull(message = "Room ID is required")
@Positive(message = "Room ID must be positive")
Long roomId,

@NotBlank(message = "Organiser name is required")
@Size(min = 2, max = 60,
        message = "Organiser name must be between 2 and 60 characters")
String organiserName,

@NotNull(message = "Attendee count is required")
@Positive(message = "Attendee count must be positive")
int attendeeCount

) {
}

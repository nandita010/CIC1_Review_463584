package ie.atu.sample.dto;

public record CreateBookingRequest( Long id,
                                       Long roomId,
                                       String roomName,
                                       String organiserName,
                                       int attendeeCount,
                                       String status) {
}

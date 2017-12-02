import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
	this.birthDateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
	this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
	return birthDateTime.plusSeconds(1000000000L);
    }

}

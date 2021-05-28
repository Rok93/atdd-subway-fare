package wooteco.subway.station.application;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidDeletionException extends RuntimeException {

    public InvalidDeletionException() {
        super();
    }

    public InvalidDeletionException(String message) {
        super(message);
    }
}
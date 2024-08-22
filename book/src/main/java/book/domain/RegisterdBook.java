package book.domain;

import book.domain.*;
import book.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RegisterdBook extends AbstractEvent {

    private Long id;
    private String title;
    private String subTitle;
    private String author;
    private String publisher;
    private String status;

    public RegisterdBook(Book aggregate) {
        super(aggregate);
    }

    public RegisterdBook() {
        super();
    }
}
//>>> DDD / Domain Event

package book.domain;

import book.domain.*;
import book.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BorrowedBook extends AbstractEvent {

    private Long id;
    private Long bookId;
    private Long customerId;
    private Date borrowDate;

    public BorrowedBook(Borrow aggregate) {
        super(aggregate);
    }

    public BorrowedBook() {
        super();
    }
}
//>>> DDD / Domain Event

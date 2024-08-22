package book.infra;

import book.config.kafka.KafkaProcessor;
import book.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    BookRepository bookRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BorrowedBook'"
    )
    public void wheneverBorrowedBook_UpdateStatus(
        @Payload BorrowedBook borrowedBook
    ) {
        BorrowedBook event = borrowedBook;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + borrowedBook + "\n\n"
        );

        // Sample Logic //
        Book.updateStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor

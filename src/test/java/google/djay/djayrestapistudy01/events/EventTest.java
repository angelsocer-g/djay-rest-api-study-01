package google.djay.djayrestapistudy01.events;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {

    @Test
    @DisplayName("Event builder 테스트")
    void builder(){
        Event event = Event.builder()
                .name("event name")
                .description("event description")
                .build();
        assertThat(event).isNotNull();
    }

    @Test
    @DisplayName("Event javabean 테스트")
    void javaBean(){

        // Given
        Event event = new Event();
        String name = "event java bean";
        String description = "description~ java bean~ event~";

        // When
        event.setName(name);
        event.setDescription(description);

        // Then
        assertThat(event).isNotNull();
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);

    }



}
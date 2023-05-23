package ladder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PersonNameTest {

    @Test
    void 이름_5글자_입력() {
        assertThatCode(() -> new PersonName("abcde"))
                .doesNotThrowAnyException();
    }

    @Test
    void 이름_6글자_입력시_에러() {
        assertThatCode(() -> new PersonName("abcdef"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("5자를 초과할 수 없습니다.");
    }
}

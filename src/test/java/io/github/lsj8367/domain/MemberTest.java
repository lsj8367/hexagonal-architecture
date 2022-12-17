package io.github.lsj8367.domain;

import static org.assertj.core.api.Assertions.assertThat;
import io.github.lsj8367.domain.Member.Gender;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberTest {

    @Test
    @DisplayName("남성인지 여부 확인")
    void Should_returnTrue_When_MemberGenderIsMale() {
        Member member = new Member("email@test.com", "test", Gender.MALE);
        assertThat(member.isMale()).isTrue();
    }

    @Test
    @DisplayName("여성인지 여부 확인")
    void Should_returnFalse_When_MemberGenderIsFemale() {
        Member member = new Member("email@test.com", "test", Gender.FEMALE);
        assertThat(member.isMale()).isFalse();
    }

}

package io.github.lsj8367.port.in;

import io.github.lsj8367.application.in.MaleFilterUseCase;
import io.github.lsj8367.domain.Member;
import java.util.List;

public record MemberCliAdapter(
    MaleFilterUseCase maleFilterUseCase
) {

    public List<Member> maleList() {
        return maleFilterUseCase.maleMembers();
    }
}

package io.github.lsj8367.application.in;

import io.github.lsj8367.application.out.MaleFilterOutputPort;
import io.github.lsj8367.domain.Member;
import java.util.List;

public record MaleViewInputPort(MaleFilterOutputPort maleFilterOutputPort) implements MaleFilterUseCase {

    @Override
    public List<Member> maleMembers() {
        return maleFilterOutputPort.maleMembers();
    }

}

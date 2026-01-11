package org.nov25.library.dao.impl;

import org.nov25.library.dao.MemberDao;
import org.nov25.library.model.Member;

import java.util.List;

public class MemberDaoImpl implements MemberDao {
    @Override
    public int addMember(Member member) {
        return 0;
    }

    @Override
    public List<Member> getMemberList() {
        return List.of();
    }
}

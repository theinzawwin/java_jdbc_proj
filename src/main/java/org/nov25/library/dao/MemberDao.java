package org.nov25.library.dao;

import org.nov25.library.model.Member;

import java.util.List;

public interface MemberDao {

    int addMember(Member member);

    List<Member> getMemberList();
}

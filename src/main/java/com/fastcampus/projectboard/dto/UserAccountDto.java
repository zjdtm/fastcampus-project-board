package com.fastcampus.projectboard.dto;

import com.fastcampus.projectboard.domain.UserAccount;

import java.time.LocalDateTime;

public record UserAccountDto(
        Long id,
        String userId,
        String userPassword,
        String email,
        String nickname,
        String memeo,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime modifiedAt,
        String modifiedBy
) {
    public static UserAccountDto of(Long id, String userId, String userPassword, String email, String nickname, String memeo, LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy) {
        return new UserAccountDto(id, userId, userPassword, email, nickname, memeo, createdAt, createdBy, modifiedAt, modifiedBy);
    }

    public static UserAccountDto from(UserAccount entity) {
        return new UserAccountDto(
                entity.getId(),
                entity.getUserId(),
                entity.getUserPassword(),
                entity.getEmail(),
                entity.getNickname(),
                entity.getMemo(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getModifiedAt(),
                entity.getModifiedBy()
        );
    }

    public UserAccount toEntity() {
        return UserAccount.of(
                userId,
                userPassword,
                email,
                nickname,
                memeo
        );
    }
}



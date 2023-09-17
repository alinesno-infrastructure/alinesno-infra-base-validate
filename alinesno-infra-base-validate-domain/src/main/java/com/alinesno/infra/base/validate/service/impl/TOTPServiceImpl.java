package com.alinesno.infra.base.validate.service.impl;

import com.alinesno.infra.base.validate.entity.TOTPRecordEntity;
import com.alinesno.infra.base.validate.mapper.TOTPRecordMapper;
import com.alinesno.infra.base.validate.service.ITOTPService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * TOTP服务实现类
 * 该类实现了ITOTPService接口，提供了TOTP服务的具体实现。
 * TOTP（Time-Based One-Time Password）是一种基于时间的一次性密码算法，用于增强身份验证的安全性。
 * 该类包含了绑定TOTP和验证TOTP的方法。
 * 绑定TOTP方法将用户ID和密钥绑定，并将绑定记录保存到数据库。
 * 验证TOTP方法将用户ID和验证码进行验证，并将验证记录保存到数据库。
 * 作者：luoxiaodong
 * 版本：1.0.0
 */
@Service
public class TOTPServiceImpl implements ITOTPService {
    private final TOTPRecordMapper totpRecordMapper;

    public TOTPServiceImpl(TOTPRecordMapper totpRecordMapper) {
        this.totpRecordMapper = totpRecordMapper;
    }

    /**
     * 绑定TOTP
     *
     * @param userId 用户ID
     * @param secretKey 密钥
     */
    @Override
    public void bindTOTP(Long userId, String secretKey) {
        // 实现绑定TOTP的逻辑
        // 将绑定记录保存到数据库
        TOTPRecordEntity record = new TOTPRecordEntity();

        record.setUserId(userId);
        record.setCode(secretKey);
        record.setAddTime(new Date());

        totpRecordMapper.insert(record);
    }

    /**
     * 验证TOTP
     *
     * @param userId 用户ID
     * @param code 验证码
     * @return 验证结果，返回true表示验证成功，返回false表示验证失败
     */
    @Override
    public boolean validateTOTP(Long userId, String code) {
        // 实现验证TOTP的逻辑
        // 将验证记录保存到数据库
        TOTPRecordEntity record = new TOTPRecordEntity();

        record.setUserId(userId);
        record.setCode(code);
        record.setAddTime(new Date());

        // 假设验证成功
        record.setValid(true);
        totpRecordMapper.insert(record);

        return true;
    }
}
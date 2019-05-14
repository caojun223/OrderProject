package com.cao.service.impl;

import com.cao.mapper.ReceiptInfoMapper;
import com.cao.pojo.ReceiptInfo;
import com.cao.pojo.ReceiptInfoExample;
import com.cao.service.ReceiptInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReceiptInfoServiceimpl implements ReceiptInfoService {

    @Resource
    private ReceiptInfoMapper receiptInfoMapper;

    @Override
    public int countByExample(ReceiptInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ReceiptInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer receiptId) {
        return 0;
    }

    @Override
    public int insert(ReceiptInfo record) {
        return 0;
    }

    @Override
    public int insertSelective(ReceiptInfo record) {
        return receiptInfoMapper.insertSelective(record);
    }

    @Override
    public List<ReceiptInfo> selectByExample(ReceiptInfoExample example) {
        return receiptInfoMapper.selectByExample(example);
    }

    @Override
    public ReceiptInfo selectByPrimaryKey(Integer receiptId) {
        return receiptInfoMapper.selectByPrimaryKey(receiptId);
    }

    @Override
    public int updateByExampleSelective(ReceiptInfo record, ReceiptInfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(ReceiptInfo record, ReceiptInfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(ReceiptInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ReceiptInfo record) {
        return 0;
    }
}
